import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a posistive integer n");
        int n = scanner.nextInt();
        int sum = n*(n+1) / 2;
        
        System.out.println("Sum: "+ sum);
    }
}

