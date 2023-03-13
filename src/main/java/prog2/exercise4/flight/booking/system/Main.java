package prog2.exercise4.flight.booking.system;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDate;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your fullname");
        String z = sc.nextLine();
        System.out.println("The number of childPassengers : ");
        int m = sc.nextInt();
        System.out.println("The number of adultPassengers : ");
        int n = sc.nextInt();
        String sdepart = "2023-03-06";
        LocalDate time1 = LocalDate.parse(sdepart);
        String sreturn = "2023-03-06";
        LocalDate time2 = LocalDate.parse(sreturn);

        /*Scanner s= new Scanner(System.in);
        System.out.println("1. First\n2. Business\n3. Economy\nPlease choose the number:");
        int number= s.nextInt();
        switch(number){
            case 1:
            case 2:
            case 3:
            System.out.println("Enter successfully!");
            break;
            default:
            System.out.println("Input error!");
            break;
        }
        s.close();*/

       /*  Scanner c= new Scanner(System.in);
        System.out.println("1.One way\n2.Return \nPlease choose the number:");
        int count= c.nextInt();
        if(count=1){
            System.out.println("Enter successfully!");
        }
        else if(count=2){
            System.out.println("Enter successfully!");
        }
        else{
            System.out.println("Input error!");
        }
        c.close();*/


        FlightBooking fb = new FlightBooking("John Doe", time1, time2, 2, 3);
        fb.setTicketNumber(null);
        /*fb.setDepartingTicketPrice(200);*/
        /*fb.setReturnTicketPrice(300);*/
        /*fb.setTotalTicketPrice(fb.getDepartureTicketPrice(n, n), fb.getReturnTicketPrice());*/
        fb.setPassengerFullName(z);
        fb.setChildPassengers(m);
        fb.setAdultPassengers(n);
        fb.setTotalPassengers(m, n);
        System.out.println(fb);

        sc.close();

    }
    }
