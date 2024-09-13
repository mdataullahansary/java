public class array {
    public static void main(String[] args) {
        // String [] flower = { "Rose", "Hibicus", "Marigold", "Lotus"};
        // System.out.println(flower[0]);
        // flower[0] = "cosmos";   //over write the specific element
        // System.out.println(flower[0]);
        // System.out.println(flower.length);
        

        // //for loop

        // for (int i = 0; i < 4; i++ ) {
        //     System.out.println(flower[i]);
        // }

        // // for each loop

        // for ( String i : flower)
        // System.out.println(i);


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
        for (int i : row) {
        System.out.println(i);
  }
}

        
    }
}
