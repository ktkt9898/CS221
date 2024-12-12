# Recursion
A contrast to iterative solutions, like loops
Repeat some process a certain, or unlimited (while), times

Recursion is a different approach to solving problems without using loops by using pattern recognition

A recursive definition has two parts:
A base/simple case, like a single element list; as small as we can get
Recursive part is somewhat abstract, but it reuses itself as its own definition

# Foundation
Base case is the stopping part
Without a base case there is no way to end a recursion, similar to an infinite loop

# Recursion in Math
A factorial is an example of recursion, (N!)
Decrement and multiply until 1 (technically 0!)

# Recursive Methods
Methods can call themselves
Each recursive call should be a simpler version of the problem, getting close to the base case
The call stack stores all the partial solutions until the base case is reached, as methods are removed from
the call stack, the total solution is assembled.

Ex.

public int sum(int num) {
    int result;
    if (num == 1) {
        result = 1;
    }
    else {
        result = num + sum(num - 1);
    }
    return result;
}

The base case is the if statement, num == 1 and the else statement recursively calls sum again until the base case is reached

All recursive algorithms check if the inputs looks like the base case
If so, return the base case or specific answer. There can exist more than one base case, like out of bounds checking
Else, recursively apply the algorithm/steps to one or more smaller versions (deconstruction) until the base case is reached
Then, combine the solutions to the smaller problem to get the solution to the original (reconstruction)

# Indirect Recursion
Often completely avoidable, involves multiple steps before the recursion actually begins
It is best to rewrite using a master class that calls subroutines

Ex. m1() -> m2() -> m3() can be rewritten as

master() {
    m1();
    m2();
    m3();
    master();
}

# Recursion vs Iteration
Every problem that can be solved recursively can also be solved iteratively
Recursive solutions have the overhead of multiple method invocations and may be less efficient,
However, some problems are more easily and elegantly expressed recursively
First priority is always correctness
Second priority is readability, not neccesarily fast
    Compromise in clarity is allowed for specific tasks however

# Extra
Base cases can be as many as desired