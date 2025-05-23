import java.util.Scanner;

public class rainWater {
    public static int rainTrap(int arr[],int width){
        int ans =0;
        int leftMax [] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        rightMax[arr.length-1]=arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            ans= ans+ ((waterlevel-arr[i])*width);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array :");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the height of each bar/Array :");
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the width of bar :");
        int width = sc.nextInt();
        System.out.println("Rainwater traped is :"+rainTrap(arr,width));


    }
}