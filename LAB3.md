#TMPS
# Topic: Structural Design Patterns:
## Author: Piciriga Bogdan
## Introduction/Theory: 
In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication. Behavioral patterns are concerned with the assignment of responsibilities between objects, or, encapsulating behavior in an object and delegating requests to it. Unlike the Creational and Structural patterns, which deal with the instantiation process and the blueprint of objects and classes, the central idea here is to concentrate on the way objects are interconnected.

Mediator Design Pattern
Mediator helps in establishing loosely coupled communication between objects and helps in reducing the direct references to each other.

Observer Design Pattern
Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

State Design Pattern
A state allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

Memento Design Pattern
Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern. The intent of memento pattern is to capture the internal state of an object without violating encapsulation and thus providing a mean for restoring the object into initial state when needed.

Iterator Design Pattern
An iterator design pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Command Design Pattern
Command pattern is a behavioral design pattern which is useful to abstract business logic into discrete actions i.e. commands. It motivates loose coupling.

Strategy Design Pattern
Strategy design pattern is behavioral design pattern where we choose a specific implementation of algorithm or task in run time – out of multiple other implementations for same task.

Template Method Design Pattern
Template method design pattern is widely accepted behavioral design pattern to enforce some sort of algorithm (fixed set of steps) in the context of programming. It defines the sequential steps to execute a multi-step algorithm and optionally can provide a default implementation as well (based on requirements).

Visitor Design Pattern
The visitor design pattern is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to existing object structures without modifying those structures.

Chain of Responsibility Design Pattern
The main objective of this pattern is that it avoids coupling the sender of the request to the receiver, giving more than one object the opportunity to handle the request.


## Implementation & Exaplanations:
For the implementation of this laboratory work, the Police Department was taken as a model and was extended. 

In my laboratory work I implemented 1 behavioural design pattern: state.
The idea is that you need to expand the functionality of the program by adding a court simulation through this pattern. 
By adding information about the criminal (selecting the second item), at the end the client is invited to become a judge for the newly added criminal. So, 
I created two states for a decision in court: imprisonment or compulsory community service.

All states are implemented by Law interface which contains setSentence method which is implemented according to the state. All classes and the interface are located in
com.company.court

[![Screenshot 1468.png](https://i.postimg.cc/jSZDgm1x/Screenshot-1468.png)](https://postimg.cc/dhZQDHvp)

Imprisonment 

[![Screenshot 1469.png](https://i.postimg.cc/pXmcLMD7/Screenshot-1469.png)](https://postimg.cc/qzdx1YDX)

Community Service

[![Screenshot 1470.png](https://i.postimg.cc/L8dD4Y4Y/Screenshot-1470.png)](https://postimg.cc/Xp8dQvC4)

## Results/Screenshots/Conclusions:
In conclusion, by using state pattern I was able to add as many behaviors to an object based on its internal state. So, the state design pattern in Java should be used if 
we have different behavior for each state of our object.
