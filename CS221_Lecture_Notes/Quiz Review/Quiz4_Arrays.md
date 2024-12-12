# What is the runtime order (Big-O) for method foo() if list uses an array-based implementation?

public Integer foo( IndexedList  a ) { 
    Integer bar = new Integer(0);
        for( int x = 0; x < a.size(); x++ ) {
            bar += a.get(x) * a.get(x);
        }
    return bar;
}

O(n) because we must search each value (unknown so n variable), but the size is known (rear) and
get(x) is direct indexing/lookup so these remain constant

# Complete the following method from an array-based indexed list with instance variables T[] list and int rear. Assume no previously implemented utility methods.

public T remove(int index) {
    //check index
    if (index < 0 || index >= rear) {
        throw new IndexOutOfBoundsException();
    }
    //store element being removed
    T retVal = list[index];
    //shift elements

   // INSERT YOUR CODE HERE

    //update rear
    rear--;
    //return removed element
    return retVal;
}

Your Answer:

for (int i = index; i < rear - 1; i++) {
    // [1, 2, 3, (4), 5, 6, rear]
    list[i] = list[i + 1];
    // [1, 2, 3, 5, 6, 6, rear]

}

** do not forget to set to null to prevent memory leak

list[rear - 1] = null;