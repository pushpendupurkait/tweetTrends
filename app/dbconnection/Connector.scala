package dbconnection

import reactivemongo.api.MongoDriver
import reactivemongo.api.collections.bson.BSONCollection
import scala.concurrent.ExecutionContext.Implicits.global

trait Connector {
  /**
   * This function take the database configuration from application.conf and make connection to collection table1 of rmongo database
   * @return BSONCollection type of object
   */
  def connector(): BSONCollection = {
    val driver = new MongoDriver
    // Gets a reference to the database
    val connection = driver.connection(List("localhost"), nbChannelsPerNode = 5)
    val db = connection("rmongo")
    val coll = db("table1")
    coll
  }
}