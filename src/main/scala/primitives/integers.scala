package primitives

trait Integer {
  def increment:Integer
}

case object Zero extends Integer {
  override def toString = "0"
  def increment:Integer = new PositiveInteger(this)
}

case class PositiveInteger(previousInteger:Integer) extends Integer {
  override def toString = "1 + " + previousInteger.toString
  def increment:Integer = new PositiveInteger(this)
}