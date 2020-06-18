// Sheimy Paz Serpa
// This class uses the keyword extends, super and help to provide the ex of
// inheritance and polymorphism in my project
public class Child extends Parent {
  /**.
   *This method uses the word super.
   */
  public void overriding() {
    System.out.println(super.usingSuper);
    System.out.println("This is the action of override a method."
        + " It is used the same method but recreates it.");
  }

  void polyExample() {
    System.out.println("This is child class using polymorphism.");
  }

}


