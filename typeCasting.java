public class typeCasting {
    public static void main(String[] args) {
        int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0

    int maxScore =500;
    int userScore = 427;
    float percentage = (float) userScore / maxScore*100.0f;
    System.out.println("User percentage: " + percentage);

    int x = 28;
    int y = 5;
    System.out.println(x%y);   //give rimender

    String name = "Md Ataullah Ansary";
    System.out.println(name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    
    String txt = "Believe you can and you’re halfway there";
     System.out.println(txt.indexOf("and"));



     String p = "10";
     String q = "20";
     String r = p + q;  // r will be 1020 (a String) 
     System.out.println(r);  


                        //    \n 	=  New Line	
                        //    \r	=  Carriage Return	
                        //    \t	=  Tab	
                        //    \b	=  Backspace	
                        //    \f	=  Form Feed




    }
}
