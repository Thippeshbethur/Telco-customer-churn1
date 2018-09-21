package Project.Src

object Calling {
  def main(args: Array[String]): Unit = {
    println("1.Service based churn ")
    var choice=readLine("Enter the choice \n")
    choice match {
      case "1"=>Service11.main(args)
    }
  }
}
