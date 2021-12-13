import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void pjava(){
        System.out.println("This is JAVA");
    }

    public static void main(String[] args) {
        // All class name starts with Capital letter in JAVA by convention
         /* Primitive data type
         * byte - 2
         * int - 4
         ** long - 8 , ends with 'L' else it will be considered "integer"
         ** float - 4 , ends with 'F' else it will be considered "double"
         * double - 8
         * boolean - 1
          */
        int dob = 2000;
        byte age = 20;
        long phone = 8801623766425L;
        float pi = 3.1416f;
        double ans = 2.0;
        boolean inAdult = true;

        // Non-primitive data type, ex - String, Array
        /*There are many operation that can be done on non-primitive data type
         because this kind of data type has its own function/method
         this kind of data type have no limit
         * "new" keyword is used to declare non-primitive data type or reference type
         also use "new" to create object of a class
         * if non-primitive data type is not initialized then "new" keyword must be added
         */
        // System.out.println(); prints with a new line
        // System.out.print(); prints without a new line
        String name = "Harry";
//        System.out.println(name.length());
        // string using "new" keyword
        String friend = new String("Jubyer");
        // string concatenate
        String name1 = name + " " + friend;
//        System.out.println(name1);
//        System.out.println(name1.length());
//        System.out.println(name1.charAt(0));
        /* if we use "String" keyword to create string
        then name[0] can't be used to get individual character
        we have to use name.charAt(position-serial);
         */
        /* Replace whole string or a part of it
        name.replace does not change the main string
        it save the changed data in a new variable
        */
        // String can't be changed directly - because string is immutable in JAVA
        String name2 = name.replace("Harry","Shezan");
//        System.out.println("This is name2 : " + name2);
//        System.out.println("This is name : " + name);
        // Get a part of substring
        // this includes the first described position character
        // but excludes the last one
        String name3 = name1.substring(0,8);
//        System.out.println(name3);

         /* Array is also non-primitive data type so "new" keyword should be used
         square brackets "[]" should be put after data type
         * Array is homogeneous(same data type) simple data structure
         limits should be given in the declaring time
         * Array in JAVA is initialized with 0, NULL, false Unlike C/C++
          */
        int [] marks = new int[3];
        marks[0] = 90;
        marks[1] = 88;
        marks[2] = 95;
//        System.out.println(marks[0]);
         /* Array have properties Unlike String data type,
         so it should not be called with "()"
         * array in JAVA have Arrays class which comes with built-in function
         * Array package(java.util.Arrays) should be imported in JAVA to use this "Arrays" class
         * if Array is initialized with curly braces then "new" keyword can  be avoided
          */

        // length
//        System.out.println(marks.length);

        // sort
//        System.out.println("Before sort : " + marks[0]);
        // function from class will overwrite the applied array
        Arrays.sort(marks);
//        System.out.println("After sort : " + marks[0]);

        // Till now only 1D (single dimension) array was being used
        // Now it's time to jump into 2D arrays with 2 square brackets
        int [][] fmakrs = {{89, 78, 90}, {97, 85, 99}}; // "new" keyword is not being used

        /* Casting in java is the assigning values of one type to another (Primitive data type)
        * Implicit casting / casting down / widening type casting
            This casting is done by java generally on its own. It is assigning smaller values to larger data types.
            like transferring glass's water to bucket (int to double)
            byte -> short -> char -> int -> long -> float -> double
        * Explicit casting / casting up / narrowing type casting
            This casting is done with . It is assigning larger values to smaller data types.
            dataType variableName = (dataType) variableToConvert;
            like transferring bucket's water to glass forcefully (double to int)
            double -> float -> long -> int -> char -> short -> byte
        * The types being considered here are compatible
         */
        double price = 100.00;
        price += 18; // implicit casting
//        System.out.println(price);

        int p = 100;
        // p = 100 + 18.00; //does not works
        p = 100 + (int)18.00; // explicit casting
        // p += 18.00; // works
//        System.out.println(p);

         /* Constant - A variable in Java which has a fixed value, so it cannot be assigned again.
         * it must be initialized with "final" keyword
         * it should be written in CAPITAL letter by convention
          */
        final float PI = 3.1416F;
        // PI = 3.1416F; can't be assigned with the same value also
//        System.out.println(PI);

        /* There are 4 types of operators in Java
        * Arithmetic operators are just like operators we used in Math: (+, -, *, /, %)
        * Assignment Operators: (=, +=, -=, *=, /=, %=)
        * Comparison/Relational Operators: (==, !=, >, <, >=, <= )
        * Logical Operators: (&&, ||, !)
        * extra Unary Operator: (++, --)
         */

        /* Taking input from user through terminal using "Scanner class"
        Scanner class (import.util.Scanner) should be imported to use the class.
        we use (System.in) for taking input in an object
        String line = sc.nextLine(); // for taking full sentence else it will take only single word
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input your age : ");
//        int aged = sc.nextInt();
//        System.out.println("\n\n\nAge : " + aged);

        // Conditional statements
        /*
        if(aged<10){
            System.out.println("You're kid");
        }else if(aged<18){
            System.out.println("You're teenager");
        }else{
            System.out.println("You're adult");
        }
         */

        // switch statements
        /* switch (aged) {
            case 1 -> System.out.println("Yo 1");
            case 2 -> System.out.println("Yo 2");
            case 3 -> System.out.println("Yo 3");
            case 4 -> System.out.println("Yo 4");
            case 5 -> System.out.println("Yo 5");
            default -> System.out.println("Yo default");
        }
         */

        // Loops in JAVA is same as C/C++
        // Break and Continue is also same as C/C++

        // Exception Handling with try and catch
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            // do something
        }
        // Function — a set of instructions that perform a task.
        // Method — a set of instructions that are associated with an object.
        pjava();
    }
}


















