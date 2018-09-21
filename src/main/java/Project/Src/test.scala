import com.typesafe.config._

import scala.reflect.io.File
object test {

  def main(args: Array[String]): Unit = {
    val confFileName = "test"
    val config = ConfigFactory.load(confFileName)
    val filelocation=config.getList("INSIGHTS")
    val filesize=filelocation.size()
    for (e <- 0 to filesize-1) {
      println(filelocation.get(e))
    }
  }
}
