package data.store.db

import data.entity.RecordNotFoundException
import play.api.db.slick.DatabaseConfigProvider
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

import scala.concurrent.Future


trait Findable[A, B] {
  import scala.concurrent.ExecutionContext.Implicits.global

  def find(id: B): Future[Option[A]]
  def get(id: B): Future[A] = find(id).map { c => c.getOrElse(throw new RecordNotFoundException) }
}

trait DBStore {
  val dbConfigProvider: DatabaseConfigProvider
  val dbConfig: DatabaseConfig[JdbcProfile] = dbConfigProvider.get[JdbcProfile]
  val db = dbConfig.db
}

