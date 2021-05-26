class Utils {

  def acceptVarargs[S](s: S*): Unit = {}
  def toVarArgs[T](s: Seq[T]) = acceptVarargs(s: _*)
}
