# Interface "ADT" Implementation Separation
Recall a list interface defines the operations and expected behavior of a list, but does not specify how a list implementation will manage list elements internally.

# What if list elements are stored in an array?
Advantages:
Linear organization, easy to visualize
Big O(1) constant, very fast lookup by index

Disadvantages:
Arrays do not automatically move, grow, or shrink elements and costs Big O(n) time operations.

Standard library lists do not typically shrink. If more space is needed for an array, double the size

To keep track of the end of the array (not necesarrily the list elements) is to have a next available index instance, useful for addToRear() methods. Ex. int rear

An array-based list is possible with just an array variable and an int rear variable

# Using test subject class with a tester interface (ADT)
public class IUArrayList<T> implements ADT<T> {
    public static final int DEFAULT_CAPACIY = 10;
    private T[] array;
    private int rear;

    /** javadoc
    @SuppressWarnings("unchecked")
    public IUArrayList() {
        array = (T[])(new Object[DEFAULT_CAPACIY]);
        rear = 0;
    }

    /** javadoc
    @SuppressWarnings("unchecked")
    public IUArrayList(int initialCapacity) {
        array = (T[])(new Object[initialCapacity]);
        rear = 0;
    }
}

Since the ADT used a generic type, T, the test subject class should also attach a generic type

Instances variables should still be private, even in a test subject class. Constants can be public since they do not change with the final keyword.

Immediately after the instance variables, a constructor needs to exist to utilize the instance variables

A new list starting point should have size 10-100.

The root of all inheritance is the Object reference, so an array that holds Object should be casted to hold the generic type. This becomes a narrowing conversion.

The @SuppressWarnings("unchcked") is a flag that can be input above the constructor in this issue of conversion, even though it is required to be able to hold all types.

Rear will start as 0.

Sometimes a list will take in a given input capacity instead.

We want to avoid code duplication as much as possible. When multiple constructors exist the most detailed constructor should be used to call other constructors.
Ex.
    public IUArrayList() {
        this(DEFAULT_CAPACITY);
    }

This is the constructor that takes in no parameters, but calls "this" keyword on the constructor that does take in a default capacity. This reduces code duplication.

Getting back to the tester ADT, as soon as code can be ran the tester class should be ran. None of the methods should work at the beginning, as expected.

Methods that return information should be worked on first. They are crucial and the easiest to start with.

public int size() {
    return rear;
}

public boolean isEmpty() {
    return rear == 0;
}

public T first() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    return array[0];
}

Again, to reduce code duplication use the isEmpty() method first

public T first() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    return array[rear-1];
}

public int indexOf(T element) {
    int returnIndex = -1;
    int currentIndex = 0;

    while (returnIndex == -1 && currentIndex < rear) {
        // the '==' operater checks object address
        if (element.equals(array[currentIndex])) {
            returnIndex = currentIndex;
        }
            
        else {
            currentIndex++;
        }

    return returnIndex;
    }
}

A while loop is more efficient since it can break out the second the value is found.
A foor loop could be used, but it will search throughout the entire array.