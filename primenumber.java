import java.util.Scanner;
class primenumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int number=sc.nextInt();
        boolean isPrime=true;
        if(number<2){
            isPrime=false;
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.print("Is the number "+ number + " a Prime Number "+ isPrime);
    }
}