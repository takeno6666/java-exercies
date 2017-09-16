import java.util.Scanner;
public class baitap22{//convert binary number to dicimal number//
  public static void main(String[]abc){

    Scanner in = new Scanner(System.in);
    System.out.print("input a binary number: ");
    int binum=in.nextInt();
    int dinum=0;
    int rem,j=1;

    while(binum!=0){
      rem = binum%10;
      dinum = dinum+rem*j;
      j=j*2;
      binum= binum/10;
    }
    System.out.print("dicimal number is :"+dinum);

  }
}