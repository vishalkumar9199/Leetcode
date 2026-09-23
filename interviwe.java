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

  
