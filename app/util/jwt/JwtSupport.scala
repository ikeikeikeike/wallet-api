package util.jwt

import io.jsonwebtoken.{ExpiredJwtException, MalformedJwtException, _}
import javax.crypto.spec.SecretKeySpec

import scala.collection.JavaConverters._
import scala.collection.mutable
import scala.util.Try
import scala.util.control.Exception._

object JwtSupport {
  private val KEY = "walletapi"
  private val buildKey = new SecretKeySpec(KEY.getBytes, SignatureAlgorithm.HS256.getJcaName)

  def decode(v: String): Option[Claims] = {
    Try(
      catching(classOf[MalformedJwtException], classOf[ExpiredJwtException]) opt {
        Jwts.parser().setSigningKey(buildKey).parseClaimsJws(v).getBody
      }
    ).toOption.flatten
  }

  def createClaims(v: mutable.Map[String, AnyRef]): Claims = {
    Jwts.claims(v.asJava)
  }

  def encode(claims: Claims): String = {
    Jwts.builder()
      .setClaims(claims)
      .compressWith(CompressionCodecs.DEFLATE)
      .signWith(SignatureAlgorithm.HS256, buildKey)
      .compact()
  }
}

