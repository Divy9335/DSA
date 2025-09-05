import java.util.Scanner;

public class covidAndTheatreTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int noOfRows = sc.nextInt();
            int noOfColumn = sc.nextInt();
            int totalTicket = 0;
            if(noOfColumn%2==0){
                totalTicket+=noOfColumn/2;
            }else{
                totalTicket+=(noOfColumn/2)+1;
            }
            int eligibleRowSeats = 0;
            if(noOfRows%2==0){
                eligibleRowSeats+=noOfRows/2;
            }else{
                eligibleRowSeats+=(noOfRows/2)+1;
            }
            System.out.println(totalTicket*eligibleRowSeats);
        }
    }
}
