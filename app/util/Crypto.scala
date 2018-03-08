package util

import org.mindrot.jbcrypt.BCrypt

case class RawPassword(value: String) {
  def encrypt: String = Crypto.encrypt(this)
  def checkPassword(password: String): Boolean =
    Crypto(password).checkPassword(this)
}

case class Crypto(value: String) {
  def checkPassword(rawPassword: RawPassword): Boolean = {
    BCrypt.checkpw(rawPassword.value, value)
  }
}

object Crypto {
  def encrypt(rawPassword: RawPassword): String = {
    BCrypt.hashpw(rawPassword.value, BCrypt.gensalt())
  }
}