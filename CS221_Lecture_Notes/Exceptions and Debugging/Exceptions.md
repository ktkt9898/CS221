/**
 * Exceptions are objects, meaning there are class files behind the object
 * They represent something had has caused the program unable to continue
 * The parent of the Exception class tree is Throwable
 * When an exception is thrown, a listener can respond and crash the
 * program
 * 
 * Flow of control returns to the location a method was called.
 * 
 * The runtime environment uses a structure called the call stack
 * to keep track of the flow of control.
 * The first method called starts with main() and the line
 * If main calls another method, that method gets added to the call
 * stack and becomes the active method; main is suspended until
 * the current method finishes.
 * 
 * If method 1 then calls method 2, method 1 is now suspended
 * until method 2 finishes
 * 
 * Each method waits for a response to the method above it
 * 
 * When a method finishes its job, it returns its values etc to the
 * method it was called; the previous method is now reactivated
 * 
 * When main finishes, the call stack is complete and the runtime
 * environment finishes.
 * 
 * When an exception is thrown, the runtime environment cannot continue
 * 
 * An object's constructor will itself call the exception
 * Ex. A scanner's constructor will itself call the exception if a File
 * could not be found
 * 
 * The exception will also include the call stack at the exact moment
 * the issue was detected
 * 
 # Option 1: An exception that is not handled, a stack trace will be printed...
 * useful to see what went wrong
 * 
 # Option 2: is to catch the exception with a try and catch block for
 * dangerous and dependent code
 * After the try block is where exception handlers/try block is placed
 * for scenarios that go wrong
 * Finally blocks give a chance to execute some code even if
 * the try block or catch block passes
 * Ex. Often used with auto save programs
 * 
 * The "Exception" exception takes advantage of polymorphism since it
 * is the root of the entire tree and acts as an catch-all;
 * not specific
 * 
 * It is still better to handle expected issues than use a catch-all
 * 
 * Errors and exceptions are different. Exceptions are things that could
 * interrupt a program but still could allow the program to continue.
 * 
 * Errors are so severe that it is uncoverable; like running a program
 * and the hard drive is removed
 * 
 * Runtime exceptions (Index out of bounds, divide by zero)
 * are generally easy to fix and not neccesarily needed
 * 
 * Checked exceptions/Parse Exceptions
 * are issues that are not necessarily the fault of the program, 
 * like file not found.
 * 
 # Option 3: Propagate the exception
 * A throws clause is a way to explicitly "pass the buck" instead of
 * dealing with the issue
 * 
 * The throws clause propagates back to where the method was called (on the
 * stack) and it could be handled elsewhere
 * 
 * A case where this problem exists, is to have a more fundamental method to
 * handle the throws exceptions
 * 
 # Writing New Exceptions:
 * Create a new class and extend the most appropriate Exception class
 * 
 * Ex. Invalid file format is a custom exception class
 public class InvalidFileFormatException extends IOException {
    public InvalidFileFormatException( String message) {
        super( message );
    }
 }

 A good name, a good parent, and a good constructor is the best practice
 for writing a new exception

 if ( ! scan.hasNextInt() ) {
    throw new InvalidFileFormatException( "Missing expected integer" );
 }
 */