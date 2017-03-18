package primitives

trait Boolean {
  def negate:Boolean
  def equal(other:Boolean):Boolean
  def operationThatAlwaysIsTrue:Boolean = True
  def or(other:Boolean):Boolean
}

case object True extends Boolean {
  override def toString = "true"
  def negate = False
  def or(other:Boolean):Boolean = true
  def and(other:Boolean):Boolean = other
  def equal(other:Boolean):Boolean = other match {
    case True => True
    case False => False
  }
}

case object False extends Boolean {
  override def toString = "false"
  def negate = True
  def or(other:Boolean):Boolean = other
  def and(other:Boolean):Boolean = false
  def equal(other:Boolean):Boolean = other match {
    case True => False
    case False => True
  }
}

