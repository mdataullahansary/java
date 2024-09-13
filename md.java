import java.util.Scanner;


/**
 * md
 */
public class md {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("January");
                break;
                case 2: 
                System.out.println("Febuary");
                break;
                case 3: 
                System.out.println("March");
                break;
                case 4: 
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("JUne");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("SEPTEMBER");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November");
                break;
                default:
                System.out.println("December");
                break;
        }




       
        }

        
    }
