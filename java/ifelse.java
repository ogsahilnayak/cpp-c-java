import java.util.Scanner;
public class ifelse{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("the number is even!!");

        }
        else{
            System.out.println("the number is odd!!");
        }
        


    }
}