# Abstract Data Type (ADT)
ADTs are the mental model for how data will be organized and accessed.
9/10 the content of ADTs are data structures - objects that organize other objects like a list, array, or arraylist.

# Stack: a simple linear ADT
A fundamental abstraction and its mental model can be a stack of books.
Similar in Java, the most recent method call is at the top and appropriately should finish first (add and remove from the top without problem)
Vertical data structure that does not branch (linear) only interact at the top.

public interface StackADT<E> {
    public void push (E element);

    public E pop ();

    ...
}

Again, these methods in the interface need documentation (the overall mental model)

# Queue: another linear ADT
Similar to a stack, we define methods using an interface.

Unlike a stack, a queue is less well defined.
There exists methods to add, remove, and look to the queue.
Add/Offer() and Remove/Poll() are the most common methods for propagating the queue.

Ex.

queue.add ( 1 );
(front) 1 (rear)
queue.add ( 2 );
(front) 1 2 (rear)
queue.remove
(front) 2 (rear)

A queue is a first in first out model.

The java runtime environment keeps track of methods using stacks

A queue is used during a computer lab environment for print assignments.

Webpage access also uses a processing queue thru HTML

# List: flexible, general purpose ADT
3 common types
sorted: always in some inheren order, automatic insertion in the right location
unsorted: no inherent order and can work from either end, insert after a known element or remove by identity
indexed: directly access elements by their location in the list (what is the 5th element?)

Sorted lists are almost always custom created since there exists many way to sort things

An unsorted list CAN become a sorted list. Classic unsorted methods do not assume any position knowledge. (not saying go to the fifth position and do this but rather find "C" and add something after it)

Indexed positions start at zero elements start at one.

reccomend to read the collection and list interface