package knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.FunSuite

class CompanyValidateTest extends FunSuite {
  val companyValidatorObject = new CompanyValidator()
  val emailObject = new EmailValidator()
  val companyObject = new CompanyReadDto()
  test("Should return true if company does not exist in database and email is valid") {
    assert(companyValidatorObject.companyIsValid(companyObject.knoldusCompany)===true && emailObject.emailIdIsValid(emailId = "knoldus@gmail.com")=== true)
  }
}