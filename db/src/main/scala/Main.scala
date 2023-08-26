import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  override def run: IO[Unit] = ???

  /*
  override def run: IO[Unit] =
  {
    for
      topicDefinitions  <- createTopicDefinitions()
      connection        <- createConnection()
      topicListeners    <- createListeners(topicDefinitions)
      dbSession         <- getDbSession()
      httpController    <- createController()

      message           <- topicListeners
      _                 <- handle(message)
  }

  def handle(message: MessageType): IO[Unit] = {
    message match
      case GetRestaurants => GetRestaurantsService(message)
      case SaveOrders     => SaveOrdersService(message)
      ...
  }



  trait Message =
  {
    val messageType
    val data:
  }

   */



}