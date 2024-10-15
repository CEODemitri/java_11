package basics;
// package declaration
// where the package is located
import java.math.BigDecimal;

public class Basics {
//    class declaration
//    may have access modifier: public, private, or protected
//    must have class keyword

    public static void main(String[] args) {
        System.out.println("Halo from Java!");

        // explicit declaration
        String s1 = "Hello Demitri";

        // inferred
        var i1 = 10;
        var i2 = 33;
        var result = i1 + i2;
        System.out.println(result);

        // handling decimals
        double value = .012;
        double pSum = value + value + value;
        // does some whacky with numbers. so need to "cleanse" for precision:
        System.out.println(pSum);
        // 1. first convert the double to a string
        var stringValue = Double.toString(value);
        // 2. convert to BigDecimal object
        var bigValue = new BigDecimal(stringValue);
        // now add using method 'add' for true answer
        var bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bigSum);
        // 3. convert back to primitive double?
        var sum = bigValue.doubleValue();

        // new BigDecimal variable
        // BigDecimal payment = new BigDecimal("1234.5678");

        // type conversion
        short sh = 100;
        int i = sh;
        long longValue = i;
        // not possible, lossy:
        // short shortValue = longValue;
        short shortValue = (short) longValue;

        // boolean
        boolean aValue = true;
        // not correct syntax in ide, using for example to show default is false
        // boolean b3;
        // System.out.println(b3);
        // set Boolean value
        // var myVal = Boolean.parseBoolean("true");

        // String
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s = new String(chars);
        System.out.println(s);
        var charArray = s.toCharArray();
        System.out.println(charArray);

        // assignment & math operators
        var intValue = 10;
        // postfix:
        // changes value after output
        System.out.println(intValue ++);
        System.out.println(intValue);
        // prefix:
        System.out.println(++ intValue);

        // better way to make string? use a builder
        // check notes below
        // is this the point of this "block"?
        var sb = new StringBuilder("Welcome There.");
        sb.append(" Howdy There.");
        var st = sb.toString();
        System.out.println(st);

        // idk the ide refactored to this
        var st2 = "Welcome There." + " Howdy There.";
        System.out.println(st2);

        // convert primitive to strings
        int eggs = 20 + 20;
        String answer = "Answer: " + eggs;
        System.out.println(answer);

        int intValueTwo = 42;
        var fromInt = Integer.toString(intValueTwo);
        System.out.println(fromInt);

        boolean boolValue = true;
        var fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longerValue = 10_000_000;
        var fromLong = Long.toString(longerValue);
        System.out.println(fromLong);
    }

}

//NOTES::
// java is a C style language
// java doesn't care for whitespace MUST USE ;
// use javac command to turn .java file to bytecode
// methods and variables camelCase
// sout
// static type language
// Primitive variable types:
// always lowercase
// int, char, byte, short, float, double, long, boolean
// boolen only is true or false in Java
// jshell = irb, /exit

// Memory Management
// java handles memory at runtime
// deference a variable: variableName = NULL; <- ?"triggers" garbage collection

// CLASSES
// a class is a template for creating objects
// OBJECT is an instance of a class
// classes can define methods and fields
// field is a variable that's member of a class

// declaring Object variable:
// explicit type declaration:
// ClothingItem item = new ClothingItem();
// type inference:
// var item = new ClothingItem();
// items.setType("Hairy");

// type conversion
// widen: less memory to more memory
// example in main

// type of operators:
// equality, assignment, mathematical, logical, ternary

// use .equals for string comparison
// String s1 = 'Bye';
// String s2 = 'Bye';
// if (s1.equals(s2)) {
//    System.out.println("match!");
// } else {
//    System.out.println("no bueno");
// }

// round a number to two decimals
// return Math.round(doubleValue * 100) / 100d;

// BUILDER
// software design pattern to build objects


// finish this file until 5. Manage Flow then create new package