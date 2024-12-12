# What does the call stack look like at the moment an exception is thrown?

try (
    PitchAndCatch pac = new PitchAndCatch():
    pac1.m1();
    pac2.m2();
    System.out.println("Game on!)
)

public void m1(){};
// Removed from call stack after it finishes

public void m2(){
    try {
        m3();
    }
    catch (Exception)
}

m3()
m2()
main()

# What is the sequence of events if a NullPointerException is thrown in m3?
Null pointer exception propogates from m3 to m2. m2 propogates to main.
Null pointer exception is caught, and clean exit.

# What is the output of "21EX" is read into codeStr
main
try {
    readData (kbd)
}
catch (Exception e) {

}
finally {
    kbd.close
    System.out.println("Done.")
}

readData() {
    try {
        codeStr = in.next()
        String numStr = Character.toString(codeStr.charAt(2));
        int num = Integer.parseInt(numStr);
    }
    catch (NumberFormatException nfe) {
        System.out.println(numStr + "is not a number")
    } 
}

The program successfully converted the charater at index position 2 to a string, but since it attempts to parse to an integer, the exception is caught. Then the finally block prints done

# How should an unchecked runtime exception be handled?
An unchecked runtime exception is a bug in the code, generally rule is to fix them - don't handle them. let the program crash and use the debugger.

# What is the Big-O for T(n) = (n^2/2) + 10n + 100
The n^2 will always grow faster, do not care about the 1/2