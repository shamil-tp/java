import java.util.Scanner;

class TemperatureAnalysis {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        double[] temps = new double[7];
        // double[] temps = {22.5, 25.0, 19.8, 30.1, 28.4, 21.0, 24.5};

        // double[] temps = new double[]{22.5, 25.0, 19.8};

        // double[] temps;  Declaration (variable exists, but no array yet)
        // ... some logic ...
        // temps = new double[7]; Initialization (memory is allocated)

        // double temps[] = new double[7]; discouraged but valid
        double result = 0;
        double peak = 0;
        System.out.println("enter temperature for 7 days");
        for(int i = 0 ;i<temps.length;i++){
            System.out.println("enter temperature for day "+i+ ": ");
            temps[i] = scn.nextDouble();
            peak = peak < temps[i]?temps[i]:peak;
            result = result + temps[i];
        }
        result = result/temps.length;
        System.out.println("The average temperature is: "+ result+" Heighest temperature: "+peak);
        
        scn.close();
    }
} 
