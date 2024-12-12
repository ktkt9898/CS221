/*
 * The first big idea of OOP is encapsulation
 * 
 * Protects the data or
 * identity information, instance variables, at 
 * the top of the class
 * 
 * Ex: Student class has name, ID, address, major, GPA
 * Ex: BankAccount class has accountNumber, owner, balance
 * 
 * for (Account acc : accounts) {
 *      acc.balance = 0;
 * }
 * 
 * Nothing protects the critical information for the object,
 * Acccount
 * 
 * Visibility modifiers, public and private, are placed
 * before an instance variable
 * 
 * Public allows someone on the oustide to see the variable
 * Private ensures encapsulation
 * Some methods are public to allow interaction
 * 
 * Visiblity of variables and all internal support methods
 * should be private.
 * Only methods intended to be called by outside users should
 * be public.
 * 
 * Ex. public void deposit(double amtToAdd) {}
 * 
 * Getters and setters allow methods to retrieve the data
 * 
 * Encapsulation refers to visiblity and scope
 * 
 * Scope is the boundary of the class or objects created with the
 * class
 * 
 * Ex. public class Student {
 *      // The scope of String name is inside the class Student
 *      private String name;
 * 
 *      // this.name refers to the locally passed in String name
 *      // and its scope is inside the curly braces of the
 *      // Student method
 *      public Student(String name) {
 *          this.name = name;
 *      }
 * }
 * 
 * The way to access private variables is thru getters and setters
 * A getter method responds with the value of a variable, BUT
 * does not change the variable
 * Ex.
 * public int getSize() {return size;}
 * 
 * A setter method will update the private variable
 * Ex.
 * public void setSize(int newSize) {}
 * 
 * this.variable references back to the private variables but
 * assignes the method paramater (input to a method)
 */