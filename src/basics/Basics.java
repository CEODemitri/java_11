package basics;
//package declaration
// where the package is located

public class Basics {
//    class declaration
//    may have access modifier: public, private, or protected
//    must have class keyword

    public static void main(String[] args) {
        System.out.println("Halo from Java!");

        // explicit declaration
        String s1 = "Hello Demitri";

        //
        var i1 = 10;
        var i2 = 33;
        var result = i1 + i2;
        System.out.println(result);
    }

}

//NOTES::
// java doesn't care for whitespace MUST USE ;
// use javac command to turn .java file to bytecode
// methods and variables camelCase
// sout
// static type language
// Primitive variable types:
// always lowercase
// int, char, byte, short, float, double, long, boolean




// Memory Management
// java handles memory at runtime
// deference a variable: variableName = NULL; <- ?"triggers" garbage collection

// Section 3 Video 2
// finish this file until 5. Manage Flow then create new package

