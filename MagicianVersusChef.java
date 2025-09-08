import java.util.Scanner;

public class MagicianVersusChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int noOfBoxes = sc.nextInt();
            int coinPosition = sc.nextInt(); // box in which coin is kept first
            int noOfSwap = sc.nextInt();
            int temp =coinPosition;
            for(int i=0;i<noOfSwap;i++){
                int aBox = sc.nextInt();
                int bBox = sc.nextInt();
                if(temp==aBox){
                    temp = bBox;


                }else if(temp==bBox){
                    temp=aBox;
                }
            }
            System.out.println(temp);


        }
    }
}