package knoldus.db

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite

class EmployeeReadDtoTest extends FunSuite(){

  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true if Riya exist"){
    assert(employeeReadDtoObject.getEmployeeByName("riya") != None)
  }

  test("Should return true if Arun exist"){
    assert(employeeReadDtoObject.getEmployeeByName("arun") != None)
  }

  test("Should return false if Shreya does not exist"){
    assert(employeeReadDtoObject.getEmployeeByName("Shreya") === None)
  }
}