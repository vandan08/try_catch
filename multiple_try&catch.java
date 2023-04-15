import java.util.*;
public class exam2 {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array index : ");
        int ind = sc.nextInt();

        System.out.print("Enter the number which the value want to divide : ");
        int num = sc.nextInt();

        try {
            System.out.println("The value at entered index is : " + marks[ind]);
            System.out.println("The division of given values are : " + marks[ind] / num);
        }
        catch (ArithmeticException a){
            System.out.println("Please enter a valid integer number to divide !!");
            System.out.println("NOTE : You can't divide any number by zero !!");
        }
        catch (ArrayIndexOutOfBoundsException arr){
            System.out.println("Please enter a valid index of given array !! ");
            System.out.println("If you enter wrong index then this exception occurs  :" + arr);
        }
//        catch (InputMismatchException i ){
//            System.out.println("Pls enter a integer value , You can't enter a String/ Float/ etc... values in behalf of integer !! ");
//        }
        catch (Exception e){
            System.out.println("Exception are occuring !! ");
            System.out.println(e);
        }

        System.out.println("Have a nice day ");


    }
}



