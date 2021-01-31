package knoldus.db

import com.knoldus.db.UserReadDto
import org.scalatest.FunSuite

class UserReadDtoTest extends FunSuite {
  val userReadDtoObject = new UserReadDto()

  test("Should return true if Riya exist"){
    assert(userReadDtoObject.getUserByName("riya") != None)
  }

  test("Should return true if Rahul exist"){
    assert(userReadDtoObject.getUserByName("rahul") != None)
  }

  test("Should return false if Sam does not exist"){
    assert(userReadDtoObject.getUserByName("Sam") === None)
  }
}
