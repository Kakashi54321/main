# Java8Features

# 1) forEach() method in Iterable interface
Whenever we need to traverse through a Collection, we need to create an Iterator whose whole purpose is to iterate over and then we have business logic in a loop for each of the elements in the Collection. 
We might get ConcurrentModificationException if iterator is not used properly.

Java 8 has introduced forEach method in java.lang.Iterable interface so that while writing code we focus on business logic only.
so it helps in having our business logic at a separate location that we can reuse. Let’s see forEach usage with simple example.

# 2) default and static methods in Interfaces
If you read forEach method details carefully, you will notice that it’s defined in Iterable interface but we know that interfaces can’t have method body. 
From Java 8, interfaces are enhanced to have method with implementation. We can use default and static keyword to create interfaces with method implementation.

Prior to java 8, interface in java can only have abstract methods. All the methods of interfaces are public & abstract by default. 
Java 8 allows the interfaces to have default and static methods. 
The reason we have default methods in interfaces is to allow the developers to add new methods to the interfaces without affecting the classes that implements these interfaces.

Static methods in interfaces are similar to the default methods except that we cannot override these methods in the classes that implements these interfaces.

# 3) Functional Interfaces and Lambda Expressions
If you notice above interfaces code, you will notice @FunctionalInterface annotation. Functional interfaces are new concept introduced in Java 8. 
An interface with exactly one abstract method becomes Functional Interface. 

We don’t need to use @FunctionalInterface annotation to mark an interface as Functional Interface. 
@FunctionalInterface annotation is a facility to avoid accidental addition of abstract methods in the functional interfaces. 

You can think of it like @Override annotation and it’s best practice to use it. java.lang.Runnable with single abstract method run() is a great example of functional interface.

One of the major benefits of functional interface is the possibility to use lambda expressions to instantiate them. We can instantiate an interface with anonymous class but the code looks bulky.

# 4) Java Stream API for Bulk Data Operations on Collections
A stream represents a sequence of elements and supports different kind of operations to perform computations upon those elements.



