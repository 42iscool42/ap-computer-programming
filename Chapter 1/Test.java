public class Test {
    public static void man(String[] args) {
        System.out.println("An emergency broadcast");
    }

}
/*
Test to test: 
error: class test is public, should be declared in a file named test.java
public class test {

Emergency to emergency: none becasue the change is in a string which is not parsed as part of the program
Remove first quotation mark:
Test.java:3: error: ')' expected
        System.out.println(An emergency broadcast");
                             ^
Test.java:3: error: unclosed string literal
        System.out.println(An emergency broadcast");
                                                 ^
Test.java:3: error: not a statement
        System.out.println(An emergency broadcast");
                                        ^

Remove last quote:
Test.java:3: error: unclosed string literal
        System.out.println("An emergency broadcast);
                           ^
Test.java:3: error: ';' expected
        System.out.println("An emergency broadcast);
                                                    ^
Test.java:5: error: reached end of file while parsing
}
 ^

Main to man: none, because it is not a syntax error it 
just changed the name of the function.  It would produce 
an error if you run it, however, because there is no 
main function which is needed to make a java program 
runnable

change println to bogus: 
Test.java:3: error: cannot find symbol
        System.out.bogus("An emergency broadcast");
                  ^
  symbol:   method bogus(String)
  location: variable out of type PrintStream
  
Remove the semicolon at the end of the println statement:
Test.java:3: error: ';' expected
        System.out.println("An emergency broadcast")
                                                    ^

Remove the last brace in the program:
Test.java:4: error: reached end of file while parsing
    }
     ^
*/