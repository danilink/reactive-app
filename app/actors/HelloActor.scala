package actors

import akka.actor.{Actor, Props}

case class Hello()
case class HelloResponse(response: String)

class HelloActor extends Actor {

  override def receive : Receive = {
    case Hello() => println("Hola")
    case Count() => sender ! CountResponse(1)
    case _  =>
  }

}

object HelloActor {
  def props = Props(classOf[HelloActor])
}
