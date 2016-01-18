public class Adder {
  public static void main( String[] args ) {
    try {
      int myNumber  = Integer.parseInt(args[0]);
      int myNumber2 = Integer.parseInt(args[1]);
      int answer    = myNumber + myNumber2;
      System.out.println(answer);
    } catch (Exception e) {
      System.out.println("Must provide at least two integer arguments.");
      System.out.println("Proper Usage is: `java Adder integer_1 integer_2`");
    } // try catch
  } // main
} // class
