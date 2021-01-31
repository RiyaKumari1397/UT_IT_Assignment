package com.knoldus.db
import com.knoldus.models.{Company, Employee}
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val Employee1: Employee = Employee("riya","manohar", 29,15000, "Trainee","Knoldus","riya.kumari@knoludc.com")
  val Employee2: Employee = Employee("arun","milan", 36,65000, "IT Officer","Tata","arunmilan@gmail.com")
  val employees: HashMap[String, Employee] = HashMap("riya" -> Employee1, "arun" -> Employee2)

  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
