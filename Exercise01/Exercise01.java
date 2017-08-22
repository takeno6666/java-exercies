import java.util.Scanner;
public class Exercise01{
  public static void main(String[]abc){

    Scanner in = new Scanner(System.in);

    System.out.print("input a dicimal number: ");
    int a = in.nextInt();
    int array[] = new int[100];
    int i = 0;

    while (a/2>1){
      array[i]= a%2;
      i++;
      a = a/2;
    }
    array[i]= a%2;
    array[i+1]=a/2;
    i++;

    for(;i>=0;i--){
      System.out.print(array[i]);
    }
  }
}