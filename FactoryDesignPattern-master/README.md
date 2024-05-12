# FactoryDesignPattern

The factory design pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without specifying the exact class of the object to be created.

# Type: This falls in creational design pattern. 

# Explanation:
  1. OS.java is an interface and Three different classes(Windows, IOS, Android) are implementing this interface.
  2. FactoryPattern is a class which is responsible for returnning the instance of required class based on type(Factory in our case).
  3. FactoryMain will create a object of factoryPattern class and will get an instance of required class and then will call getSpecification of that class.

So, in this way we can see, how object creation is abstracted from the actual application FactoryMain and have been transferred to FactoryPattern which is acting as Fatory in this example.
