# Searching
Comparisons/target location is typically made using equals(), but the compareTo() seeking a zero to show the two values
are alike.

# Generic Methods
If a generic type is expected as a return type, the extends tag is placed before the return type

# Linear Search
Start at the beginning and go until the value is found or reach the end to display nothing was found
Obviously, it is a linear runtime O(n)

The strengths is that it does not skip any values, and is guaranteed to find if the value exists
Definitely works

The weaknesses is linear runtime O(n), not the fastest

# Binary Search
If a list is in a known sorted order, such as ascending order
Start at the middle and compare the target to the middle element, if the target element is bigger (or even lucky it is the same value), the left half is not needed to search through, or if it is smaller the right half side is not needed to search through

Repeat the same algorithm (recursion), where the start was the previous middle half and again start from a new middle half and repeat
until the check is completed or if nothing was found.

This becomes a O(log n) runtime order (log base 2 specifically)

The weaknesses are the list to be searched must be sorted and the cost of sorting an unsorted list first, costs more than a linear search.

# Sorting
Typically fall into two categories:
Sequential (or quadratic) sorts utilize nested loops. Compares every object in a collection by comparing all other objects sequentially; go thru every element and compare it to every other element.
Look at all n elements and compare to all other n elements; results in O(n^2)
Pros are they are simple to understand and if the n is small they are decent enough.
Cons, cannot scale as efficiently as n becomes very large.

Logarithmic NOT binary search logartihmic but log-linear (n * log n) instead and are characterized by recursive divide and conquer algorithms.
As the input size increases their efficiency improves.

# Logarithmic Sort 1 - Quick Sort
Divide and conquer by choosing a sngle element to serve as a pivot element, all elements smaller than the pivot are placed into a left side list
and larger elements on the right side of the list
Then recursively, sort the left and right side again with the pivot element
Pivot element does not neccesarily have to be the middle value
When the divided lists are split, the left list is combined first, then the pivot, then the right list
