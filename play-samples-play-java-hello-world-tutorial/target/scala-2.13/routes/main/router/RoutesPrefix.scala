// @GENERATOR:play-routes-compiler
// @SOURCE:/home/christophe/Downloads/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Wed Mar 04 16:59:56 WAT 2020


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
