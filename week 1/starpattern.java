import java.util.Scanner;
public class starpattern{
    public static void main(String[] args) {
        int rows;
        Scanner sc= new Scanner(System.in);
        System.out.print("rows\t");
        rows=sc.nextInt();
        for(int i=0; i<rows ; i++){
            for(int j=0; j<=i ; j++){
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }
}
