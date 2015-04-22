package models

import org.scalatest.FunSuite
import dbconnection.Connector

class DAOTest extends FunSuite with Connector {
    val collection = connector()
    val dao = new DAO
    val tweet=Tweet("dsadadsadsad")
    test("insert data into MongoDB"){
      val res=dao.insertDoc(tweet)
      assert(res===true)
    }
}