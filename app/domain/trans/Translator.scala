package domain.trans

trait Translator[Input, Output] {
  def translate(entity: Input): Output
}
