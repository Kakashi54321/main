# ObserverDesignPattern
Observer pattern is classified among the behavioral design patterns. Behavioral design patterns are most specifically concerned with communication between classes/objects.
It defines a one-to-many mapping between objects so that when one object changes state, all its dependents are notified and updated automatically.
This pattern is commonly called Publish-Subscribe and is the cornerstone for Reactive Programming.

# Participants 
Let us take a look at all the participants in this design pattern.
1) Subject: This class provides an interface for registering and deregistering observers. This has a list of observers that has registered with it.

2) Observer: This class defines an interface that gets called when an subject changes. Based on a subject’s implementation, the new data gets pushed to the observer or it is the duty of the observer to get the refreshed state of the subject. 

3) ConcreteSubject: This class is a subclass of Subject and contains the state which the observers are interested in. This sends a notification to its observers when its state changes. (Channel.Java)
 
4) ConcreteObserver: This class is a subclass of Observer and stores a copy of the subject’s state that it is interested in. This has a reference to the subject so that, it can query the latest state of the subject. This object implements the interface that gets called when the subject state’s changes. (Subscriber.java)

# How it works
The subject changes its state after some work/task.
The subject notifies the observers, registered with it, of the need to update itself since the observer’s state is now inconsistent with that of the subject. To do this, the subject’s notify() method is called, which in turn calls the update() method of the observer.
Depending upon the implementation, the new data is either pushed to the observer using the update() method or the observer queries for the new state of the subject. The information received from the subject is used to reconcile the observer’s state.
