import play.api.{ Configuration, Environment }

class Module extends play.api.inject.Module {

  def bindings(environment: Environment, configuration: Configuration) = {
    Seq.empty
  }
}
