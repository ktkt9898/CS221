import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 * @author Kyle Truschel
 * 
 *         This Class contains necessary constructors and method signatures
 *         to create a Magic Square object and validate an already existing
 *         Magic Square (from file name)
 */

public class MagicSquare implements MagicSquareInterface {
    // Instance variable(s)
    private int[][] matrixMagicSquare;

    // Constructors
    /**
     * @param fileName takes in desired file name as parameter
     *                 The first overloaded constructor invokes the readMatrix
     *                 method
     *                 which takes in a string name, converts to a file, and
     *                 attempts
     *                 to parse thru the integer data within a valid file, and
     *                 assign
     *                 the integers to a 2d array.
     */
    public MagicSquare(String fileName) throws FileNotFoundException {
        readMatrix(fileName);
    }

    /**
     * @param fileName takes in a String value from args[1], intended to be the
     * file's name
     * @param inputSizeMagicSquare takes in an int value from args[2], intended to be
     * the matrix's dimensions
     *                    The second overloaded constructor first takes in a file
     *                    name as a String and
     *                    a desired dimension size. It creates a new 2d array object
     *                    of the given
     *                    dimension size. Then, it invokes the writeMatrix method,
     *                    which first
     *                    uses an algorithm to construct a magic square (where all
     *                    values
     *                    sum to the same amount) and file write the 2d array to a
     *                    brand new
     *                    file.
     */
    public MagicSquare(String fileName, int inputSizeMagicSquare) throws IOException {
        int sizeMagicSquare = inputSizeMagicSquare;
        matrixMagicSquare = new int[sizeMagicSquare][sizeMagicSquare];
        writeMatrix(matrixMagicSquare, fileName);
    }

    // Setters and getters
    /**
     * @param fileName takes in a String value, retrieved from the first overloaded constructor
     * @throws FileNotFoundException throws a FileNotFoundException if not successful
     *                   This is a private method intended to be called on the first
     *                   overloaded constructor,
     *                   and peforms a file reading sequence to retrieve values
     *                   within a value, and assing them
     *                   as integer element values in a 2d array.
     */
    private int[][] readMatrix(String fileName) throws FileNotFoundException {
        String inputFileName = fileName;

        File retrieveFile = new File(inputFileName);

        Scanner fileScanner = new Scanner(retrieveFile);

        // Identify what a line is
        String line = fileScanner.nextLine();

        // All files should have the dimension on the first line,
        // So retrieve the start size from the first line
        int startSize = Integer.parseInt(line);

        matrixMagicSquare = new int[startSize][startSize];

        for (int row = 0; row < startSize; row++) {
            for (int col = 0; col < startSize; col++) {
                line = fileScanner.next();

                // Identify what a number value is
                int number = Integer.parseInt(line);
                matrixMagicSquare[row][col] = number;
            }
        }

        fileScanner.close();

        return matrixMagicSquare;
    }

    /**
     * @param matrix 2d array of integers that was retrieved from second overloaded constructor's
     * integer input
     * @param fileName String value
     * @throws IOException throws an IO exception if unsuccessful
     *                     This is a private method intended to be called when the
     *                     second overloaded constructor
     *                     is called, the constructor that takes in an integer value
     *                     and a desired file name as a
     *                     string.
     *                     First performs the magic square algorithm and assigns the
     *                     values to a 2d array.
     *                     Then, a file writing sequence is used to parse thru the
     *                     values within the 2d array
     *                     and write it's contents to a file.
     */
    private void writeMatrix(int[][] matrix, String fileName) throws IOException {
        // Take the same input parameter and assign it to the private
        // String variable, inputFileName
        matrixMagicSquare = matrix;
        String createFileName = fileName;

        // Identify size from matrix length
        int sizeMagicSquare = matrixMagicSquare.length;

        // Magic Square Algorithm
        // Declare two row and col integers
        int row;
        int col;

        // Set row to be input size - 1
        row = (sizeMagicSquare - 1);

        // Set column to be input size / 2
        col = (sizeMagicSquare / 2);

        // Variable to create the input parameter squared^2
        int inputSquared = sizeMagicSquare * sizeMagicSquare;

        // Declare an oldRow and oldCol variable to be used later
        int oldRow;
        int oldCol;

        // Start from i = 1 up to and including the input value
        // squared to avoid an index out of bounds error
        for (int i = 1; i <= inputSquared; i++) {
            matrixMagicSquare[row][col] = i;

            // Assign oldRow to row and oldCol to col
            oldRow = row;
            oldCol = col;

            // Increment row and column
            row++;
            col++;

            // Conditional statements
            // If row is the same as the input parameter, assingn row to be 0
            if (row == sizeMagicSquare) {
                row = 0;
            }
            // If col is the same as the input parameter, assing column to be 0
            if (col == sizeMagicSquare) {
                col = 0;
            }

            // Check the value stored at the location [row][col]
            // and if the element exists or does not equal 0 (for primitives)
            // perform the conditional below
            if (matrixMagicSquare[row][col] != 0) {
                row = oldRow;
                col = oldCol;
                row--;
            }
        }

        // Now write the magic square matrix/2d array to a file
        try {
            // Take the input string and convert it to type file
            File checkFileName = new File(createFileName);

            FileOutputStream outputStream = new FileOutputStream(checkFileName);

            PrintWriter writeToNewFile = new PrintWriter(outputStream);

            // PrintWriter prints the first line to be the size of the matrix
            writeToNewFile.println(sizeMagicSquare);

            for (int i = 0; i < matrixMagicSquare.length; i++) {
                for (int j = 0; j < matrixMagicSquare[i].length; j++) {
                    writeToNewFile.write(matrixMagicSquare[i][j] + " ");
                }
                // Make a new line after the first line has finished
                writeToNewFile.println();
            }

            writeToNewFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file. Please re-check spelling.");
        }
    }

    /**
     *                      Performs four separate test to calculate the numerical
     *                      values contained
     *                      in the 2d array, the magic square matrix, to sum up to
     *                      the same value and compare
     *                      to a valid total formula.
     *                      For instance, all the rows, columns, forward diagonal
     *                      lines, and reverse diagonal lines
     *                      should sum up to the same value WHILE also not
     *                      duplicating values (a magic square
     *                      should contain values of 1, 2, 3, 4... and so on)
     */
    @Override
    public boolean isMagicSquare() {
        // Formula for the size of the magic square
        int size = matrixMagicSquare.length;
        int validTotal = (size * ((size * size) + 1)) / 2;

        // Check for horizontal lines, rows
        for (int row = 0; row < size; row++) {
            int horizontalCount = 0;
            for (int col = 0; col < size; col++) {
                horizontalCount += matrixMagicSquare[row][col];
            }
            if (horizontalCount != validTotal) {
                return false;
            }
        }

        // Check vertical lines, columns
        for (int row = 0; row < size; row++) {
            int verticalCount = 0;
            // The j variable represents the columns
            for (int col = 0; col < size; col++) {
                verticalCount += matrixMagicSquare[col][row];
            }
            if (verticalCount != validTotal) {
                return false;
            }
        }

        // Check forward diagonal lines
        int forwardDiagonalCount = 0;
        for (int i = 0; i < matrixMagicSquare.length; i++) {
            // Formula works by incrementing based on 0,0 1,1 2,2 ...
            forwardDiagonalCount += matrixMagicSquare[i][i];
        }
        if (forwardDiagonalCount != validTotal) {
            return false;
        }

        // Check reverse diagonal lines
        int reverseDiagonalCount = 0;
        for (int i = 0; i < matrixMagicSquare.length; i++) {
            // Formula works by ensuring an index out of bounds error does not occur
            // by reducing the matrix length, such as 3, - 1, to result in 2
            reverseDiagonalCount += matrixMagicSquare[i][matrixMagicSquare.length - 1 - i];
        }
        if (reverseDiagonalCount != validTotal) {
            return false;
        }

        // Check if 1, 2, 3, n... exists
        // 3 nested loop I learned at the Kount
        for (int i = 1; i <= size * size; i++) {
            boolean found = false;
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (matrixMagicSquare[row][col] == i) {
                        found = true;
                    }
                }
            }
            if (!found) {
                return false;
            }
        }

        return true;
    }

    /**
     *                  Forces encapsulation of the 2d array, the magic square
     *                  matrix, by returning
     *                  a copy of its element values at row and column.
     */
    @Override
    public int[][] getMatrix() {
        int[][] copyMatrixMagicSquare = new int[matrixMagicSquare.length][matrixMagicSquare.length];

        for (int row = 0; row < matrixMagicSquare.length; row++) {
            for (int col = 0; col < matrixMagicSquare[row].length; col++) {
                copyMatrixMagicSquare[row][col] = matrixMagicSquare[row][col];
            }
        }

        // Return a brand new 2d array, that is not the same as the
        // Class' array (to avoid breaking encapsulation)
        return copyMatrixMagicSquare;
    }

    /**
     *                 Returns readable data to the terminal by first retrieving a
     *                 copy of the MagicSquare
     *                 object's 2d array, its magic square matrix, then invoking the
     *                 isMagicSquare method
     *                 signature to verify is validity of being a magic square
     *                 If valid, the method will append string values to form a
     *                 neatly organized terminal
     *                 message informing the user the that the Magic Square object
     *                 is valid, otherwise
     *                 it will neatly organize a terminal message showing its
     *                 contents not to be valid.
     */
    @Override
    public String toString() {
        // Primer variable, to later append string values
        String returnMessage = "";
        returnMessage += "The matrix:";
        returnMessage += "\n";

        // First, retrieve a copy of the object's 2d array, the magic square matrix,
        // to avoid breaking incapsulation.
        int[][] copyMatrixMagicSquare = getMatrix();

        // Now, invoke the isMagicSquare method to test the validity of being a magic
        // square
        if (isMagicSquare()) {
            for (int row = 0; row < copyMatrixMagicSquare.length; row++) {
                returnMessage += "\t";
                for (int col = 0; col < copyMatrixMagicSquare[row].length; col++) {
                    returnMessage += copyMatrixMagicSquare[row][col] + " ";
                }
                returnMessage += "\n";
            }
            returnMessage += "is a magic square.";
            return returnMessage;
        } else {
            for (int row = 0; row < copyMatrixMagicSquare.length; row++) {
                returnMessage += "\t";
                for (int col = 0; col < copyMatrixMagicSquare[row].length; col++) {
                    returnMessage += copyMatrixMagicSquare[row][col] + " ";
                }
                returnMessage += "\n";
            }
            returnMessage += "is not a magic square.";
            return returnMessage;
        }
    }
}
