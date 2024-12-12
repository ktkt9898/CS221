import java.io.FileNotFoundException;

/**
 * @author Kyle Truschel
 * 
 * This class functions as the driver class that has a dependency on
 * the MagicSquare class in order to output to the terminal a valid
 * magic square matrix
 */

public class MagicSquareDriver {

    public static void printUsage ( ) {
        System.out.println("Usage: java MagicSquareDriver <-check | -create> <filename> < |size>");
        System.out.println("\tSize MUST be an odd number.");
        System.out.println("\tcheck  : Check if filename is a magic square");
        System.out.println("\tcreate : Create a magic square of dimension size");
    }

    public static void main(String[] args) {

        // Prevents out of bounds exception
        if ( args.length != 2 && args.length != 3 ) {
            printUsage();
            return;
        }

        // First terminal string value is the mode, check or create
        String mode = args[0];

        // Second terminal string value is the file name for check or create
        String fileName = args[1];

        // A switch statement is used to perform object instantiation on the two
        // overloaded constructors
        switch (mode) {
            case "-check":
                MagicSquare checkMagicSquare = null;
                System.out.println("Check mode selected.");

                try {
                    checkMagicSquare = new MagicSquare(fileName);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                // Once the file's values have been transfered to a 2d array, perform
                // the toString method
                System.out.println(checkMagicSquare.toString());
                
                break;
           
            case "-create":
                // Third terminal string value is only for create, a size integer
                int inputSize = Integer.parseInt(args[2]);

                // Ensure odd positive interger only
                if (inputSize % 2 == 0) {
                    printUsage();
                    break;
                }

                MagicSquare newMagicSquare = null;
                System.out.println("Create mode selected.");

                try {
                    newMagicSquare = new MagicSquare(fileName, inputSize);
                    // Once the magic square 2d array is made, perform the toString method
                    System.out.println(newMagicSquare.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        
            default:
                // In case user enters order improperly
                printUsage();
                break;
        }       
    }
}