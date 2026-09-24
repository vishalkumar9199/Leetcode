"Tell me about yourself"
  =>Good morning. My name is Vishal kumar, and I recently completed my B.tech from ITER College Bhubaneswar.
I have a strong interest in software development, and my primary skill is Java. I have a good understanding of Core Java, OOP concepts, SQL, and basic problem-solving.
I have also solved 200+ leetcode questions, which helped me gain practical experience in programming.
I’m a quick learner, and I’m looking for an opportunity to start my career, contribute to the organization, and grow as a software developer.

    

"What is the difference between StringBuilder and StringBuffer?"
  
=>"Both are mutable classes used for modifying strings. StringBuilder is not synchronized, 
  so it generally provides better performance in single-threaded environments. 
  StringBuffer is synchronized and thread-safe, so it is suitable when multiple threads access the same mutable string object."

 "What is String Pool?":

=>"String Pool is a special area in the Java Heap where String literals are stored and reused. 
  If two String variables have the same literal value, they can refer to the same pooled object, which saves memory."

  If the interviewer asks "Why is String immutable in Java?", say:

=>"String is immutable because once a String object is created, its value cannot be changed. 
  Any operation that appears to modify a String creates a new String object. 
  Immutability provides security, allows safe String Pool sharing, makes Strings naturally thread-safe,
  and ensures consistent hash codes when Strings are used as keys in HashMap or HashSet."

  "What is the difference between abstract class and interface?"

=>"An abstract class is used when we want to provide common state and behavior along with abstraction, 
  whereas an interface is mainly used to define a contract that implementing classes must follow. 
  A class can extend only one abstract class but can implement multiple interfaces."

  "Why java called object oritented programm"

 => Java is called an Object-Oriented Programming (OOP) language because Java programs are mainly designed around objects and classes.

"why java is platform independent"

=>Java is platform independent because its compiler generates platform-neutral bytecode, which can run on any platform that has a compatible JVM.

JDK: JDK stands for Java Development Kit. JDK provides an environment to develop and execute the java program. 
  JDK is a kit that includes two things - Development Tools to provide an environment to develop your java programs and JRE to execute your Java programs.
  
JRE: JRE stands for Java Runtime Environment. JRE provides an environment to only run (not develop) the java programs onto your machine. 
  JRE is only used by the end-users of the system. JRE consists of libraries and other files that JVM uses at runtime.

  
JVM: JVM stands for Java Virtual Machine, which is a very important part of both JDK and JRE because it is inbuilt in both. 
  Whatever java program you run using JDK and JRE goes into the JVM and JVM is responsible for executing the java program line by line.

Q.Method overloading vs Mathod Overriding
  **Method Overloading** means having multiple methods with the **same name but different parameters** in the same class. It is an example of **compile-time polymorphism**.
**Method Overriding** means a child class provides its own implementation of a method that is already defined in the parent class. It is an example of **runtime polymorphism**.

Q.ArrayList vs LinkedList.
  ArrayList uses a dynamic array, so accessing an element by index is fast.
  It is generally better when we perform more searching or retrieving operations.

LinkedList uses nodes connected by links, so insertion and deletion can be more efficient when working at known positions,
  but accessing an element by index is slower.

 Q. HashMap vs Hashtable.
  Hashtable methods are synchronized, so they have synchronization overhead. HashMap is not synchronized,
  so it generally provides better performance when thread safety is not required.

Q.HashSet vs HashMap.
  
  HashSet stores unique elements, and it does not allow duplicate values.
  HashMap stores data in key-value pairs. Keys must be unique, but multiple keys can have the same value.

  Q.Comparable vs Comparator
  
  Comparable is used when we want to define the natural/default sorting order of a class. We implement the Comparable interface and override the compareTo() method.
  Comparator is used when we want to define custom sorting orders. We implement the Comparator interface and override the compare() method.

  Q. Checked vs unchecked exception.
  Checked exceptions are checked by the compiler at compile time. We must either handle them using try-catch or
  declare them using throws. Examples are IOException and SQLException.
  
  Unchecked exceptions are not checked by the compiler at compile time. 
  They usually occur because of programming errors. Examples are NullPointerException, ArithmeticException, and ArrayIndexOutOfBoundsException.

  Q.. final vs finally vs finalize.
  final is a keyword. It is used to make a variable constant, prevent method overriding, or prevent class inheritance.

  finally is a block used with try-catch. It generally executes whether an exception occurs or not, and is commonly used for cleanup operations.

  finalize() was a method associated with garbage collection. It could be called by the garbage collector before an object was reclaimed,
  but it is deprecated and should not be relied upon in modern Java.

  Q.Java 8 Features
  
  ⭐ Most important Java 8 features
   Lambda Expression
    Functional Interface
    Stream API
    Method Reference
    Default Methods in Interface
    Static Methods in Interface
    Optional Class
    Date and Time API
    Collectors





  //           Bank Mangement System(project)
  1. What is your Bank Management System?
  
My Bank Management System is a Java-based application designed to manage basic banking operations such as customer registration, 
  account creation, deposit, withdrawal, balance enquiry, fund transfer, and transaction management. 
  I used Java for the application logic and MySQL for storing customer, account, and transaction data.

2. Why did you choose this project?

I chose this project because banking involves several real-world operations such as account management,
  transactions, validation, and database operations. It helped me understand Java, OOP, JDBC, SQL;.

3. What technologies did you used

Java
OOP
JDBC
MySQL
SQL
Collections, if used
Exception handling
Eclipse/IntelliJ/VS Code, whichever you actually used

  4. What was your role in the project?

My main responsibility was implementing the Java  logic, database connectivity using JDBC, 
  and banking operations such as account creation, deposit, withdrawal, and balance enquiry.

  8. What happens when a customer creates an account?

First, I collect customer details, validate the input, generate/store the account information, and then insert the data into the MySQL database using JDBC.

  10. What happens during withdrawal?

First, I verify that the account exists. Then I check whether the withdrawal amount is valid and whether the account has sufficient balance. 
  If everything is valid, the balance is updated and the transaction is recorded.

  


  
