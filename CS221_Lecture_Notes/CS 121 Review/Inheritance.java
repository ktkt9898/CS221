/*
 * Inheritance is code reuse, build on code that has already been developed
 * and tested
 * 
 * Minimizes code duplication, prevent bugs,
 * and sets up for Polymorphism
 * 
 * Inheriting involves an old class and a new class, that is created
 * 
 * In the class header, for the new class, the keyword extends is used
 * Now, without writing a single new line, the NewClass starts
 * with every variable and every method of the OldClass
 * 
 * Ex. public class NewClass extends OldClass {}
 * 
 * This is called explicit inheritance
 * 
 * Implied Object Inheritance, will extend a class called Object
 * It is the root of all classes
 * This is why every class starts with a toString() and other
 * universal method classes.
 * 
 * Inheritance is also known as a "Is-a" Model
 * The Inheritance has a line with an arrow
 * 
 * Ex. class Dog is-a class Mammal, is-a everything a mammal class
 * 
 * Java is single inheritance, a class can only have one ancestor/parent
 * and can only extend one class.
 * 
 * Inherited public data and methods are visible.
 * A class inheriting private data exists, but is not accessible directly
 * by name
 * 
 * Protected is a visiblity modifier means the Child class can see
 * the private/encapsulated data
 * 
 * Private is still the best data modifier to ensure encapsulation
 * 
 * A child class will not inherit constructors.
 * The super keyword can call the parent's constructor code
 * 
 * Variables should always be initialized in the parent constructor code
 * 
 * Somtimes inherited methods are desired to be customized, such
 * as the toString() method which only prints out memory addresses
 * 
 * Overriding Methods uses the same exact method signature/name and 
 * hides the old method
 * The old version, similar to the old constructor code, can be
 * accessed using the super keyword
 * 
 * Inheritance can also be done with Interfaces, it contains
 * all method signatures but no code
 * It will start with all method signatures from the Old class
 * Even with duplicated method signatures, it will not cause
 * debugging errors
 * It is essentially a list of methods without functionality
 * 
 * An Abstract Class is a hybrid between an Interface/unfinished methods
 * and a concrete fully-defined class.
 * Its purpose is to be the parent for the related child class
 * The keyword syntax follows
 * public abstract class ClassName {}
 * 
 * This flags the class to ensure the program cannot called the
 * constructor, where the child class can call the abstract parent
 * class using the super keyword
 * 
 * Similar to biology with the concept of a Mammal relating to a Dog
 * Nobody refers to a Mammal, whereas everyone understands what makes
 * a Dog; it has meaningful definition whereas a Mammal has some
 * abstract concepts
 * 
 * Limiting Inheritance can be done using the final keyword
 * The final keyword can be used in front of a method signature so a child
 * class cannot modify the method
 * If final is placed in Class, it will be locked and no child classes
 * can inherit
 * 
 * Final is incompatible wih the keyword abstract
 */
