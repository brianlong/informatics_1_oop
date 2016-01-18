public class Multiplier {
  public static void main( String[] args) {
    try {
      int myNumber1 = Integer.parseInt(args[0]);
      int myNumber2 = Integer.parseInt(args[1]);
      int myNumber3 = Integer.parseInt(args[2]);
      int answer    = myNumber1 * myNumber2 * myNumber3;
      System.out.println(String.format("%s * %s * %s = %s", myNumber1, myNumber2, myNumber3, answer));
    } catch (Exception e) {
      System.out.println("Must provide at least three integer arguments.");
      System.out.println("Proper Usage is: `java Adder integer_1 integer_2 integer_3`");
    }
  }
}
