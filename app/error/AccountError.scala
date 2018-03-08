package error

sealed abstract class AccountError(val message: String) extends Throwable {
  val msg: String = message
}

object AccountError {
  final case object InvalidPassword extends AccountError("invalid password")
  final case object UserNotFound extends AccountError("user not found")
  final case object PasswordLocked extends AccountError("password locked")
  final case object DuplicatedEmail extends AccountError("duplicated email")
}
