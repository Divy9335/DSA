import java.util.Scanner;

public class FarAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int lengthOfArray = sc.nextInt();
            int limitForAandB = sc.nextInt();
            int arr [] = new int[lengthOfArray];
            long ans =0;
            for(int i=0;i<lengthOfArray;i++){
                arr[i] = sc.nextInt();
                ans+= Math.max(Math.abs(1-arr[i]),Math.abs(limitForAandB-arr[i]));

            }
            System.out.println(ans);


        }
    }
}
