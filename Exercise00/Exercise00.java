public class Exercise00 {

  public static void main (String [] arg) {

    for ( int row =0 ; row <15 ; row ++) {
      for (int column = 0 ; column <46 ; column ++) {

        if (row <9 && column <12 ){
          if ((( row %2 ==0 && column %2 ==0) ||( row %2 !=0 && column %2 !=0)) && column <11) {

            System.out.print ("*");
          } else {
            System.out.print (" ");
          }
          } else {
            System.out.print ("=");
          }
        }
          System.out.print ("\n");


    }
  }
}
