object email {
  val email = "^[_A-Za-z0-9]+@"+"[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
  def emailValidator(email: String): Boolean = email.matches(email)
}
