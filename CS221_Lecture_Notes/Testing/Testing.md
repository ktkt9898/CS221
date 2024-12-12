# Is my class a good implementation of my ADT
It is not possible to guarantee bug free code
Try to chip away something obvious

Recognizing ways that the ADT could change. Call every single method in the ADT to see if the change works.
Starting state to change state (or formally test case) to resulting state

Ex. Creating an empt list from no collection to constructor to [] empty list

Should be able to call available methods in the ADT/interface and get the expected results

Ex. Now test if add(A) results in [A]

# Test Planning - Start Simple
Start with the simplest change and work up to complex. If the constructor cannot work there is no way a large 500 element list will work.
Every set of tests reinforces that the previous set of tests are working.

# Test Planning - Boundary and Equivalence Cases
A good test suite includes all high risk test cases that mark significant transitions.

Ex. Array element out of bounds [n - 1]

Going from empty to having something containing and then going back to empty is a good boundary case.

No unique test is a waste of time

# SuperSimpleSet ADT
First learn the mental model, what are the methods available and what do they do

First instance of test should be calling the constructor

Starting state is no set, to change state (calling the constructor) and result state should be an empty set.

Ex. add(A) to no Exception, where we expect the method to not explode (the result state)

Every test is completely independent from other tests
Always start by recreating what we want to test (fundamental concept)
Never want tests corrupting other tests.

Now continuing by adding more complex tests.
Ex. From an set that contains [A]
add(A), duplicate but expect no Exception thrown, then throw away the object
add(B), expect no Exception thrown, then throw away the object
contains(A), expect true
contains(B), expect false (the contains(B) test is built on the [A} only scenario, recall every test is independent from others)
size(), expect 1 (again this test was built on the previous [A] scenario)

# Test-driven development (TDD)
Develop a test suite for an ADT, FIRST, before any implementation code
This prevents testing from getting crowded out at the end of the project

Only have test scenarios for change scenarios after something happens

# Scenarios that need to be tested with an IndexUnsortedList
Calling the constructor is the very first change that can be made.
- Change scenario/test case is when an empty list, for example, is created
- Atleast one test to check if the results of calling the method match the mental model of what an empty list looks like.

Now there is nothing in the list, so we cannot remove anything. Test adding values.

No one test is worth anything, but when they all operate together it gives safe confidence that the entire combination works.

A method for addToFront() should have four other methods, removeFirst, removeLast, remove(0), remove(Value) that also branch out and work together.

A boundary case for lists would be a 3 element list, which has very useful information to consider.

An equivalent case for lists would be 4 elements in a list, which has diminishing returns, some information is already covered.

# Designing a Test Plan: Choosing Case
All critical boundary cases must be included in the test plan, like the 3 element list that covers beginning element, middle element, and end element.

# Designing a Test Plan: Tests for Each Case
All methods must be tested for each change scenario/test case
Both valid and invalid method inputs must be tested where appropriate, such as in bounds and out of bounds indexes
Ask how this method acts if it works, and how it acts if it fails

# Implementing a Test Suite
It is best to use one class for testing purposes, so debugging is easier