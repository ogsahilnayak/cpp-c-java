import java.util.Scanner;
// we have to import java.util.scanner in order to take input from user

public class input {
    public static void main(String [] args){

        System.out.println("java input: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println("here is the number: "+num);
    }
}
