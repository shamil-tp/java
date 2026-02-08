import java.util.Scanner;


class Quad{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("for \u001B[32m Ax^2 + Bx + C = 0 \u001B[0m \n enter value for A B and C");

        System.out.println("Value for A :");
        int a = scn.nextInt();
        System.out.println("Value for B :");
        int b = scn.nextInt();
        System.out.println("Value for C :");
        int c = scn.nextInt();
        System.out.print("value of a is: "+ a);
        System.out.print(" value of b is: "+b);
        System.out.print(" value of c is: "+ c);


        double d = Math.sqrt(Math.pow(b, 2)-4*a*c);

        if(d > 0){
            System.out.println("Two distinct roots");
            double root1  = (-b + d)/2;
            double root2  = (-b - d)/2;
            System.out.println("Root 1: "+root1+" Root 2: "+root2);
        }else if(d == 0){
            System.out.println("Only one Root");
            double root = -b/2;
        }else{
            System.out.println("Roots have imaginary value");
        }

        scn.close();
    }
}

