package com.knoldus.db

import com.knoldus.models.{Company, User}


import scala.collection.immutable.HashMap

class UserReadDto {
  val user1: User = User("riya", 29, "knoldus","riya.kumari@knoludc.com")
  val user2: User = User("rahul",23,"Google","rahul12345@gmail.com")
  val users: HashMap[String, User] = HashMap("riya" -> user1, "rahul" -> user2)

  def getUserByName(name: String): Option[User] = users.get(name)

}
