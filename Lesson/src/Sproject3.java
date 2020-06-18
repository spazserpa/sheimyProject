// Milestone1 Requirement#1 Sheimy Paz

/*
 * Milestone1 Requirement#2 Description This program shows the knowledge I acquired about
 * programming using java during the semester I used a switch statement, do-while loops/ while loop
 * if-then statements, Operators, etc.
 */

/*
 * Milestone1 Requirement#3 built-in data types comment Primitive types boolean--> hold just two
 * possible data types: True and False byte--> it has a size of 8 bits, hold numerical date from
 * +127 to -128 char--> size of 16 bits, hold all Unicode characters Short--> size of 16 bits, hold
 * numerical data from +32,767 to -32,768 commonly use to save memory in large array. int--> size of
 * 32 bits, hold numerical data type with no decimal place, from +2,147,483,647 to -2,147,483,648
 * long--> size of 64 bits, hold numerical data type with a range from +9,223,372,036,854,775,807 to
 * -+9,223,372,036,854,775,808 float-->size of 32 bites, holds numerical data type with decimal
 * places, from 3.402,823,5E+38 to 1.4E-45 double--> it ha a size of 64 bits, hold numerical data
 * type with decimal places with a large range from 1.797,693,134,862,315,7E+308 to 4.9E-324 void-->
 * this is empty and is use to return type for functions that do not return a value
 */
// # Milistone2 req4 using a Random class
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
//import java.util.Random; I had to comment out because spotBugs did not found it useful.
//It work perfectly and belong to case 2 in case you want try it. Also there is some commented lines
//there that have be uncomment in case that you want to try it.
import java.util.Scanner;

public class Sproject3 {

  /**
   * Driving method.
   * 
   * @param args this is a time parameter.
   */
  public static void main(String[] args) {
    final StringBuilder intro = new StringBuilder("To my program. \n");
    // Milestone1 Requirement#8 string object by using the keyword new.
    // String greeting = new String("Welcome ");
    String greeting = "Welcome ";


    System.out.print(greeting); // Milestone1 Requirement#4 Greetings.

    System.out.print(intro); // Description: Print out the final variable.

    System.out.println("Here I demostrate all the skills I have learn"
        // Description: Concatenate multiple strings!
        + " through the semester about programing using java? ");
    boolean restart = true;
    while (restart) {


      question(); // Milestone2 req2 Method call and argument.
      Scanner scan = new Scanner(System.in, "UTF-8"); // Description: To get user input
      int age; // Milestone1 Requirement#6 integer variable
      try {

        String answer = scan.nextLine();
        answer = answer.trim();
        if (answer.equals("yes")) { // Mileston2 req6 if/else constructor

        } else if (answer.equals("no")) {

          break;

        } else {
          continue;
        }
      } catch (InputMismatchException number) {
        System.out.println("You only can type 'yes' or 'no'.");

      } catch (Exception e) {
        System.out.println("You have an error" + e);
      }

      System.out.println("What is your name? ");
      String name = scan.nextLine();
      sayHi(" Hi " + name + " Let's start!"
          + " Select what type of content do you want to see in this switch statement. ");

      String userInput = "yes";
      int k = 1;

      do {


        int select = 0;
        System.out.println(" 1 Demostrate: Arithmetic operators like +,-,*,/, throutgh a simple "
            + "calculator. \n "
            + "2 Demostrate: Random class with a for loop using the break statement.\n "
            + "3 Demostrate: Math class this case shows some of the most commun math classes.\n "
            + "4 Demostrate: Ternary constructors.\n "
            + "5 Demostrate: String comparison using the compareTo and equals method.\n "
            + "6 Demostrate: Do while loop.\n "
            + "7 Demostrate: For loop with the continue statement.\n "
            + "8 Demostrate: While loop and some arithmethic and relational operators.\n "
            + "9 Demostrate: Conditional operators.\n "
            + "10 Demostrate: Operator precedence in a coment to the user.\n "
            + "11 Demostrate: How to create escape sequences.\n "
            + "12 Demostrate: Getters and setters, contructure overloading with/withoot parameters,"
            + "objects and overloading methods.\n " + "13 Demostrate: Inheritance, overiding.\n "
            + "14 Demostrate: The use of the keyword 'super' and 'this'.\n "
            + "15 Demostrate and describes polymorphism.\n "
            + "16 Demostrate: Arrays declaration, initialiation and use.\n "
            + "17 Demostrate: Minumun value.\n "
            + "18 Demostrate: Sum of the values using an acumulator.\n "
            + "19 Demostrate: Search an array and identify the index the value vas found.\n "
            + "20 Demostrate: Enhanced for loop.\n " + "21 Demostrate: Multidimentional arrays.\n "
            + "22 Demostrate: Finding a value index on a multydimentional array.\n ");

        do {
          try {

            select = scan.nextInt();
            k = 2;
          } catch (Exception e) {
            System.out.println("not allowed");
            System.out.println("Enter a number: ");
            scan.nextLine();
          }
        } while (k == 1);

        switch (select) { // Milestone2 req8 switch statement
          case 1:
            System.out.println("I can tell you how old are you if you were born in Mars./n");
            System.out.println("How old are you : ");
            age = scan.nextInt();
            // Milestone1 Requirement#7 double variable. it stores the calculation result.
            double resultant = returnMethod(age);

            System.out.println(name + " you are " + resultant + " years old on Mars! ");
            System.out.println("In this line, your ages is giving in a double data type ");
            System.out.println("So you are " + (int) resultant + " years old"); // Milestone1
            // Requirement#12 Using casting.
            System.out.println("This line is using concatenation.\n"
                + "concatenation is used to convert an object or a variable of one type to"
                + " another. " + "\nIn this case we are narrowing(convert large to small type)"
                + "\nWe also can use Widening(convert small to larger type)\n "); // Milestone1
            // Requirement#13 Format strings using escape sequences.

            break;
          case 2:
            System.out.println("This for loop uses a random class with a break statement.\n");
            // Random rand = new Random();

            for (int counter = 1; counter <= 10; counter++) { // Milestone2 req15 for loop.
              // int randNumber;
              // randNumber = rand.nextInt();

              // if (counter == 289) {
              /*
               * Milestone2 req9 the == operator compares the objects references(same memory
               * location)
               */
              // break; // Milestone2 req17 using break in the loop and describing

              // }
              // System.out.println(randNumber);
            }
            System.out.println("In case that this loop generates a random number equals to 28945 "
                + "the program will go to the break statement and jump out of the loop.");
            break;
          case 3:
            double ceilNum = 2.4;
            System.out.println("In this part of the program we use the Math class."); // Milestone2
            // req5 math class
            System.out.println("The Math class provides more advance mathematical calculations"
                + " than the basic Java math operands provide.\n"
                + "This is some of the most used!");
            System.out.println("Abs math class find absolute value of -78: " + Math.abs(-78));
            System.out.println("Ceil math class rounds up, EX 2.4 is: " + Math.ceil(ceilNum));
            System.out.println("Floor rounds down, EX 2.4 is: " + Math.floor(ceilNum));
            System.out
                .println("Max find the maximum value of two numbers, Ex 2,4 is: " + Math.max(2, 4));
            System.out
                .println("NOTE: This math class(max)take multiple parameters in a single method\n"
                    + "In this case takes two numbers separated by a comma 2 and 4.");
            System.out
                .println("Min gives the lesser of the two numbers Ex 2,4 is: " + Math.min(2, 4));
            System.out.println("Pow takes also two parameters the second number is the one is "
                + "raised ex (2,4): " + Math.pow(2, 4));
            System.out
                .println("Sqrt takes one parameter and find the sqrt, ex 81: " + Math.sqrt(81));
            break;
          case 4:
            int x = 1;
            System.out.println(
                "Ternary constructors can be use to check conditions like if a number is even or"
                    + " odd.");
            do {
              try { // Milestone3 req14

                System.out.println("Please enter a number to check: ");
                int number;
                number = scan.nextInt();
                // Milestone2 req7 ternary constructs
                String response = number % 2 == 0 ? " is even" : " is odd";
                System.out.print(number + response + "\n");
                x = 2;
              } catch (InputMismatchException value) {
                System.out.println("Not letters allowd.");

              } catch (Exception e) {
                System.out.println("Not allowed");

              }
              scan.nextLine();
            } while (x == 1);
            break;
          case 5:

            System.out.println("let's compare ICE and ice using the compareTo method.");
            System.out.println("This method compares strings lexicographically.");
            String str1 = "ICE";
            String str2 = "ice";
            // Milestone2 req9 compare using CompareTo and == operator
            System.out.println(str1.compareTo(str2) + " is the result we get when we use tocompare"
                + " (it is a negative value) "
                + "because the string object lexicographically precedes the argument string.");
            System.out.println("The result of the value would be positive if the string object "
                + "lexicographically follows the argument string.");
            System.out.println("The result would be zero if the string were equal.");
            // Milestone2 req9 compare == operator
            System.out
                .println("The == operator compares the objects references(same memory location).");
            System.out.println("The .equals() is used for object comparison. "
                + "It evaluate the comparison of values in the objects.");
            break;
          case 6:
            System.out
                .println("The do while loop will always preform a task before test the condition.\n"
                    + "Then if the condition is true it will preform the following task"
                    + " until the condition become false.");
            int integer = 10;
            do { // Milestone2 req16 using do while loop
              System.out.println(integer);
              integer--; // Milestone2 req10 using the decrement operator --.
            } while (integer > 0);
            System.out.println("This is an example of a count backward using "
                + "a do while loop and the decrement operator --.");
            break;
          case 7:
            System.out.println("This is a for loop it uses the increment operator ++ and the "
                + "continue statement.");
            System.out.println(
                "The continue statement breaks one iteration if a specified condition occurs.");
            int m = 1;
            do {
              try {
                System.out.println("Enter a number between 1 and 9 please: ");

                int a = scan.nextInt();
                // Milestone2 req15 for loop
                for (int i = a; i < 10; i++) {
                  if (i == 4) { // Milestone2 req18 using a loop with a continue statement.
                    continue;
                  }
                  System.out.println(i);

                }
                System.out.println("If you type any number before 4 \n"
                    + "you will see that 4 does not apear in the" + " console\n"
                    + "That is because when i=4 the condition is meet\n"
                    + "but the continues statement help the task to continue running until i<10.");
                m = 2;
              } catch (InputMismatchException e) {
                System.out.println("You can only enter a number between 1 and 9.");
              } catch (Exception e) {
                System.out.println("Not allowed");
              }
              scan.nextLine();
            } while (m == 1);
            break;
          case 8:
            System.out.println("This part of the program uses a while loop and some Arithmetic and"
                + " Relational operators.");
            System.out.println("Relational Operators.\n" + "==(equal to)\n" + "!=(not equal)\n"
                + ">(grater than)\n" + ">=(greater than or equal to)\n" + "<(less than)\n"
                + "<=(less than or equal to)");
            // Milestone2 req11 relational operators
            int e = 2;
            int sum = 0;
            while (e <= 5) { // Milestone2 req14 while loop
              sum += e;
              e++;

            }
            System.out.println("sumation: " + sum);
            // Milestone2 req10
            int t = 2;
            int b = 10;
            int c = 0;
            int d = 2;
            int h = 6;
            int f = 9;
            System.out.println(t + b + " This statement uses the + arithmetic operator.");
            System.out.println(t - h + " This statement uses the - arithmetic operator.");
            System.out.println(b / d + " This statement uses the / arithmetic operator.");
            System.out.println(c * b + " This statement uses the * arithmetic operator.");
            System.out.println(h % f + " This statement uses the % arithmetic operator.");

            break;
          case 9:
            // Milestone2 req12
            int firstVal = 2;
            int secVal = 4;
            System.out.println("This part of the program uses the && and || operators.\n"
                + "The conditional operators && (AND) evaluates if the two conditions are true."
                + "The conditional operator || (OR) evaluates if at least one condition is true.");
            if ((firstVal == 2) && (secVal == 4)) {
              System.out.println("The first value is equal to 2 and the second is equal to 4.");
            }
            if ((firstVal == 2) || (secVal == 7)) {
              System.out.println("One of the other is equal to 2.");
            }
            break;

          case 10:
            // Milestone2 req13
            System.out.println(
                "The operator precedence is the order in which the operators are evaluated "
                    + "in an expression with several operators\n"
                    + "For example when two operators share an operand the operator with the higher"
                    + " precedence goes first.\n"
                    + "It works like in math when you have multiplication and subtraction "
                    + "in the same opearation\n" + "multiplications goes first.\n"
                    + "Like when you have addition and subtraction in the same exercise you"
                    + " have to work from left to right.\n"
                    + "Having always presented the precedence of each operator!");
            break;

          case 11:
            System.out.println("Using this series of characters you can create scape sequences.");
            System.out.println("\\t  // insert a tab in the text at this point.\n"
                + "\\b  //insert a backspace in the text a this point.\n"
                + "\\n // insert a newline in the text at this point.\n"
                + "\\r // insert a carriage return in the text at this point.\n"
                + "\\f // Insert a formfeed in the text at this point.\n"
                + "\\' //insert a single quote character in the at this point.\n"
                + "\\'' //insert a double quote character in the at this point.\n"
                + "\\\\  //insert  a backslash character in the text at this point.");
            break;

          case 12:
            // Milestone3 req1
            // building objects. These objects are going to use the methods class
            // depending on the info they had they are going to chose the constructor that match
            // //it needs
            System.out.println("This statement shows objects using it the 'MethodExample' class\n"
                + "Wich is a separate class that has private fields, public getters, and setters\n"
                + "and a constructor with parameters and without parameters");
            System.out.println("Private fields and methods are only accessible inside the "
                + "class they are declared or inside the inner classes");
            System.out.println("Getters and setters are also known as accessors and mutators "
                + "are used to protect your data.\n"
                + "They also allow you to control how important"
                + " variables are accessed and updated in your code.");
            System.out.println("Getter methods return its value.");
            System.out.println("Setter methods set or update its value.");
            System.out.println("Contractors without parameters are known as default constructor.");
            System.out.println("constructor with parameters can be used to initialize fields of the"
                + " class with your own values.");
            System.out.println("Overload contructor are usefull when creating objects with "
                + "differents arguments.");
            // objects
            MethodExample methodExampleObject = new MethodExample(); // no parameters
            MethodExample methodExampleObject2 = new MethodExample(5); // 1 parameter
            MethodExample methodExampleObject3 = new MethodExample(5, 13); // 2parameter
            MethodExample methodExampleObject4 = new MethodExample(5, 13, 43); // 3 parameter
            // this is going to return MethodExobject with no arguments
            // This is constructor overloading with different argument list
            System.out.printf("%s%n",
                methodExampleObject.toMilitary() + " This object has not parameter");
            System.out.printf("%s%n",
                methodExampleObject2.toMilitary() + " This object takes 1 parameter");
            System.out.printf("%s%n",
                methodExampleObject3.toMilitary() + " This object takes 2 parameter");
            System.out.printf("%s%n",
                methodExampleObject4.toMilitary() + " This object takes 3 parameter");

            System.out.println("Method overloading allows a class to have more than one method"
                + "having the same name, if their arguments lists are different.");
            System.out.println("In order to overload a method the argument list or the "
                + "methods must differ in one of this:\n" + "Number of parameters\n"
                + "Data type of parameters\n" + "Sequence of Data type of parameters");
            System.out.println("Note: Constructors of a class must have the same name in which "
                + "it resides.\n"
                + "In java Constructors can not be abstract, final, static and Synchronized.\n"
                + "Access modifiers can be used in constructor declaration to control its access."
                + " Which other class can call the constructor.");

            break;
          case 13:
            System.out.println(
                "Inheritance allows classes to inherit fields and methods of another class.");
            // Milestone3req3 Inheritance1 object
            Child inheritanceObject = new Child();
            inheritanceObject.example();
            // overriding
            Parent inheritance1Object = new Parent();
            inheritance1Object.overriding();

            break;
          case 14:// Milestone3 req3
            System.out.println("The Super keyword is used to access methods of the parent class.");
            System.out.println("While this keyword is used to access methods of the current class");
            System.out.println("we can see the use of 'this' in case: 12");
            // using supper key word
            new Child().overriding();
            break;
          case 15:
            System.out.println("Polymorphism is the ability of an object to take on many forms.");
            // Milestone3 req6 using polymorphism
            Parent[] sh = new Parent[2];
            sh[0] = new Child();
            sh[1] = new MethodExample();

            for (int l = 0; l < 2; ++l) {
              sh[l].polyExample();

            }

            break;
          case 16:
            System.out
                .println("Array is a group of variables that are referred to by a common name.\n"
                    + "An array variable can also be declared like other variables with[] after "
                    + "the data type.\n"
                    + "The variable in the array are ordered and each index beginning from 0.");
            System.out.println("We can make a table like this using arrays.");
            System.out.println("Index\tValue");
            int[] numbers = {3, 89, 58, 4, 35}; // Milestone3 req7 array initialization
            for (int counter = 0; counter < numbers.length; counter++) { // array used
              System.out.println(counter + "\t" + numbers[counter]);

            }

            break;
          case 17:// Milestone3 req8
            System.out.println(
                "this piece of codes demostrates how to find the minumun value in an array.");

            int[] num = {6, 9, 8, 1, 4, 2};
            Arrays.sort(num);
            System.out.println(num[0]);

            break; // Milestone3 req9
          case 18:
            System.out.println("This is how we sum the values in an array using accumulator.");
            int[] j = {21, 45, 6, 3, 47, 6};
            sum = 0;
            for (int counter = 0; counter < j.length; counter++) {
              sum += j[counter];
            }
            System.out.println("The sum of these numbers are: " + sum);
            break;
          case 19:// Milestone3 req10
            System.out.println("This is how we find an index position of a value in an array");
            int[] myArray = {9, 5, 6, 7, 3, 2, 5};
            System.out.println("Index position of of number 3 is: " + findIndex(myArray, 3));
            break;
          case 20:// Milestone3 req11
            System.out.println("This is how we use an enhanced for loop with an array list.");
            System.out.println("The ArrayList calss can be found in the java.util package."
                + "The difference between a built-in array and ArrayList is that you can change the"
                + " array size either increase or decrease an ArrayList.");
            ArrayList<String> names = new ArrayList<String>();
            names.add("Heim");
            names.add("Ader");
            names.add("Orje");
            names.add("Elia");

            for (String nm : names) {
              System.out.println(nm);
            }
            break;
          case 21:// Milestone3 req12,13
            System.out.println("This is how we use multydimentional arrays.");
            int[][] multyArray = {{9, 59, 3, 2}, {12, 54, 34, 76}};
            System.out.println("First array");
            display(multyArray);
            int[][] multyArray1 = {{45, 6, 8, 988}, {65}, {5, 45, 31}};
            System.out.println("Second array");
            display(multyArray1);
            break;
          case 22:
            System.out.println(
                "This program find the maximum value in a 2d array and" + " find its index.");

            int[][] arr = {{4, 44, 5, 7, 63, 1}, {7, 88, 31, 95, 9, 6}, {88, 99, 6, 5, 77, 4}};
            int max = arr[0][0];
            int maxRow = 0;
            int maxColumn = 0;
            for (int i = 0; i < arr.length; i++) {
              for (int y = 0; y < arr.length; y++) {
                if (arr[i][y] > max) {
                  max = arr[i][y];
                  maxRow = i;
                  maxColumn = y;
                }
              }
              System.out
                  .println("The max is: " + max + " at index [" + maxRow + "][" + maxColumn + "]");
            }
            break;
          default:
            System.out.println("You enter a letter");


        }

        System.out.println("If you want to come back to the menu selection type yes.");
        userInput = scan.next();


      } while (userInput.equalsIgnoreCase("yes"));

      /*
       * Milestone1 Requirement#9 Definition of variable: A variable is a unit that must be a
       * certain size and may be assigned to a value
       */

      /*
       * Milestone1 Requirement#10 define the term scope: Scope is a specific location in a program
       * where a defined variable exists but it can not be accessed any other place.
       * 
       * /*Milestone1 Requirement#11 definition of final variable --> A Final variable can not be
       * re-assign any other value once the value is assign.
       */
      scan.close();
    }

  }


  static void question() { // Milestone1 Requirement#8 String object using string literal
    String question = "If you want to know more about it type yes otherwise type no. ";
    System.out.println(question);
  }

  //// #16 Milestone2 req3 static double returnMethod(integer age) is the header
  //// and age is a parameter
  // Mileston2 req1 create a method with argument and return value
  static double returnMethod(int age) {
    double daysInMars = 686.98; // this are the equivalent Earths days for a Mars year
    return age * 365.25 / daysInMars;
  }

  static void sayHi(String name) {
    System.out.println(name);
  }

  /**
   * This is a getter method.
   * 
   * @param num to find length. @return.
   */
  public static int getMinValue(int[] num) {
    int minValue = num[0];
    for (int i = 1; i < num.length; i++) {
      if (num[i] < minValue) {
        minValue = num[i];
      }
    }
    return minValue;

  }

  /**
   * This method is used to find the index of a value in an array.
   * 
   * @param array is set to null.
   * @return a negative value.
   */
  public static int findIndex(int[] array, int t) {
    if (array == null) {
      return -1;

    }
    int len = array.length;
    int i = 0;
    while (i < len) {
      if (array[i] == t) {
        return i;

      } else {
        i = i + 1;

      }

    }
    return -1;
  }

  /**
   * Method takes a parameter.
   * 
   * @param x is used with an array.
   */
  public static void display(int[][] x) {
    for (int row = 0; row < x.length; row++) {
      for (int column = 0; column < x[row].length; column++) {
        System.out.print(x[row][column] + "\t");

      }
      System.out.println();
    }

  }

}


