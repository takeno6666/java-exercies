import java.util.Scanner;
public class baitap33 {
//sum of the digits of integer//
  public static void main(String[]abc) {

    Scanner in = new Scanner(System.in);
    System.out.print("input an integer : ");
    int num = in.nextInt();
    System.out.print("Sum of the digits of an iteger :" + sumdigits(num));
    System.out.print("\n");
  }
  private static int sumdigits(int num) {

    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}