import java.util.Scanner;
public class baitap24{
  //convert binary number to octal number//
  public static void main(String[]abc){

    Scanner in = new Scanner(System.in);
    System.out.print("input binary number :");
    int binum = in.nextInt();
    int rem=0;
    int dinum=0;
    int j=1;
    int i=0;
    String result="";

    while(binum!=0){
      rem = binum%10;
      dinum=dinum+rem*j;
      j=j*2;
      binum=binum/10;
    }
    while(dinum>0){
      i=dinum%8;
      result=i+result;
      dinum=dinum/8;

    }
    System.out.print("octal number is: "+result+"\n");
  }
}