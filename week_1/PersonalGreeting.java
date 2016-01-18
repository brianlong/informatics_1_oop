public class PersonalGreeting {
  public static void main( String[] args ) {
    // I'm making sure that we set a default value if the argument is empty.
    String first_name = args.length == 0 ? "" : args[0];
    String last_name  = args.length == 1 ? "" : args[1];

    // Using String concatenation:
    System.out.println("Hello " + first_name + " " + last_name);
  } // main
} // class

// Using String interpolation:
// System.out.println(String.format("Hello %s %s", first_name, last_name));

// Another way to do it with a try/catch block to catch exceptions of null args.
// try {
//   String first_name = args[0];
//   String last_name  = args[1];
//   // Using simple contcatenation:
//   System.out.println("Hello " + first_name + " " + last_name);
// } catch (ArrayIndexOutOfBoundsException e) {
//   System.out.println("Must provide at least two arguments");
//   System.out.println("Proper Usage is: `java PersonalGreeting first_name last_name`");
// } // try catch finally
