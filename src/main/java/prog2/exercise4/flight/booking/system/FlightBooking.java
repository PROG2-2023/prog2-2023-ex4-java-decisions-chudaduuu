package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;
public class FlightBooking {
    private static String flightCompany ="Flights-of-Fancy";
    private String passengerFullName;
    private TripSource tripSource ;
    private TripDestination tripDestination;
    private LocalDate DepartureDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departureTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice=departureTicketPrice+ returnTicketPrice;
    //private String ticketNumber;
    private String sourceAirport;
    private bookingClass BookingClass;
    private TripType tripType;
    private double DepartingTicketPrice;

    public void setDepartingTicketPrice(int child,int adult) {
        this.departureTicketPrice = DepartingTicketPrice;

    }

    public void setReturnTicketPrice() {
        this.returnTicketPrice = returnTicketPrice;

    }

    public void setTicketNumber(String ticketNumber)
    {

        this.ticketNumber = ticketNumber;
    }

    public void setPassengerFullName(String PassengerFullName)
    {

        this.passengerFullName = PassengerFullName;
    }

    public void setTotalPassengers(int childPassengers, int adultPassengers)
    {

        this.totalPassengers = this.childPassengers+this.adultPassengers;
    }

    public void setTotalTicketPrice()
    {

        this.totalTicketPrice = Math.abs((((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
    }

    public void setChildPassengers(int ChildPassengers)
    {

        this.childPassengers = ChildPassengers;
    }
    
    public void setAdultPassengers(int AdultPassengers)
    {

        this.adultPassengers = AdultPassengers;
    }

    public void settripSource(TripSource TripSource)
    {

        this.tripSource = TripSource;
    }
    
    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }

    public double getDepartureTicketPrice(int child, int adult) {
        return departureTicketPrice;
    }

    public String getTicketNumber()
    {
       
        return ticketNumber;
    }

    public String getPassengerFullName()
    {

        return passengerFullName;
    }

    public TripSource getTripSource()
    {

        return tripSource;
    }

    public String getFlightCompany()
    {

        return flightCompany;
    }

    public LocalDate getDepartureDate()
    {

        return departureDate;
    }


    public LocalDate departureDate;
    public LocalDate ReturnDate;
    public void setDepartureDate(LocalDate departureDate){
        String sdepart ="2023-03-04";
        this.departureDate=LocalDate.parse(sdepart);
    }


    public void setReturnDate(LocalDate returnDate){
    String sreturn="2023-03-05";
    this.ReturnDate=departureDate.plusDays(2);
    long i = departureDate.toEpochDay() - returnDate.toEpochDay();
    if(i>=0 && i<1){
        LocalDate ReturnDate2=departureDate.plusDays(2);
        }
    else if(i>=1 && i<2){
        LocalDate ReturnDate2=departureDate.plusDays(1);
        }
    }

    public LocalDate getReturnDate()
    {

        return ReturnDate;
    }

    public int getTotalPassengers()
    {

        return totalPassengers;
    }

    public double getTotalTicketPrice()
    {

        return totalTicketPrice;
    }

    public int getChildPassengers()
    {

        return childPassengers;
    }

    public int getAdultPassengers()
    {

        return adultPassengers;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public bookingClass getbookingClass() {
        return BookingClass;
    }

    public FlightBooking(String q, LocalDate w, LocalDate e, int r, int t) {
        this.passengerFullName = q;
        this.DepartureDate = w;
        this.ReturnDate = e;
        this.childPassengers =r;
        this.adultPassengers =t;
    }


    public String toString() {
        return  "Dear " + this.passengerFullName+". Thank you for booking your flight with " + flightCompany + "." + "\n" +
        "Following are the details of your booking and the trip:" + "\n" +
        "Ticket Number: " + ticketNumber + "\n" +
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + this.DepartureDate + "\n" +
        "Date of return: " + this.ReturnDate + "\n" +
        "Total passengers: " + this.totalPassengers + "\n" +
        "Total ticket price in Euros: " + this.totalTicketPrice;
    }

    enum TripSource{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }


    public void setTripSource(String tripsource) {


    switch (tripsource) {
        case "1":
        this.tripSource = TripSource.NANJING;
        break;
        case "2":
        this.tripSource = TripSource.BEIJING;
        break;
        case "3":
        this.tripSource = TripSource.SHANGHAI;
        break;
        case "4":
        this.tripSource = TripSource.OULU;
        break;
        case "5":
        this.tripSource = TripSource.HELSINKI;
        break;
        case "6":
        this.tripSource = TripSource.PARIS;
        break;
        default:
        }
    }
 

    enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }
    
    public void setTripDestination(String tripdestination, String tripdestination2) {

        switch (tripdestination) {
            case "1":
            this.tripDestination = TripDestination.NANJING;
            break;
            case "2":
            this.tripDestination = TripDestination.BEIJING;
            break;
            case "3":
            this.tripDestination = TripDestination.SHANGHAI;
            break;
            case "4":
            this.tripDestination = TripDestination.OULU;
            break;
            case "5":
            this.tripDestination = TripDestination.HELSINKI;
            break;
            case "6":
            this.tripDestination = TripDestination.PARIS;
            break;
            default:
        }
    }


    enum BookingClass{ 
        FIRST, BUSINESS, ECONOMY
    }  
        
            public void setBookingClass(String bookingclass) {
                switch (bookingclass) {
                case "1":
                this.BookingClass = bookingClass.FIRST;
                break;
                case "2":
                this.BookingClass = bookingClass.BUSINESS;
                break;
                case "3":
                this.BookingClass = bookingClass.ECONOMY;
                break;
                default:
                }
            }

            

    enum TripType {
        ONE_WAY, RETURN
    }

        public void setTripType(String triptype) {
                switch (triptype) {
                case "1":
                this.tripType = TripType.ONE_WAY;
                break;
                case "2":
                this.tripType = TripType.RETURN;
                break;
                default:
        }
}


    Random random = new Random();
    enum SourceAirport {
        NANJING_LUKOU_INTERNATION_AIRPORT
    }
    public String ticketNumber="11FASDFDOM";
        public void setTicketNumber() {
            switch (tripType) {
            case ONE_WAY:
            ticketNumber = "11";
            break;
            case RETURN:
            ticketNumber = "22";
            break;
            }


    switch (BookingClass) {
        case FIRST:
        ticketNumber = ticketNumber + "F";
        break;
        case BUSINESS:
        ticketNumber = ticketNumber + "B";
        break;
        case ECONOMY:
        ticketNumber = ticketNumber + "E";
        break;
        }


    for (int i = 0; i < 4; i++) {
        char f = (char) ((random.nextInt(26) + 65));
        ticketNumber = ticketNumber + f;
    }
    
    this.ticketNumber = ticketNumber + "DOM";

    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
        this.ticketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
        this.ticketNumber = ticketNumber + "DOM";
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
        this.ticketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
        this.ticketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
        this.ticketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
        this.ticketNumber = ticketNumber + "INT";
    }
    if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
        this.ticketNumber = ticketNumber + "INT";
    }
}
}       

