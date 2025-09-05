import java.util.Scanner;

public class codeChefProble1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int xCoordinate = sc.nextInt();
            int yCoordinate = sc.nextInt();
            int upMoves = Math.abs(1-yCoordinate);
            int downMoves = Math.abs(n-yCoordinate);
            int leftMoves = Math.abs(1-xCoordinate);
            int rightMoves = Math.abs(n-xCoordinate);
            int leftTopDiagonalMoves = Math.min(upMoves,leftMoves);
            int rightTopDiagonalMoves = Math.min(upMoves,rightMoves);
            int leftDownDiagonalMoves = Math.min(downMoves,leftMoves);
            int rightDownDiagonalMoves = Math.min(downMoves,rightMoves);
            int countMoves =upMoves+downMoves+rightMoves+leftMoves+leftDownDiagonalMoves+leftTopDiagonalMoves+rightDownDiagonalMoves+rightTopDiagonalMoves;
            System.out.println(countMoves);
        }

    }
}
