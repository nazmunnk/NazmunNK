import java.util.Scanner;

public class EvenOddCal {
    public static void main(String[] args) {
        Scanner num1= new Scanner(System.in);

        System.out.print("Enter starting num : ");
        int n1= num1.nextInt();
        System.out.print("Enter ending num : ");
        int n2= num1.nextInt();

        int countEven=0;
        int countOdd=0;
        int[ ] arr= new int[100];
        for(int i=n1;i<=n2;i++)
        {
            if(i%2==0)
            {
                countEven++;
                arr[countEven]=i;
            }
            countOdd++;
        }
        countOdd=countOdd-countEven;
        System.out.println("Total even number count: " +countEven);
        System.out.println("Total odd number count: " +countOdd);
        System.out.print("The even numbers between "+n1+" and " +n2 +" are: ");
        for(int j=1;j<=countEven;j++)
        {

            System.out.print(" " +arr[j]);
        }
    }
}
