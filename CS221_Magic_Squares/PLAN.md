# TASK OVERVIEW
The objective of this project is to produce a "magic square" that has each of the row, column, and diagnol values all sum to the same value. An algorithm to produce such output has been given and I need to allow the program to print an existing magic square and create a new magic square given an integer input. I will also need to have methods that can output the constructors, from the toString method, return a copy of the matrix array, and return a true/false to see if a magic square matrix does sum to all the same values

# INDIVIDUAL TASKS
1. Create two constructors, one will be used to print out an already existing magic square from a file and the second will take in a filename and integer value to construct a magic square matrix and write the values of the matrix to a file.
2. Create three methods, one that will return a true/false value if a magic square matrix does in fact sum to all the same values, one that will return a copy of a magic square matrix, and one that will act as toString method to output a readable result to the terminal.
3. Ensure the program can be ran outside of VS code using string arguments from a terminal

# INDIVIDUAL TASK BREAKDOWN
1. I can create the first constructor by having a single parameter that takes in a String name and will later convert into a File type object. Using scanners, I can scan through each individual line and output the results.
1.1 The second constructor will similarly take in String name and an int size value to create a new magic square matrix and write the contents to a new file.
2. The first method will be a boolean that will parse through the rows and columns and check to see if their sum is the same value. A formula has been given to me that I can use to compare a count value against.
2.1 The second method will return a copy of the magic square matrix. This will need to enforce encapsulation, so I will need to essentially make a new 2d array that copies over the values of the original 2d array, the magic square matrix.
2.2 The last method is a toString method. This will need to first check if the boolean value returns true or false in order to inform the terminal if the magic square correctly sums to all the same values. Thankfully, most of the heavy lifting is done by the first method, and if passed I can append the values in the matrix to an output message.
3. This step I am most unsure, since in my previous CS class, we rarely touched this topic and ran most code from VS code. I will likely need to attend the learning center for assistance.

# TESTING PLAN
I will first start by ensuring the constructors are working properly, that is taking an already existing file and ensuring this first overloaded constructor can output the values. The second overloaded constructor will need to create a new magic square object and write its newly created matrix to a file.
Next, I will begin working on the methods to ensure more information can be provided to the user, such as if the magic square object is in fact properly summing all values.
I will also utilize the MagicSquaresTest file given to us to ensure all possible cases can be properly addressed.