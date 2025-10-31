/*
1. Java is object oreiented programming language.

2. Object is instace of Class.
    A. It is real world entity
    B. Object has properties and functions.

3. Class is a template for object.
4. Class is a blueprint for object.
5. Class is a collection of properties

Example:

Student engineer = new Student();

/*******************
 * OOPS fundamentals
 *
 * 1. Data Abstraction
 *
 * It hides the compexity and shows essntial functionality to the user.
 * It is achievd through interface and abstract class.
 * Increses the security and confidetiality.
 * Exmaple: User sends a text message to the user, but he is unknown to undelaying impentation.
 *  
 * Interface Imessage{
 *      
 *      Send_Text(){
 *          
 *      }
 *      
 *      Send_Email(){
 *          
 *       }
 *      
 *      Send_WhatsApp(){
 *          
 *      }
 * }
 *
 * 2. Data Encapsulation
 *      
 *  Encapsulation is the process of binding data and methods together into a single unit.
 *  It is also known as data hiding
 *  It is achieved through the use of access modifiers.
 *  
 *  Access modifiers are used to control the access of data and methods.
 *  
 *  There are 4 access modifiers in java
 *  
 *  1. public
 *  2. private
 *  3. protected
 *  4. default
 *  
 *  we can also use access modifiers to restrict the access of data and methods
 *  We can write loosely coupled code and have better acess and security
 *  Using a class and getter and setter methods we wrap data in single unit
 *      
 *
 * 3. Inheritance  --> extends
 *
 * Capability of a class to inherit the properties of another class
 * code reusabiity
 * single inheritance
 * multilevel inheritance
 * hierarchical inheritance
 * Mutiple inheritance is not possible in java we achive that behoout from interface
 * Dimond problem occurs if we try to inherit from multiple classes becaude they can have same methods it can
 * cause counfusion which one to use.


 *
 * 4. Polymorphism

 * Poly means to many forms
    A same method, behave differently in diffrent situations

    Types of polymorphism

    complie time / static polymorphism / method Overloading
    run time / dynamic polymorphism / Method Overriding


    Compile time polymorphism

    method overloading : same method name but different parameters
    return type does not matter


    run time polymorphism

    method overriding : same method name and same parameters
    using inheritance

 5. Object relationship

 IS-A-Relationship

 Dog is a Animal

 Parent child relationship

 Has-A-Relationship

 One Class has a object of another Class
 It can be one-to-one one to many many to many

Association in btween two objects

Aggregation: both object can servie induvusually.
Compostion : Ending one object will end another object



JDK

Java is platform independent language

WORA --> Write once, Run anywhere

JDK --> JRE --> JVM

Java Program --> Complier --> Bytecode --> JVM --> Machine Code -->CPU --> Output

JIT --> just in time complier

JRE ==> JVM + class libary

JDK ==> JRE(JVM + class libary) + java language + java complier + debugger

 *


 Java Program

    There shoud be only one public class in java same as file name
    Main method is public and static so JVM can direclty call it with calss name
    Main methid is the entry point of the program. JVM will call main method

Java varible rules:

    Java is case senestive
    Java is strongly typed
    Java is statically typed
    Java varriables can not start with number
    Java varriables follow camlecase

    Data Types

    Primitve data type

    Char

    Char --> 2 Byte  range 0 to 65535

    Signed compilets of 2
    byte --> 1 Byte  range -128 to 127 default 0
    short --> 2 Byte  range -32768 to 32767
    int --> 4 Byte  range -2147483648 to 2147483647
    long --> 8 Byte  range -9223372036854775808 to 9223372036854775807
    float --> 4 Byte  range 1.4E-45 to 3.4E+38
    double --> 8 Byte  range 4.9E-324 to 1.8E+308
    boolean --> 1 Byte  range true or false

    Use BIginter for presision


    Refernce data types

    Class

    There no pass by refernce in java we use ojbects to pass reference

    String

    String are stored insied string pool where sme string holds smae refrence to strings
    String are immutable in java
    To create new string in heap use new keyword

    Interface

    while implmenting interface we have oveeride the method and provied body
    we can hold refrence of concrate object in parent interface

    Class Car implemets vechile{
    }
   
    vechile car = new Car();

    Arrays

    int arr[] = new int[5];

    Refrence data types

    Interger

   



##### Methods



Acess Specifier


 
 *
 */


