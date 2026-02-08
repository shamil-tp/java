import java.util.Scanner;

class HailstoneSequence{
    public static void main(String arg[]){
        Scanner scn = new Scanner(System.in);
        
        int n = -1;

        while(n < 0){
            System.out.println("Enter a Positive number");
            n = scn.nextInt();
        }
        int peak = n;
        int i = 1;
        while(n!=1){
            System.out.println((i++)+" current value of n: "+ n);
            n = (n%2==0)?n/2:((3*n)+1);
            peak = n>peak?n:peak;
        }
        System.out.println("peak is :"+peak);
        scn.close();
    }
}