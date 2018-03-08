package domain.trans

trait Translator[Input, Output] {
  def translate(entity: Option[Input]): Option[Output]
  def translate(entity: Seq[Input]): Seq[Output]
  def translate(entity: Input): Output
}
