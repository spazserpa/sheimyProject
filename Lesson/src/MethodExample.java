// Sheimy Paz Serpa
// This class used the keyword extends, has constructors with and
// without arguments also uses polymorphism and shows how to set a clock.
public class MethodExample extends Parent {
  private int hour;
  private int minute;
  private int second;

  // milestone3 req2 overload methods differ in number of parameters
  public MethodExample() {// constructor 0 arguments
    this(0, 0, 0);
  }

  public MethodExample(int h) {// constructor 1 arguments
    this(h, 0, 0);
  }

  public MethodExample(int h, int m) {// constructor 2 arguments
    this(h, m, 0);
  }

  public MethodExample(int h, int m, int s) {// constructor 3 arguments
    setTime(h, m, s);

  }

  public void setTime(int h, int m, int s) {
    setHour(h);
    setMinute(m);
    setSecond(s);
  }

  public void setHour(int h) {
    hour = ((h > 0 && h < 24) ? h : 0);
  }

  public void setMinute(int m) {
    minute = ((m > 0 && m < 60) ? m : 0);
  }

  public void setSecond(int s) {
    second = ((s > 0 && s < 60) ? s : 0);
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;

  }

  public String toMilitary() {
    return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
  }

  void polyExample() {
    System.out.println("This is the methodExample class using polymorphism.");
  }
}
