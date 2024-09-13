import java.util.Scanner;

/**
 * loops
 */
public class loops {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       //for (initialization; condition; update) { 
 // body of-loop 

      int i = 1;
      while (i<a) {
       if (i%2 == 0) { 
        System.out.println(i);
        
       }
        i++;
      }
      }
}
 
    




