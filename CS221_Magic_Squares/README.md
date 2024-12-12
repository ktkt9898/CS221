# ****************
* Project 1: Magic Square Matrix Warmup
* CS 221
* August 29th, 2024
* Kyle Truschel
# ****************

# OVERVIEW:
This program constructs a magic square matrix, where each values
in the row, column, forward diagonal lines, and
reverse diagonal lines all sum to the same value.

# INCLUDED FILES AND FOLDERS:
Testing Files - to be used in conjunction with the MagicSquaresTest.java file
    Note: All files in the folder MUST be in the same directory as the MagicSquaresTest.java
MagicSquare.java - source file
MagicSquareDriver.java - source file
MagicSquareInterface.java - interface file for method functionality in MagicSquare.java
MagicSquaresTest.java - tester file to ensure program runs properly
    Note: Files from the "Testing FIles" folder must be in the same directory in order to function
PLAN.md - planning and brainstorming file
README.md - this file

# COMPILING AND RUNNING
From the directory containing all included files, compile the driver class with the command:
# javac MagicSquareDriver.java

This program may also be ran in Visual Studio, if desired, with the same compiling instruction.

After compiling, the program can be ran in check mode or create mode
For check mode, type:
# java MagicSquareDriver -check <exact_file_name>
Where <exact_file_name> is as implied, the exact file's name with extensions, and
also exists in the same file directory as this program.
Then, an existing file will be checked to verify it's validity of being a magic
square.

Example:
# java MagicSquareDriver -check valid3x3
Where the file "valid3x3" exists in the same file directory as this program.
Print output could show:
The matrix:
    5
    11	18	25	2	9
    10	12	19	21	3
    4	6	13	20	22
    23	5	7	14	16
    17	24	1	8	15
is a magic square.

For create mode, type:
# java MagicSquareDriver -create <desired_file_name> <desired_matrix_size>
Where <desired_file_name> is as implied and <desired_matrix_size> will be the
square's dimensions
NOTE: The dimension size MUST be odd to function properly.

Example:
# java MagicSquareDriver -create MagicSquare1.txt 3
Will create a text file called "MagicSquare1.txt" with a 3 by 3 dimension matrix such as:
3
4 9 2
3 5 7
8 1 6

# KNOWN ISSUES
After compiling, the terminal may output that the java runtime environment is incompatible.
Ensure that you have the latest version of java installed to avoid this issue.

# PROGRAM DESIGN AND IMPORTANT CONCEPTS:
The MagicSquare class involves two constructors and five method signatures. 

The first constructor is primarily used to recieve an already existing magic square file. This involves receiving the file name as a String variable and passing it as a paramter into the first overloaded constructor. It then takes this string variable and converts it to a File type object. Then, using standard procedure, two Scanners will be opened onto the File as well as its lines to parse through its contents using a while loop, where as long as lines exist, the scanner will continue printing out the line.

The second constructor is used to create a new magic square matrix as a 2d array of integers, and then output its contents to a new file. Similarly, it receives a file name as a String variable and then passes this String variable to be used as a new File object. In addition, the constructor also requires an int parameter, which is used to determine the size of the matrix.

Two of the five method signatures are private, and are strictly used by the constructors.
    The first private method signature, is intended to retrieve integer values from a value and 
    assign those values as element positions in a 2d array
    The second private method signature is used to perform the magic square algorithm and assign values to a 2d array, and then using a file writing sequence to write the 2d array element values to a file.
The 3 other methods is one test to see if the values in the 2d array are valid as a magic square, one to return a copy of a 2d array to avoid breaking encapsulation, and the third is a functioning toString.
    The first method, isMagicSquare(), performs four separate for loops to check if the values at the row, column, forward diagonal, and reverse diagonal all sum up to the same value. So a 3x3 matrix would have its row, column, and diagonals all sum to 15.
    The second method, getMatrix(), takes a Magic Square object's 2d array, and returns a copy of the array to avoid breaking encapsulation.
    The third method, toString(), depends on the two previous methods to work, first by invoking the getMatrix, then invoking isMagicSquare on the matrix, and if isMagicSquare returns true, it will append string values to print out a neatly organized message that the Magic Square is in fact true and present its values, otherwise it will similarly print out the Magic Square is invalid and print out its values.

# DISCUSSION:
Since this was the first project after a bad CS 121 expierence and not much opportunity to learn more over the break, I had a bit of trouble. I was able to successfully create the first constructor, which simply prints out an already existing file, by following my projects from CS 121. I also rememberd how to write the "getMatrix()" method signature since I did pay close
attention on encapsulation exercises in CS 121. I had a bit of trouble getting the second overloaded constructor to function, but I found that the algorithm had to run first THEN it's elements could be written to a file
However, that's where I peaked since I was completely unfamiliar with running the program from the command line, since I believe only one example in CS 121 even covered this concept... most of the programs were being ran through visual studio.
I had a bit of trouble getting the "isMagicSquare()" method signature working because I tested it on the valid3x3 file, but the method kept returning row values as "45" instead of "15". At the Kount, a TA helped me run through the debugger and found I was accidently summing the row and columns seperately. The TA also showed me a trick in order to get the diagonal, both forward and reverse, to work by introducing a 3-way for loop for the reverse diagonal check.

# SOURCES:
Kount Learning Center troubleshooting and method implementations:
    Teaching Assistants Chase, Brady, Gabby, and Jacob

Check if elements stored at 2d array position exist:
    https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/