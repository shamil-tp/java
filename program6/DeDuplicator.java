import java.util.Scanner;
class DeDuplicator {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the value of element "+i);
            arr[i] = scn.nextInt();
            for(int j = 0;j<i;j++){
                if(arr[j] == arr[i]){
                    arr[j] = 0; 
                }
            }
        }

        System.out.print("\nfinal array is: ");
        for(int k = 0;k<arr.length;k++){
            System.out.print(k);
        }
        scn.close();
    }
}
