package com.javaOOPS;

class Student{
    int roll;
    String name;

    public void show(){
        System.out.println(this.roll);
        System.out.println(this.name);
    }

    //  Non-Parameterized Constructor / Default Constructor
    Student(){
        System.out.println("Constructor Called");
    }
    // Parameterized Constructor
    Student(int roll, String name){
        System.out.println("Constructor with parameter Called");
        this.roll = roll;
        this.name = name;
    }
    // Copy Constructor
    Student(Student s){
        System.out.println("Constructor with parameter Called");
        this.roll = s.roll;
        this.name = s.name;
    }
    // It has only one String parameter
    public void displayInfo(String name) {
        System.out.println(name);
    }

    // It has only one integer parameter
    public void displayInfo(int age) {
        System.out.println(age);
    }

    // Now same function has multiple parameter
    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1900007;
        s1.name = "Tamim";

        Student s2 = new Student(1900020, "Ragib");
        Student s3 = new Student(s2);
        s1.show();
        s2.show();
        s3.show();

        /* Unlike languages like C++, Java has no Destructor. Instead,
        Java has an efficient  garbage collector that deallocates memory automatically.
         */

        /* Polymorphism
        It is the ability to present the same interface for differing underlying forms (data types)
            Types of Polymorphism IMP
                1. Compile Time Polymorphism (Static) - Method overloading
                It's a technique which allows you to have more than one function with the same function name but with different functionality.
                        1. The return type of the overloaded function.
                        2. The type of the parameters passed to the function.
                        3. The number of parameters passed to the function.
                2. Runtime Polymorphism (Dynamic)
                     * Runtime polymorphism is also known as dynamic polymorphism.
                     * Function overriding is an example of runtime polymorphism.
                     * Function overriding means when the child class contains the method which is already present in the parent class.
                     * Hence, the child class overrides the method of the parent class.
                     * In case of function overriding, parent and child classes both contain the same function with a different definition.
                     * The call to the function is determined at runtime is known as runtime polymorphism.



         */

        /* Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.
        syntax: class childClass extends (parentClass / baseClass / superClass)
            1. Single inheritance : When one class inherits another class, it is known as single level inheritance
            2. Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class.
            3. Multilevel inheritance : Multilevel inheritance is a process of deriving a class from another derived class.
            4. Hybrid inheritance : Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance.
         */
        class Shape {
            public void area() {
                System.out.println("Displays Area of Shape");
            }
        }
        class Triangle extends Shape {
            public void area(int h, int b) {
                System.out.println((1.0/2)*b*h);
            }
        }
        class EquilateralTriangle extends Triangle {
            int side;
        }
        class Circle extends Shape {
            public void area(int r) {
                System.out.println((3.14)*r*r);
            }
        }




        /* Package in Java
            Package is a group of similar types of classes, interfaces and sub-packages. Packages can be built-in or user defined.

            Access Modifiers in Java
            * Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
            * Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
                If you do not specify any access level, it will be the default.
            * Protected: The access level of a protected modifier is within the package and outside the package through child class.
                If you do not make the child class, it cannot be accessed from outside the package.
            * Public: The access level of a public modifier is everywhere.
                It can be accessed from within the class, outside the class, within the package and outside the package.
         */

        /* Encapsulation is the process of combining data and functions into a single unit called class.
            In Encapsulation, the data is not accessed directly;
            it is accessed through the functions present inside the class.
            In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes.
            Thus, encapsulation makes the concept of data hiding possible.
         */

        /* Abstraction is hiding the unnecessary details & showing only the essential parts/functionalities to the user.
        we can declare abstract class which does not need to be described but must be declared (syntax: abstract class parentClass)

           * An abstract class must be declared with an abstract keyword.
           * It can have abstract and non-abstract methods.
           * It cannot be instantiated, means object of abstract class can't be created. If we create it then we will face Run-time error
           * It can have constructors and static methods also.
           * It can have final methods which will force the subclass not to change the body of the method

        same for abstract function that will be defined in inheritor child class but no need for definition in Parent Class [ abstract void func(); ]
        abstract function must be defined in child class
         */

        /* Interfaces
            * All the fields in interfaces are public, static and final(can't be changed even in inheritor child class) by default.
            * All methods are public & abstract by default.
            * A class that implements an interface must implement all the methods declared in the interface.
            * Interfaces support the functionality of multiple inheritance.
            * syntax: class childClass implements (parentClass / interface)
         */

        /* Static:
                * No need an object to access it from a class
                * It will be same for all object
                    * Variable (also known as a class variable)
                    * Method (also known as a class method)
                    * Block
                    * Nested class
                * It will be given only one time memory because its same for every object
         */
    }
}
