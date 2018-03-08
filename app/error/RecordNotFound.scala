package error

class RecordNotFound(message: String = null, cause: Throwable = null)
  extends Exception(message, cause)
