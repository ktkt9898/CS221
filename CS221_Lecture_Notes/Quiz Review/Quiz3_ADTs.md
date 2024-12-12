# How is an ADT defined in Java
Always an interface

# Which is ADT has methods to remove from elements at either end?
Unordered list

# What is the contents of s2 after Loop B, if daydream() is called with String "Vacation!", assuming the top is to the left?
public static void daydream( String foo ) {
    Stack<Character> s1 = new Stack<Character>();
    Stack<Character> s2 = new Stack<Character>();
    int aCount = 0;

    for( char c : foo.toCharArray() ) {  // Loop A starts here
        if( c >= 'a' && c <= 'z' ) {
            s1.push(c);
        } else {
            s2.push(c);
        }
    }

    while( !s1.isEmpty() ) {  //Loop B starts here
        s2.push(s1.pop());
    }
}

First loop takes the string as input and turn it into a character array
lower case letters are pushed/added into stack 1
Anything other gets pushed/added to stack 2

V upper case "V" is first added to stack 2
s1:
n
o
i
t
a
c
a
s2:
!
V

Now in loop B, pop out values from s1 and push to s2
Resulting in: (n is added first)
a
c
a
t
i
o
n
!
V
