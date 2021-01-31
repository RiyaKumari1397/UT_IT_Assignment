package knoldus.validator

import com.knoldus.db.EmployeeReadDto
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.FunSuite

class EmployeeValidateTest extends FunSuite {

  val employeeValidatorObject = new EmployeeValidator()
  val emailObject = new EmailValidator()
  val employeeObject = new EmployeeReadDto()
  test("Should return true if employee exists in database and emailID is valid") {
    assert(employeeValidatorObject.employeeIsValid(employeeObject.Employee1)===true && emailObject.emailIdIsValid(emailId = "knoldus@gmail.com")=== true)
  }
}