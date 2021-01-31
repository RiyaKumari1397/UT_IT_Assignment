
  import org.scalatest.FunSuite;
  class emailTesting extends FunSuite{

    test("Should be valid if emailid is "){
      assert(email.emailValidator(email= "riya123@gmail.com"))
    }
    test("Should not be valid if emailid contains blank space"){
      assert(email.emailValidator(email= "riya123@  gmail.com"))
    }
    test("Should not be valid if emailid contains more than one dot"){
      assert(email.emailValidator(email= "riya123@gmail...com"))
    }
    test("Should not be valid if emailid does not contain @ symbol"){
      assert(email.emailValidator(email= "riya123gmail.com"))
    }
}
