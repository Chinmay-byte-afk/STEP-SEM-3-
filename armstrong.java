import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number: ");
        int number=sc.nextInt();
        int origNumber=number;
        int sum=0;
        while(number!=0){
            int digit=number%10;
            sum=digit*digit*digit+sum;
            number=number/10;
        }
        boolean Isarmstrong= (origNumber== sum);
        System.out.print("Is the number " + origNumber + " an Armstrong number? " + Isarmstrong);   
    }
}
