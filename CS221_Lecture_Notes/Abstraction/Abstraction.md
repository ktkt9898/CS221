# Overview
Abstraction is considered the fourth pillar of object-oriented programming and is the flipside of Encapsulation; cannot have one without the other.

Recall encapsulation, is that an object has a visibility modifier to ensure nobody on the outside can call/access directly. Can only access the object thru public methods.

tldr; control how someone interacts with inner data

Abstracts means you can interact my limited public interface WITH encapsulation.

# Real world abstraction
Similar to driving a car, not everyone needs to know how a car works or a calculator - do not care how it works internally.

Some familiar abstracts in Java are standard library classes based on only descriptions of what to expect, like Math, Scanner, System.out not necesarry to know how the inner code works.

# Object References are Abstractions
An object references do not hold the object, just the address. Recall that from polymorphism, the object reference just needs to be compatible; Animals m = new Cat(); for example.

An object references are themselves abstractions; do not necesarilly care how the object works.

The GUI components is a perfect example of Abstraction; do not necesarilly know how the pixels are displayed and are resized when dragged.

# Method Arguments are Abstractions
Formal paramters of methods are also abstractions.
Consider System.out.println( Object ) method

Just takes in an object reference (all objects have the toString method), and the println() method itself does not care what is passed in

# Interfaces Define Abstractions Well
Since interfaces specify a set of methods, only according to their descriptions and have no ability to dictate implementation, interfaces are abstractions; they are a list of methods

Documentation is critical to explaining the overall functionality of each method in an interface

Interfaces are all over real world code, the first topic to be designed in the interface (how is this object going to work and what methods will be used)

This boost productivity and allows modular programming, since programmers do not necesarilly need to know every single method, just as long as it claims to do what it says.

# Storage Example
Ex. of modular programs with interfaces:

/** A Storage contains any number of objects and returns them one at a time
public interface Storage {

    /** Add one Object to Storage
    public void add( Object o );

    /** Remove and return one Object from Storage
    public Object removeNext();
}

This code is missing what to expect on the removeNext() method if nothing exists (we don't know what to expect)

In a program requiring a Storage container, a Storage reference can be declared and assigned any object that implements Storage

Later if an alternative implementation is desired, the assignment statement can be updated and the rest of the program will continue to function without any changes necessary.

And still, if 10000 references to Storage exist, throughout the code will still work.