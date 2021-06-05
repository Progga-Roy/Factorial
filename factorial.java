import java.util.Scanner;
public class factorial {
    public static int factorial (int m)
    {
        int factorial=1,i;
        for(i=1;i<=m;i++)
        {
           factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b;
        System.out.print("Enter =");
        a=input.nextInt();
        b=factorial(a);
        System.out.printf("Factorial is %d",b);


    }
}
