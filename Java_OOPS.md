# JAVA Object-Oriented Programming notes

# Java OOP
OOP stands for Object-Oriented Programming.

Object-oriented programming has several advantages over procedural programming:
* OOP is faster and easier to execute
* OOP provides a clear structure for the programs
* OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
* OOP makes it possible to create full reusable applications with less code and shorter development time

--------------------------

### "Static" Keyword :
* No need an object to access it from a class
* It will be same for all class-member
    * Variable (also known as a class variable)
    * Method (also known as a class method)
    * Block
    * Nested class
* It will be given only one time memory because its same for every object.

--------------------------

### Java Constructors
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
* The constructor name must match the class name, and it cannot have a return type (like void).
* Also note that the constructor is called when the object is created.
* All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

**There can be three types of constructors in Java.**
1. Non-Parameterized constructor.
2. Parameterized constructor.
3. Copy Constructor.

**Unlike languages like C++, Java has no Destructor.**
Instead, Java has an efficient  garbage collector that deallocates memory automatically.


--------------------------


## Package in Java

Package is a group of similar types of classes, interfaces and sub-packages. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

##### Built-in Packages
* The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.
* The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: **[Here](https://docs.oracle.com/javase/8/docs/api/)**
* The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.
* To use a class or a package from the library, you need to use the **"import"** keyword

![package](https://www.freetimelearning.com/java/uploadingimages/package%20in%20java.png)
credit: In picture

--------------------------

### Access Modifiers in Java
1. **Private:** The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
2. **Default:** The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
    If you do not specify any access level, it will be the default.
3. **Protected:** The access level of a protected modifier is within the package and outside the package through child class.
    If you do not make the child class, it cannot be accessed from outside the package.
4. **Public:** The access level of a public modifier is everywhere.
    It can be accessed from within the class, outside the class, within the package and outside the package.
    
![access modifiers](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Access-Modifiers-in-Java.png)

credit: geekforgeeks.com

--------------------------

### Friend Class and Friend Functions in C++

**Friend Class:** A friend class is a class that can access the private and protected members of a class in which it is declared as friend. This is needed when we want to allow a particular class to access the **private** and **protected** members of a class.

**Friend Function:** Similar to friend class, this function can access the **private** and **protected** members of another class. A global function can also be declared as friend function.

* Function of another class should be declared with scope resolution as a friend function.
* Friendship is not mutual. If class A is a friend of B, then B doesn’t become a friend of A automatically.
* Friendship is not inherited. 

## [The concept of friends is not there in Java that is in C++.] 

--------------------------

## Polymorphism
It is the ability to present the same interface for differing underlying forms (data types)
    Types of Polymorphism IMP
1. **Compile Time Polymorphism (Static Binding / Early Binding) - Method overloading**
It's a technique which allows you to have more than one function with the same function name but with different functionality.
*i. The return type of the overloaded function.
ii. The type of the parameters passed to the function.
iii. The number of parameters passed to the function.*
```JAVA
            class Student {
               String name;
               int age;
              
               public void displayInfo(String name) {
                   System.out.println(name);
               }
             
               public void displayInfo(int age) {
                   System.out.println(age);
               }
             
               public void displayInfo(String name, int age) {
                   System.out.println(name);
                   System.out.println(age);
               }
            }
```

2. **Runtime Polymorphism (Dynamic Binding / Late Binding)**
 * Runtime polymorphism is also known as dynamic polymorphism.
 * Function overriding is an example of runtime polymorphism.
 * Function overriding means when the child class contains the method which is already present in the parent class.
 * Hence, the child class overrides the method of the parent class.
 * In case of function overriding, parent and child classes both contain the same function with a different definition.
 * The call to the function is determined at runtime is known as runtime polymorphism.
 
```JAVA
            class Shape {
               public void area() {
                   System.out.println("Displays Area of Shape");
               }
            }
            class Triangle extends Shape {
               public void area(int h, int b) {
                   System.out.println((1/2)*b*h); 
               }  
            }
            class Circle extends Shape {
               public void area(int r) {
                   System.out.println((3.14)*r*r);
               }  
            }
```

--------------------------

#### In C++, class member methods are non-virtual by default. They can be made virtual by using virtual keyword. Whereas in JAVA, methods are virtual by default and can be made non-virtual by using final keyword.

### Virtual function
* A C++ virtual function is a member function in the base class that you redefine in a derived class. It is declared using the virtual keyword.
* It is used to tell the compiler to perform dynamic linkage or late binding on the function.
* There is a necessity to use the single pointer to refer to all the objects of the different classes. So, we create the pointer to the base class that refers to all the derived objects. But, when base class pointer contains the address of the derived class object, always executes the base class function. This issue can only be resolved by using the 'virtual' function.
* A 'virtual' is a keyword preceding the normal declaration of a function.
* When the function is made virtual, C++ determines which function is to be invoked at the runtime based on the type of the object pointed by the base class pointer.

If the function in question is designated virtual in the base class then the derived class's function would be called. If it is not virtual, the base class's function would be called.

**Rules of Virtual Function:**
* They Must be declared in public section of class.
* Virtual functions must be members of some class.
* Virtual functions cannot be static members.
* They are accessed through object pointers.
* They can be a friend of another class.
* A virtual function must be defined in the base class, even though it is not used.
* The prototypes of a virtual function of the base class and all the derived classes must be identical. If the two functions with the same name but different prototypes, C++ will consider them as the overloaded functions.
* We cannot have a virtual constructor, but we can have a virtual destructor


**Redefining vs. Overriding **
* In C++, redefined functions are statically bound and overridden functions are dynamically bound. 
* So, a virtual function is overridden, and a non-virtual function is redefined



**Pure Virtual Function**
* A virtual function is not used for performing any task. It only serves as a placeholder.
* When the function has no definition, such function is known as "do-nothing" function.
* The "do-nothing" function is known as a pure virtual function. A pure virtual function is a function declared in the base class that has no definition relative to the base class.
* A class containing the pure virtual function cannot be used to declare the objects of its own, such classes are known as abstract base classes.
* The main objective of the base class is to provide the traits to the derived classes and to create the base pointer used for achieving the runtime polymorphism.
* Pure virtual function can be defined as:

```C++
virtual void display() = 0;   
```

![virtual vs pure virtual](https://pediaa.com/wp-content/uploads/2019/03/Difference-Between-Virtual-Function-and-Pure-Virtual-Function-Comparison-Summary-777x1024.jpg)

--------------------------

## Inheritance
Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.
```JAVA
        class ( childClass / subclass ) extends (parentClass / baseClass / superClass)
```

![inheritance type](https://static.javatpoint.com/tutorial/typescript/images/typescript-classes-types-of-inheritance.png)

credit: static.javatpoint.com

**1. Single inheritance** : When one class inherits another class, it is known as single level inheritance
**2. Hierarchical inheritance** : Hierarchical inheritance is defined as the process of deriving more than one class from a base class.
**3. Multilevel inheritance** : Multilevel inheritance is a process of deriving a class from another derived class.
**4. Hybrid inheritance** : Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance.
  
```JAVA
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
```

--------------------------

## Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. It  is the process of combining data and functions into a single unit called class. To achieve this, you must:

* declare class variables/attributes as **private.**
* provide public **get** and **set** methods to access and update the value of a **private** variable

**Properties:**
* In Encapsulation, the data is not accessed directly;
* It is accessed through the functions ( **setter** & **getter** ) present inside the class.
* In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes.
* Thus, encapsulation makes the concept of data hiding possible.

```JAVA
            public class Person {
              private String name; // private = restricted access
            
              // Getter
              public String getName() {
                return name;
              }
            
              // Setter
              public void setName(String newName) {
                this.name = newName;
              }
            }
            public class Main {
              public static void main(String[] args) {
                Person myObj = new Person();
                myObj.setName("John"); // Set the value of the name variable to "John"
                System.out.println(myObj.getName());
              }
            }
```

##### Why Encapsulation?
* Better control of class attributes and methods
* Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
* Flexible: the programmer can change one part of the code without affecting other parts
* Increased security of data


--------------------------

## Java Abstraction
Abstraction is hiding the unnecessary details & showing only the essential parts/functionalities to the user. Abstraction can be achieved with either abstract classes or interfaces.

The abstract keyword is a non-access modifier, used for classes and methods:

1. Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).


2. Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from). Abstract function must be defined in child class but not need to use **"abstract"** keyword.


##### Characteristics :

   * An abstract class must be declared with an **"abstract"** keyword.
   * It can have abstract and non-abstract methods.
   * It cannot be instantiated, means object of abstract class can't be created. If we create it then we will face **"Run-time error"**.
   * It can have constructors and static methods also.
   * It can have final methods which will force the subclass not to change the body of the method

```JAVA
            // Abstract class
            abstract class Animal {
              // Abstract method (does not have a body)
              public abstract void animalSound();
              // Regular method
              public void sleep() {
                System.out.println("Zzz");
              }
            }
            
            // Subclass (inherit from Animal)
            class Pig extends Animal {
              public void animalSound() {
                // The body of animalSound() is provided here
                System.out.println("The pig says: wee wee");
              }
            }
            
            class Main {
              public static void main(String[] args) {
                Pig myPig = new Pig(); // Create a Pig object
                myPig.animalSound();
                myPig.sleep();
              }
            }
```

![java abstraction](https://static.javatpoint.com/images/abstract-class-in-java.jpg)

credit:  www.javatpoint.com

--------------------------

## Interfaces
Another way to achieve abstraction in Java, is with interfaces. An interface is a completely "abstract class" that is used to group related methods with empty bodies.

* A class that implements an interface must implement all the methods declared in the interface.
* Interfaces support the functionality of multiple inheritance.
* Like abstract classes, interfaces cannot be used to create objects.
* Interface methods do not have a body - the body is provided by the "implement" class
* On implementation of an interface, you must override all of its methods
* Interface methods are by default abstract and public
* Interface attributes are by default public, static and final(can't be changed even in child class) .
* An interface cannot contain a constructor (as it cannot be used to create objects)

```JAVA
            interface FirstInterface {
              public void myMethod(); // interface method
            }
            
            interface SecondInterface {
              public void myOtherMethod(); // interface method
            }
            
            class DemoClass implements FirstInterface, SecondInterface {
              public void myMethod() {
                System.out.println("Some text..");
              }
              public void myOtherMethod() {
                System.out.println("Some other text...");
              }
            }
            
            class Main {
              public static void main(String[] args) {
                DemoClass myObj = new DemoClass();
                myObj.myMethod();
                myObj.myOtherMethod();
              }
            }
```

![interface vs class](https://www.journaldev.com/wp-content/uploads/2013/07/abstract-class-vs-interface.png.webp)

credit: www.journaldev.com

--------------------------

### Instance initializer block

Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.
The initialization of the instance variable can be done directly but there can be performed extra operations while initializing the instance variable in the instance initializer block.

There are mainly three rules for the instance initializer block. They are as follows:
1. The instance initializer block is created when instance of the class is created.
2. The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
3. The instance initializer block comes in the order in which they appear.

Inicident in a child class that's parent class has Instance Initializer block (IIB) :
parent IIB -> parent constructor -> child IIB -> child constructor

--------------------------
### this keyword in Java
is a reference variable that refers to the current object of a method or a constructor. The main purpose of using this keyword in Java is to remove the confusion between class attributes and parameters that have same names.

Following are various uses of ‘this’ keyword in Java:

* It can be used to refer instance variable of current class
* It can be used to invoke or initiate current class constructor
* It can be passed as an argument in the method call
* It can be passed as argument in the constructor call
* It can be used to return the current class instance

![this](https://static.javatpoint.com/images/usage-of-java-this-keyword.png)

### super keyword in Java

The super keyword in Java is a reference variable which is used to refer immediate parent class object.Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword
1. super can be used to refer immediate parent class instance variable.
2. super can be used to invoke immediate parent class method.
3. super() can be used to invoke immediate parent class constructor.

![super](https://simplesnippets.tech/wp-content/uploads/2018/05/super-keyword-in-java-featured-image.jpg)
credit: simplesnippets.tech

--------------------------

### Final Keyword In Java

"final" keyword in java means UNCHANGEABLE in easy terms

1. A constructor cannot be declared as final.
2. Local final variable must be initializing during declaration.
> A final variable that is not initialized at the time of declaration is known as blank final variable. We must initialize the blank final variable in constructor of the class otherwise it will throw a compilation error.
3. All variables declared in an interface are by default final.
4. We cannot change the value of a final variable.
5. A final method cannot be overridden.
6. A final class not be inherited.
7. If method parameters are declared final then the value of these parameters cannot be changed.
8. It is a good practice to name final variable in all CAPS.
9. final, finally and finalize are three different terms. finally is used in exception handling and finalize is a method that is called by JVM during garbage collection.



--------------------------

Sources are given in Main [README.md](https://github.com/jashezan/learning-java#readme) file
