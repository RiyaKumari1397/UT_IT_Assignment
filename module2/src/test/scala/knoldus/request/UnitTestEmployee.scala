package knoldus.request

import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.mockito.MockitoSugar.{mock, when}

class UnitTestEmployee extends org.scalatest.AsyncFlatSpec {
  val emp= Employee("riya","manohar", 29,15000, "Trainee","Knoldus","riya.kumari@knoludc.com")

  "An Employee's company name " should " present in database" in {
    val mockedEValidator = mock[EmployeeValidator]
    when(mockedEValidator.employeeIsValid(emp)) thenReturn true

    val empimpl = new EmployeeImpl(mockedEValidator)

    val res = empimpl.createEmployee(emp)
    assert(!(res.isEmpty))
  }
  "Employees email id " should "have a valid email address" in{
    val emailvalid=new EmailValidator
    assert(emailvalid.emailIdIsValid(emp.emailId))
  }
}
