package info.eiel

class HelloWorld {
  def say: String = "Hello, World"
}

object HelloWorld {
  def main(args: Array[String]) : Unit = {
    println(HelloWorld.apply.say)
  }

  def apply: HelloWorld = new HelloWorld
}
