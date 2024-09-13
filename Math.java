public class math {
    public static void main(String[] args) {
        int x = 23;
        int y = 30;
        
        // System.out.println("Max nuber is : " +  Math.max( x, y));
        // System.out.println("Min nuber is : " + Math.min(x, y));
        // System.out.println(Math.sqrt(x));
        System.out.println((Math.random()*100)+1);
        System.out.println(x > y);
        if (x > y) {
            System.out.println("x greater than y");
        }
        else {
            System.out.println(" x les than y");

        }

        int i = 1;


        while (i < 5 ) {
            System.out.println(i);
            i++;
       }
        int j =1;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);


        int countdown = 15 ;
    while (countdown > 0)  {
        System.out.println(countdown);
        countdown--;
    }
    System.out.println("Happy birthday");




    }

    
    
}
