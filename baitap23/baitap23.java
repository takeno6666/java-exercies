import java.util.Scanner;
public class baitap23{
  //convert binary number to hexadicimal number//
  public static void main(String[]abc){

    Scanner in = new Scanner(System.in);
    System.out.print("input a binary number :");
    int binum = in.nextInt();
    int rem=0;
    int dinum=0;
    int j=1;
    int i=0;
    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    String result="";

    while(binum!=0){
      rem = binum%10;
      dinum=dinum+rem*j;
      j=j*2;
      binum=binum/10;
    }
    while(dinum>0){
      i = dinum%16;
      result= hex[i]+result;
      dinum= dinum/16;

    }
    System.out.print("hexadicimal number is :"+result+"\n");

  }
}