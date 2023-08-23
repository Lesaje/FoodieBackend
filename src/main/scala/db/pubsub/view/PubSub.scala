package db.pubsub.view

trait PubSub {
  def pull (): Unit
  def push (): Unit
}
