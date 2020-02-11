
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/neha/NehaVerma/SunbirdKp/TestProj/Play2HelloWorld/conf/routes
// @DATE:Tue Feb 11 21:27:59 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
