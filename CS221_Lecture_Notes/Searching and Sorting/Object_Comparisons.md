# Object Equality
Could mean "are they the same alias in memory" ==
Or could mean, specific with searching, if they look alike .equals()

For searching and sorting we are almost always asking the equivalence questions, or the .equals() method

# Comparable: Defining Natural Order
Natural Order: the most common or obvious order
1 1 3 3 4 5 6 7 8 8...

Comparable interface defines a natural order via int compareTo()
returns an integer value with the relative ordering between two objects
the number itself is mostly meaningless, but the sign (- or +) is the important piece

If object 2 comes first from 1, then a positive value is prompted.
Negative means the first object comes first
Zero indicates equivalent

When writing a comparable method, the .equals method should also be rewritten/overrided and will return
true under the same circumstances where compareTo returns 0
Similar to every class having a toString method

Comparable has compareTo with natural ordering

# Comparator: Alternative Ordering
Sorting other than a natural order, comparator has the compare method
The outputs are the same, 0 is equal, negative meant object 1 comes first, positive meant object 2 comes first

Comparator has compare with no specific ordering