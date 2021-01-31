package knoldus.db

import com.knoldus.db.CompanyReadDto
import org.scalatest.FunSuite

class CompanyReadDtoTest extends FunSuite(){

  val companyReadDtoObject = new CompanyReadDto()

  test("Should return true if Knoldus exist"){
    assert(companyReadDtoObject.getCompanyByName("Knoldus") != None)
  }

  test("Should return true if Tata exist"){
    assert(companyReadDtoObject.getCompanyByName("Tata") != None)
  }

  test("Should return false if Lenovo does not exist"){
    assert(companyReadDtoObject.getCompanyByName("Lenovo") === None)
  }
}