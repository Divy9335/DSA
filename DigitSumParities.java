import java.util.Scanner;

public class DigitSumParities {
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();

            if(digitSum(n)%2==0){
                while(digitSum(n)%2==0){
                    n+=1;
                }
                System.out.println(n);

            }else{
                while(digitSum(n)%2!=0){
                    n+=1;
                }
                System.out.println(n);

            }
        }
    }
}
