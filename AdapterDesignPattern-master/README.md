# AdapterDesignPattern

The Adapter Design Pattern is part of structural patterns, allows two incompatible interfaces to work together.

# Type: This falls in structural design pattern.

# Explanation:

1. AdapterSchool is main class where we want to write assignmet work. But to write assignment, we need pen, so AssignmentWork class has a pen object and write method.
2. Now AdapterSchool has to pass pen instance to assignmentWork to write assignment but it doesn't have pen instance as it's an interface and there is no class which is implementing this pen interface. There is a problem now.
3. Now penAdapter comes to rescue, which basically takes independent pilotPen which has nothing to do with all these assignment, pen interface and school or anything and it implements pen interface and heps in writing the way pilotPen writes.
4. Now AdapterSchool is happy, it creates pen instance with penAdapter and passes to assignmentWork to write the assignment and problem is solved. :-)
 So, in this way we can see how penAdapter is coverting the pilotPen into the pen way of writing because there is no real pen from pen interface. so, took pilotPen and made it to work like pen interface.
