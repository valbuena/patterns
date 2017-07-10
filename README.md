# Patterns
Samples of the design patterns
## Strategy :
Define a family of algorithms, encapsulates each one, and makes them interchangeable. 
Stategy lets the algorithm vary independently from clients that use it.
- Define classes with characterises.
- This characterises have different behavior.

Example:
Ducks have Fly Behavior (Fly or notFly) and Make Sound Behavior (Mute, Quack, Squeak)

## Observer :
Define a one-to-many dependecy between objects so that when one object changes state, all of
its dependents are notified and updated automatically.

- Define Observers and Observable.
- Observable registers and removes observers and when something happens notifiy to
Observers.
- Observers implement Observer interface so it can be called by subject.

Example: Weather Station is observable by alerts.

## Factory :
Define an interface for creating an object, but lets subclasses decide which class to instantiate.
Factory Method lets a class defer instantiation to subclasses.

Centralize instance of classes in one place

Example: Create different pizzas and more complex pizzas in international stores.

## Singleton :
Ensures a class has only one instance, and provides a global point of access to it.

A class is created once.

Example: Simple, with lazy creation and synchronization creation.

## Decorator:
Attaches additional responsibilities to an object dynamically. 
Decorators provide a flexible alternative to subclassing for extending functionality.

- Define a element with his properyties and methods
- Define a decorator who create object of the element before

Example: A drink with complements which increase final prize

## Command :
Encapsulates a request as an objec, thereby letting you parameterize other objects with different requests, queue or
log requests, and support undoable operations.

- Define a control of one or several commands which have different functionality
- Define a interface command for define standard commands
- Define the commands

Example: Remote control of Unix commands

## Adapter :
Converts the interface of a class into another interface the clients expect.
Adapter lets classes work together that couldn't otherwise because of incompatible 
interfaces

- We have interface A
- We have interface B
- We define a adapter que implements A and call B

Example: Use enumeration like iterator

## Facade:
Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level
interface that makes the subsystem easier to use.

- We have several classes with complex logic
- We create a class to unified this complex logic in one method call.

## Template:
Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
Template Method lets subclasses redefine certain steps of an algorithm without changing the
algorithm's structure.

- We have a method which calls other methods like an algorithm
- Other methods can be general o can be redefined by concrete class.
- Use the principle : don't call us, we'll call you

## Iterator:
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying 
representation.

- A interface to loop elements without we know their implementation
