import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice;

        do{
            //Choices for mathematical purposes
            print("----------------------OPTIONS--------------------------\n");
            print("-------------------1. Addition-------------------------\n");
            print("-------------------2. Subtraction----------------------\n");
            print("-------------------3. Multiplication-------------------\n");
            print("-------------------4. Division-------------------------\n");
            print("-------------------5. Square root----------------------\n");
            print("-------------------0. Exit-----------------------------\n");
            print("-------------------------------------------------------\n");

            print("Enter you choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    addition(inp);
                    break;
                case 2:
                    subtraction(inp);
                    break;
                case 3:
                    multiplication(inp);
                    break;
                case 4:
                    division(inp);
                    break;
                case 5:
                    squareRoot(inp);
                    break;    
                default:
                    print("\n\nInvalid choice");
                    break;
            }
        }   while (choice != 0);

        inp.close();
    }
    //Method for addition         //in order to use the "scanner" in other method "Scanner inp" must be put in the parameter and argument
    public static void addition(Scanner inp){
        int num1, num2;

        print("Enter a number: ");
        num1 = inp.nextInt();
        print("Enter another number: ");
        num2 = inp.nextInt();

        num2 += num1;
        print("The sum is: "+num2+"\n\n\n\n");

       
    }
    //Method for subtraction
    public static void subtraction(Scanner inp){
        int num1, num2;

        print("Enter a number: ");
        num1 = inp.nextInt();
        print("Enter another number: ");
        num2 = inp.nextInt();

        num2 -= num1;
        print("The difference is: "+num2+"\n\n\n\n");

    }
    //Method for multiplication
    public static void multiplication(Scanner inp){
        int num1, num2;

        print("Enter a number: ");
        num1 = inp.nextInt();
        print("Enter another number: ");
        num2 = inp.nextInt();

        num2 *= num1;
        print("The product is: "+num2+"\n\n\n\n");

    }
    //Method for division
    public static void division(Scanner inp){
        int num1, num2;

        print("Enter a number: ");
        num1 = inp.nextInt();
        print("Enter another number: ");
        num2 = inp.nextInt();

        num2 /= num1;
        print("The qoutient is: " + num2 + "\n\n\n\n");

    }
    //Method for square Root
    public static void squareRoot(Scanner inp){
        double num1;

        print("Enter a number: ");
        num1 = inp.nextInt();

        double result = Math.sqrt(num1);
        print("The principal root is: " + result + "\n\n\n\n");

    }

    public static void print(String message){
        System.out.print(message);
    }

}
//End of file