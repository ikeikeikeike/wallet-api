package error

sealed abstract class AccountError(val message: String = "") extends Throwable

object AccountError {
  final case object InvalidPassword extends AccountError("invalid password")
  final case object UserNotFound extends AccountError("user not found")
  final case object PasswordLocked extends AccountError("password locked")
  final case object DuplicatedEmail extends AccountError("duplicated email")
  final case class Unknown(override val message: String) extends AccountError
}
