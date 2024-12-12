/*
 * Inheritance sets up for polymorphism
 * 
 * Object variable types are reference types; exists somewhere in memory
 * Ex. Point p = new Point (3, 4);
 * This creates a blueprint including variables and methods in the variable,
 * and the variable is the memory address of the object
 * 
 * This is called late binding or dynamic, where the object reference waits up
 * to the moment where say a method, dot, is called upon.
 * 
 * When the class constructor is called, the object type is created in
 * memory.
 * However, an object constructor does not necesarilly have to be the same
 * type compared to the left, just compatible (where the class
 * extends or is a child inherited)
 * 
 * Ex. public class Dog extends Mammal {
 *      Mammal m = new Dog();
 *      m.speak();
 * }
 * 
 * And m reprefences the object in memory with late binding.
 * 
 * Ex. m = new Cat();
 *      m.speak();
 * 
 * The m refernce is now overwriten by the cat Class
 * 
 * Notice how the two classes are child classes of Mammal but have 
 * different methods. Poly = many, morphic, change into something else
 * 
 * Limitations is the reference type, Mammal, determines what is available
 * If a fetch() method and bark() were added to the Dog class, then
 * not all Mammal child classes will be able to access.
 * This is when polymorphism is not utilized, when desiring specialized
 * methods for a specific Dog, Cat, etc class
 * 
 * ANother benefit of polymorphism is the ability to use a for-each
 * loop through a collection, like a 1d array, since child classes
 * belong to a common parent Class, like
 * Ex. Mammal[] mammalChoir = new Mammal[3];
 * mammalChoir[0] = new Dog();
 * mammalChoir[1] = new Cat();
 * for (Mammal m : mammalChoir) {
 *      m.speak();
 * }
 * Where the Dog and Cat classes will pass their specific speak() method
 * 
 * For UML diagrams, a dotted line indicates an "implements" for the class
 * and a solid line indicates an "extends" for the class
 * 
 * The array type extends an "iterable" class which is how
 * a for-each loop can parse through many types (doesnt matter
 * what type of collection, just as long as it is accesible)
 * 
 * The toString() is a polymorphic method and will print out, no matter
 * what type, and this is why objects will print out memory addresses
 * (reference type)
 * 
 * This is also why button listeners implement ActionListener is an example
 * of polymorphism, doesn't care what its name is just that it IS A
 * ActionListener
 * 
 * TLDR;
 * An object reference can be assigned any comapitble object
 * The reference type, variable, limits what methods you can call, but the object at
 * the other end determines what the method will do
 * Also due to late binding, a method will not execute immediately
 */