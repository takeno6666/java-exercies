import java.util.Scanner;

public class baitapnhap1 {

public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
     int ocnum, denum = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
    ocnum= in.nextInt();

    while (ocnum != 0) {
      denum = (int)(denum+ (ocnum% 10) * Math.pow(8, i++));
      ocnum= ocnum / 10;
     }
    System.out.print("Equivalent decimal number: " + denum+"\n");
   }
}