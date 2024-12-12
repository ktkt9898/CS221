# Strengths and Weakness of ArrayList
ArrayList cannot shift or remove as easily without doing O(n)
ArrayList can do index lookup as a strength, but searching will always be an O(n)

Only add or remove at the rear is O(1)
Also benefit for get, set since ArrayList uses indexing

ArrayList expansion often doubles when more space is required, this leads to memory waste.

addAfter and remove(element) are the worst methods because it involves a search and shift

get and set are the best methods since they are always O(1)

# Strengths and Weakness of Single Linked List
LinkedList requires the tracking of the actual node's stored element (object reference) and the next node reference, which results
in an order 2n memory footprint.

Single Linked List improves on adding to the front and the rear in constant time, since there exists a head and tail reference.

The Single Linked List addAfter is twice as fast as the Array List since it does not require a shift.

get and set become O(n) since indexing has been given up in favor of linking. Involves a search, a loop, so O(n)

removeLast is a burden because it involves searching up the previous node, since there is no pointer to the previous node.

# Strengths and Weakness of Double Linked List
Double Linked list requires the same 2n order but also a previous node reference, resulting in an order 3n memory footprint.

Overall, it is the the most effecient but cannot compete with ArrayList's indexing for set and get