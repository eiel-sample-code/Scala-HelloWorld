package info.eiel

import org.scalatest.{ DiagrammedAssertions, FlatSpec }

class HelloWorldSpec extends FlatSpec with DiagrammedAssertions {

  it should "Hello, World" in {
    assert(HelloWorld.apply.say == "Hello, World")
  }
}
