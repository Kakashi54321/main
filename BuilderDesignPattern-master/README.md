# BuilderDesignPattern

The Builder pattern is a creational design pattern that handles the construction of complex objects step by step (or brick by brick). It is probably the easiest pattern to spot if the existing code needs such design. The Builder pattern allows the creation of different representations of an object using the same construction code.

# Type: This falls in creational design pattern.

# Why we need Builder Design Pattern

1) Getting rid of telescoping constructors
2) Single place of definition
3) Thread safety

# Explanation:
1) Phone.java class is actual phone class which has all attributes and contructor but the construction of object by setting attributes is happening in PhoneBuilder class, For every parameter we have a setter — the difference is that those methods return Builder type(PhoneBuilder in this example). In the end, we have a method which uses the constructor from Phone class and returns the Phone object.

In this way, we have decoupled the sequence of attribute initilization and also we can ignore couple of attribute setting which is not required for particular phone object. Which is complex to implement if we don't have builder class and doing via only Phone class.
