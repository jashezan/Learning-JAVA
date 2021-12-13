# java-notes-including-oops
This is JAVA notes for beginners including object-oriented programming learned from various videos, other's notes, books and other sources. Summary of those learning will be here for revision and to expertise my learning

----------------------
### Primitive data type



| Data Type |Meaning|size (in Bytes)| Range|
| --------- |-------|---------------| -----|
|byte|2’s complement integer|1|-128 to 127|
|short |2’s complement integer| 2 |-32K to 32K|
|int |Integer numbers|4|-2B to 2B|
|long| ***ends with 'L'** else it will be considered "integer"* 2’s complement integer(larger values)|8|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float | ***ends with 'F'** else it will be considered "double"* Floating-point |4|Upto 7 decimal digits|
|double |Double Floating-point |8|Upto 16 decimal digits|
|char |Character |2|a, b, c .., A, B, C ..,  @, #, $ ..|
|bool |Boolean |1|True, false|





### Non-primitive data type, ex - String, Array
* There are many operation that can be done on non-primitive data type because this kind of data type has its own function/method, this kind of data type have no size limit
* "new" keyword is used to declare non-primitive data type or reference type
* It also use "new" to create object of a class
* If non-primitive data type is not initialized then "new" keyword must be added

-------------
**System.out.println(); prints with a new line**

**System.out.print(); prints without a new line**

**All class name starts with Capital letter in JAVA by convention**

**Also all method/function name starts with small letter in JAVA by convention**

--------------
#### String
* if we use "String" keyword to create string then name[0] can't be used to get individual character
* we have to use name.charAt(position-serial);
* *String can't be changed directly - because string is immutable in JAVA* 
 


| Method | Description | Return Type |
| ------ | ----------- | ----------- |
|charAt( index )|	Returns the character at the specified index (position)	|char|
|compareTo(String)|	Compares two strings lexicographically. **Returns 0** when both are equal|	int|
|concat(added_string)|	Appends a string to the end of another string|	String|
|contains(string)	|Checks whether a string contains a sequence of characters.Returns **true** if the characters exist and **false** if not. |boolean|
|endsWith(string)|	Checks whether a string ends with the specified character(s)|	boolean|
|startsWith()|	Checks whether a string starts with specified characters |	boolean |
|equals(string)|	Compares two strings. Returns true if the strings are equal, and false if not|	boolean|
|getChars()|	Copies characters from a string to an array of chars|	void|
|indexOf(string,indexToSearchFrom)|	Returns the position of the first found occurrence of specified characters in a string	|int|
|isEmpty()|	Checks whether a string is empty or not	|boolean|
|lastIndexOf()|	Returns the position of the last found occurrence of specified characters in a string|	int|
|length()|	Returns the length of a specified string|	int|
|replace(string1, string2)|	Searches a string for a specified value, and returns a new string where the specified values are replaced	|String|
|split()|	Splits a string into an array of substrings|	String[]|
|substring(startIndex, lastIndex)|	Returns a new string which is the substring of a specified string. *It includes the first described position character excludes the last one*|	String|
|toCharArray()|	Converts this string to a new character array	|char[]|
|toLowerCase()|	Converts a string to lower case |	String|
|toUpperCase()|	Converts a string to upper case letters|	String|
|trim()|	Removes whitespace from both ends of a string|	String|



----------------------------------------------
#### Array
* Array is also non-primitive data type so "new" keyword should be usedsquare brackets "[]" should be put after data type
 * Array is homogeneous(same data type) simple data structure
 limits should be given in the declaring time 
 * Array in JAVA is initialized with ( 0/ NULL/ false ) Unlike C/C++
```Java    
        int [] marks = new int[3];
        marks[0] = 90;
        marks[1] = 88;
        marks[2] = 95;
        System.out.println(marks[0]);
```
        
 ##### Array have properties Unlike String data type,
 so it should not be called with "()"
 * array in JAVA have Arrays class which comes with built-in function
 * Array package(java.util.Arrays) should be imported in JAVA to use this "Arrays" class
 * if Array is initialized with curly braces then "new" keyword can  be avoided



```Java    
// sort
        System.out.println("Before sort : " + marks[0]);
// function from class will overwrite the applied array
        Arrays.sort(marks);
        System.out.println("After sort : " + marks[0]);
```
Till now only 1D (single dimension) array was being used,
Now it's time to jump into 2D arrays with 2 square brackets

    int [][] fmakrs = {{89, 78, 90}, {97, 85, 99}}; 
    
*"new" keyword is not being used*

-------------------------------------------------
#### Casting
Casting in java is the assigning values of one type to another (Primitive data type)
* **Implicit casting / casting down / widening type casting**
    This casting is done by java generally on its own. It is assigning smaller values to larger data types.
    *like transferring glass's water to bucket (int to double)*
    **byte -> short -> char -> int -> long -> float -> double**

        double price = 100.00;
        price += 18; // implicit casting
        System.out.println(price); // 118.00

* **Explicit casting / casting up / narrowing type casting**
    This casting is done with . It is assigning larger values to smaller data types.
    dataType variableName = (dataType) variableToConvert;
    *like transferring bucket's water to glass forcefully (double to int)*
    **double -> float -> long -> int -> char -> short -> byte**

        int p = 100;
        p = 100 + 18.00; //does not works
        p = 100 + (int)18.00; // explicit casting
        p += 18.00; // works
        System.out.println(p); // 118
    
* *The types being considered here are compatible*


----------------------------------------

#### Constant
* A variable in Java which has a fixed value, so it cannot be assigned again.
 * it must be initialized with "final" keyword
 * it should be written in CAPITAL letter by convention

        final float PI = 3.1416F;
        PI = 3.1416F; can't be assigned with the same value also
        System.out.println(PI);

---------------------------------------------

#### Operators
 There are 4 types of operators in Java
* Arithmetic operators are just like operators we used in Math: (+, -, *, /, %)
* Assignment Operators: (=, +=, -=, *=, /=, %=)
* Comparison/Relational Operators: (==, !=, >, <, >=, <= )
* Logical Operators: (&&, ||, !)
* extra Unary Operator: (++, --)

----------------------------------

#### Input in JAVA
Taking input from user through terminal using "Scanner class"
Scanner class (import.util.Scanner) should be imported to use the class.
we use ( ```System.in``` ) for taking input in an object
String line = sc.nextLine(); // for taking full sentence else next(); will take only single word

            Scanner sc = new Scanner(System.in);
            System.out.print("Input your age : ");
            int aged = sc.nextInt();
            System.out.println("\n\n\nAge : " + aged);
            
----------------------------------------------------

 #### Conditional statements ‘if-else’

 The if block is used to specify the code to be executed if the condition specified  in if is true, the else block is executed otherwise.

            if(aged<10){
                System.out.println("You're kid");
            }else if(aged<18){
                System.out.println("You're teenager");
            }else{
                System.out.println("You're adult");
            }

#### Conditional Statements ‘switch

Switch case statements are a substitute for long if statements that compare a variable to multiple values. After a match is found, it executes the corresponding code of that value case.

            switch (aged) {
                case 1 -> System.out.println("Yo 1");
                case 2 -> System.out.println("Yo 2");
                case 3 -> System.out.println("Yo 3");
                case 4 -> System.out.println("Yo 4");
                case 5 -> System.out.println("Yo 5");
                default -> System.out.println("Yo default");
            }

----------------------------------------------

#### Loops
***Loops in JAVA is same as C/C++***

##### For Loop
The syntax of the for loop is  :

            for (initialization; condition; update) { 
             // body of-loop 
            }
##### While Loop
The syntax for while loop is :

            while(condition) { 
             // body of the loop 
            }
##### Do-While Loop
The syntax for the do-while loop is :

            do { 
             // body of loop; 
            } 
            while (condition);

#### Break & Continue
***Break and Continue is also same as C/C++***

Jumps in loops are used to control the flow of loops. There are two statements  used to implement jump in loops - Continue and Break. These statements are  used when we need to change the flow of the loop when some specified  condition is met.
##### Continue statement
is used to skip to the next iteration of that loop. This  means that it stops one iteration of the loop. All the statements present  after the continue statement in that loop are not executed.

            for (int i=1; i<=20; ){
               if (i%3==0) {
                   continue;
               }
               System.out.println(i);
            }

In this for loop, whenever i is a number divisible by 3, it will not be printed  as the loop will skip to the next iteration due to the continue statement.  Hence, all the numbers except those which are divisible by 3 will be printed.

##### Break statement
is used to terminate the current loop. As soon as the break  statement is encountered in a loop, all further iterations of the loop are  stopped and control is shifted to the first statement after the end of loop.

            for (int i=1; i<=20; i++) {
               if (i == 11) {
                   break;
               }
               System.out.println(i);
            }

In this loop, when i becomes equal to 11, the for loop terminates due to  break statement, Hence, the program will print numbers from 1 to 10  only.

--------------------------------

#### Exception Handling (try-catch)
Exception Handling in Java is a mechanism to handle the runtime errors so that normal flow of the application can be maintained.

            Exception Handling with try and catch
            try{
                System.out.println(marks[5]);
            }catch(Exception exception){
                // do something
            }

It is done using 2 keywords - ‘try’ and ‘catch’.
Additional keywords like finally, throw and throws can also be used if we dive deep into this concept.

            int[] marks = {98, 97, 95};
            try {
               System.out.println(marks[4]);
            } catch (Exception exception) {
               System.out.println("An exception for caught while accessing an index the 'marks' array");
            }
            
            System.out.println("We tried to print marks & an exception must have occurred with index >=3");
        
        
-----------------------------------------------

#### Methods/Functions
A function is a block of code that performs a specific task. 
**Why are functions used?**
* If some functionality is performed at multiple places in software, then  rather than writing the same code, again and again, we create a function  and call it everywhere. This helps reduce code redundancy. 
* Functions make maintenance of code easy as we have to change at one  place if we make future changes to the functionality. 
* Functions make the code more readable and easy to understand. 

**The syntax for function declaration is :**

            return-type function_name (parameter 1, parameterϮ …… parameter n){  //function_body 
            } 
            return-type  

*The return type of a function is the data type of the variable that that function  returns.*  

When a function does not return any value, in that case the return type of the  function is ‘void’. 

**function_name**
* It is the unique name of that function.  
* It is always recommended to declare a function before it is used. 

**Parameters**
A function can take some parameters as inputs. These parameters are specified  along with their data types. 
For eg- if we are writing a function to add 2 integers, the parameters would be  passed like – 
int add (int num1, int num2)

**main function**
The main function is a special function as the computer starts running the code  from the beginning of the main function. Main function serves as the entry  point for the program.

-----------------------------

# Learning Sources
*All this notes are mainly gained from Apna College*

[Java Tutorial for Beginners | Learn Java in 2 Hours | Apna College](https://www.youtube.com/watch?v=UmnCZ7-9yDY)
* [Notes from this class](https://docs.google.com/document/d/1oH3njzRKmyC_igBsCp4b2E3s7GrJdGfIilPAahDV5W8/edit)

[Java OOPs in One Shot | Object Oriented Programming | Java Language | Placement Course | Apna College](https://youtu.be/bSrm9RXwBaI)
* [Notes from this class](https://docs.google.com/document/d/1uv9EdLaG9TK7iNcMneLeEaChzvmXU9Xu_Uv5iZwswFk/edit)
