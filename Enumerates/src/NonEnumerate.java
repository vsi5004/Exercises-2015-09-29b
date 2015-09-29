/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class NonEnumerate {

  public static void main(String[] args) {
    NonEnumerate enumerates = new NonEnumerate();
    enumerates.start();
  }

  public void start() {
    Person instructor = new Person("Phil", Person.Role.TEACHER);
    Person student = new Person("Joe", Person.Role.STUDENT);
    System.out.println(instructor.toString());
    System.out.println(student.toString());
  }

}
