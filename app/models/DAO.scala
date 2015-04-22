package models

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration.DurationInt

import dbconnection.Connector

class DAO extends Connector with App{

  val collection = connector()
  
  def insertDoc(tweet:Tweet):Future[Boolean] = {
    val future = collection.insert(tweet).map { lastError => lastError.ok }
    Await.result(future, 5.seconds) 
    future
  }
}