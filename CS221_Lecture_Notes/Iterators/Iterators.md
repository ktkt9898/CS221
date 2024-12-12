# Iterable Collections
All collections in Java are required to be Iterable

Every type of collection is organized differently; abstraction
So every type of collection requires an Iterator class that is able to 
navigate the collection

Any collection can be used in a for-each loop

# Iterator Purpose
The primary purpose of an Iterator is to navigate through all elements of
a collection in a standardized way.
The Iterator will return the exact contents exactly once, no elements
will be left out.

A secondary purpose of an Iterator is to remove elements.

Scanners are String iterators for String input

Iterator default method next() returns the element and advances by one

The for-each loop converts to a while loop in the form:
Iterator<Type> itr = list.iterator();
while ( itr.hasNext() ) {
    Integer element = itr.next();
    System.out.println(element);
}

# Iterators for Universally Efficient Navigation
Iterators should always be able to find their place and used whenever
all values need to be accessed

Looping thru indexes is only efficient on array indexes; anything
else results in a quadratic growth factor

Iterators have the ability to remember positions

# Iterator visualized
Iterators act as a companion object
When the iterator is first created, it starts at the front of the first
element
Always moves forwards

# Fail fast and ConcurrentModificationException
Iterators promise to reliably return all contents of a collection
If any source, not including the remove() iterator method, is removed
after the iterator's process, it cannot guarantee the data is still valid