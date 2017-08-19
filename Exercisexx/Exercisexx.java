import java.util.Scanner;
public class Exercisexx {
  public static void main(String[]abc) {
    int row,column;

    Scanner in = new Scanner(System.in);
    System.out.print("input a =");
    int a =in.nextInt();
    while(a<9){
      System.out.print("a should be bigger than 9"+"\n");
      System.out.print("input a =");
      a =in.nextInt();
    }
    System.out.print("input position :");
    int position = in.nextInt();
    while(position>4){
      System.out.print("position should be 1,2,3 or 4"+"\n");
      System.out.print("input position :");
      position = in.nextInt();
    }
    switch(position) {
      case 1:
          for(row=0;row<=a;row++){
            for(column=0;column<=a;column++){
              if(column<=row){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.print("\n");
          }
        break;
        case 2:
          for(row=0;row<=a;row++){
            for(column=0;column<=a;column++){
              if(column>=row){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
          }
          System.out.print("\n");
        }
          break;
        case 3:
        for(row=a-1;row>=0;row--){
          for(column=0;column<=a;column++){
            if(column<=row){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }
          }
          System.out.print("\n");
          }
          break;
          case 4:
          for(row=a-1;row>=0;row--){
            for(column=0;column<=a;column++){
              if(column>=row){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.print("\n");
          }
          break;
    }
  }
}

