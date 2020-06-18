
// Sheimy Paz Serpa
// Description: This superclass shows help me to show inheritance, overriding
// and polymorphism.
public class Parent {
  String usingSuper = "I'm using super here.";

  /**This method is used to describe inheritance.
   * 
   */
  public void example() {

    System.out.println("I'm the example method.");
    // Milestone3 req3 description and use of inheritance
    System.out.println("I am a superclass that inhers from the inheritance class.");
    System.out.println("Super Class is the class whose features are inherited.\n"
        + "Also known as a base class or parent class.\n"
        + "Sub Class is the class that inherits the other class.\n"
        + "Also known as a derived class, extended class or child class.\n"
        + "Reusability is used to create a new class when there is already a class.\n"
        + "That includes some of the code that we want to use."
        + " Only public methods can be inhered");
  }

  /**This method is used to show an example of overriding.
   */
  public void overriding() {
    System.out.println("This is an example of overriding.");
    System.out.println("Uses the same method in one of the subclasses and recreates it.");
    System.out
        .println("This method will override or overpower the methods that have been inhered.");
  }

  void polyExample() {
    System.out.println("This class is using polymorphism.");
  }

}

