package util

import org.mindrot.jbcrypt.BCrypt

case class RawPassword(value: String) {

  def encrypt: String = Crypto.encrypt(this)

  def checkPassword(password: String): Boolean =
    Crypto.checkPassword(this, password)
}

object Crypto {

  def encrypt(rawPassword: RawPassword): String =
    BCrypt.hashpw(rawPassword.value, BCrypt.gensalt())

  def checkPassword(rawPassword: RawPassword, password: String): Boolean =
    BCrypt.checkpw(rawPassword.value, password)
}