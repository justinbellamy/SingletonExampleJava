# Singleton Pattern Example Java

A simple design pattern example.

**Concept:** A creational pattern. You basically need one "global-type" object to exist. Implementation is pretty cut-and-dry.

**Pros:** We can be sure that there is only one access point to the class.

**Cons:** Anything "global in nature" leads to tightly coupled classes. We want loosely coupled classes. Unit testing individual classes becomes more difficult.

**Example:** In the following example, we exhibit how the Singleton Pattern can be used to have a single logger for an application. 

To accomplish the Singleton Pattern, we:

* Create a Singleton class.
* Make the class constructor `private`.
* Define a public static method called `getInstance()` so only one single instance of the class ever gets created and returned.

When using Java, in order to make the code thread-safe and to avoid needing synchronization, we:

* Create a static inner class helper to lazily create the singleton instance.
* We return the Singleton Helper's INSTANCE when `getInstance()` is called.

In this example, the class has an ArrayList of type String that can have entries added to it to using the `public void log(String message)` method. 

It also returns the entire log using the `public List<String> getLog()` method.