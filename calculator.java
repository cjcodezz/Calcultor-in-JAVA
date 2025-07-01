// Importing required packages
import java.util.Arrays;
import java.util.Scanner;


public class calculator{


    // This function performs addition
    static int add(int[] arr){
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    // This function performs subtraction
    static int subtract(int[] arr){
        int difference = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            difference -= arr[i];
        }
        return difference;
    }

    // This function performs multiplication
    static int multiply(int[] arr){
        int product = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            product *= arr[i];
        }
        return product;

    }

    // This function performs division
    static int divide(int[] arr){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            result /= arr[i];
        }
        return result;
    }

    // This function displays a thank you message when called
    static void thankyoumessage(){
        System.out.println("--------------------");
        System.out.println("Thank You For Using our Calculator");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 10; // This variable will be used to check user choice to exit or perform an opertion
        System.out.println("-----------------");
        System.out.println("Welcome to our Calculator Program");
        System.out.println("-------------------");
        

        // This program will run infinite times until the user exits the program himself
        while(choice != 0){ 

            System.out.println("Press 0 to exit or any other number to continue : ");
            choice = sc.nextInt();
            if(choice == 0){ // if choice is 0 exit
                thankyoumessage();
                break;
            }
            System.out.println("Enter how many numbers you want to perform the operation on : ");
            int num = sc.nextInt();


            // We are saving the elements in an array to suppor operations on n numbers
            int[] arr = new int[num]; 


            if(num <= 0){
                System.out.println("Invalid Input");
            }
            else if (num <= 100){ // We have currently implemented an upper bound of 100 but we can change it as per requirement
                for(int i = 0 ; i < num; i++){
                    System.out.println("Enter number "+(i+1));
                    arr[i]=sc.nextInt();
                }
                System.out.println("");
                System.out.println("Choose Your Option : ");
                System.out.println(" Press 1 for Addition");
                System.out.println(" Press 2 for Subtraction");
                System.out.println(" Press 3 for Multiplication");
                System.out.println(" Press 4 for Division");
                System.out.println(" Press 0 to Exit");
                choice = sc.nextInt();
                if (choice < 0 || choice > 4) {
                    System.out.println("Invalid choice");
                }
                else if(choice == 0){
                    thankyoumessage();
                }
                else{ // This will check the user choice and run the suitable operation successfully
                    if( choice == 1){
                        int result = add(arr); // The calculated result of the function will be saved in the result variable
                        System.out.println("The result of addition is : "+result);
                    }
                    else if( choice == 2){
                        int result = subtract(arr);
                        System.out.println("The result of subtraction is : "+result);
                    }
                    else if( choice == 3){
                        int result = multiply(arr);
                        System.out.println("The result of multiplication is : "+result);
                    }
                    else{
                        int result = divide(arr);
                        System.out.println("The result of division is : "+result);
                    }

                }
            }
            else{
                System.out.println("Invalid input");
            }

            // As soon one iteration is done the program will move on to the next iteration as long as the chocie of the user is not 0
        }

    }
}