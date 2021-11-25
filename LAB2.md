# Topic: Structural Design Patterns:
## Author: Piciriga Bogdan
## Introduction/Theory: 
These design patterns are all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways 
to compose objects to obtain new functionality. That can be used in many different situations. Creational design patterns are all about class instantiation. This pattern can be 
further divided into class-creation patterns and object-creational patterns. While class-creation patterns use inheritance effectively in the instantiation process, object-creation
patterns use delegation effectively to get the job done.
## Implementation & Exaplanations:
For the implementation of this laboratory work, the Police Department was taken as a model and was extended. 

In my laboratory work I implemented 3 structural design patterns: decorator, adapter and facade.

### Facade: 
In com/company/Police/facade is facade pattern which implements arrest and patrol simulation. The whole subsystem in com/company/Police/facade/arrestSystem was represented in
com/company/Police/facade/Arrest.java class.
### Decorator:
In com/company/Police/decorator is represented a criminal board using decorator pattern. Two boards got different criminals, like "thief", "maniac" and "drugDealer"
### Adapter: 
In com/company/Police/adapter is simulated a weapon modification using adapter pattern. With adapter pattern I made that you can modify a gun by adding a collimator.
## Results/Screenshots/Conclusions:
In conclusion, by using facade pattern I was able to represent the whole subsystem by only Arrest class. Decorator pattern allowed me to create different board with
different types of criminals on it. I was able to add various criminals on my boards. With adapter pattern I was able to to work with 2 incompatible interfaces. So, with
structural design patterns we can make our code more flexible, usable and efficient. They help us to make our system cleaner and simplier.
