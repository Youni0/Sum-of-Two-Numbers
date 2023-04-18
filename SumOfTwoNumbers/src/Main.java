import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        n1 = scanner.nextInt();
        System.out.println("Insert second number: ");
        n2 = scanner.nextInt();
        System.out.println("Sum of two: "+sumoftwo(n1,n2));

    }
    public static int sumoftwo(int x, int y){
        int sum=0;
        sum=x+y;
        return sum;
    }
}