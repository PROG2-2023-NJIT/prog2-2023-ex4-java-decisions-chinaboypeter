package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

public class FlightBooking {
    private String flightCompany;
    private String passengerFullName;
    private String tripSource;
    private String tripDestination;
    private String ticketNumber;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double totalTicketPrice;
    private LocalDate departingDate;
    private LocalDate returnDate;
    private  String bookingclass;
    private  String triptype;
    private  double sDT;
    private double sDT1;
    private  int x;
    private  int y;
    private int k;
    private double RTP;
    private int z;

    public FlightBooking(String Null, LocalDate departDate, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.passengerFullName = Null;
        this.departingDate = departDate;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
    }

    public String getFlightCompany() {
        return flightCompany;
    }

    public String getPassengerFullName() {
        return passengerFullName;
    }
    public String getBookingClass(){return bookingclass;}

    public TripSource getTripSource() {
        return TripSource.valueOf(tripSource);
    }

    public String getTripDestination() {
        return tripDestination;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public LocalDate getDepartureDate() {
        return departingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public int getChildPassengers() {
        return childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }
    public String getTripType(){
        return triptype;
    }

    public double getDepartingTicketPrice() {
        return sDT1;
    }
    public double getReturnTicketPrice(){
        return RTP;
    }

    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }

    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }



    public void setDepartureDate(LocalDate departingDate) {
        this.departingDate = departingDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }

    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public void setTotalPassengers(int childrenPassengers, int adultPassengers) {
        this.totalPassengers = childrenPassengers + adultPassengers;
    }
    public void setReturnTicketPrice(){
        this.RTP=sDT1;
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice=z*sDT1;

    }

    enum BookingClass{FIRST,BUSINESS,ECONOMY};
    enum TripType{ONE_WAY,RETURN};
    enum TripSource{NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS};
    enum TripDestination{NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS};
   /* enum SourseAirpot{Nanjing_Lukou_International_Airport,Beijing_Capital_International_Airport,
Shanghai_Pudong_International_Airport,Oulu_Airport,Helsinki_Airport, Paris_Charles_de_Gaulle_Airport}
    enum DestinationAirport{Nanjing_Lukou_International_Airport,Beijing_Capital_International_Airport,
Shanghai_Pudong_International_Airport,Oulu_Airport,Helsinki_Airport, Paris_Charles_de_Gaulle_Airport}*/
    public void setBookingClass(String a){
        switch(a){
            case "1":
                this.bookingclass=String.valueOf(BookingClass.FIRST);
                this.k=1;
                break;
            case "2":
                this.bookingclass=String.valueOf(BookingClass.BUSINESS);
                this.k=2;
                break;
            case "3":
                this.bookingclass=String.valueOf(BookingClass.ECONOMY);
                this.k=3;
                break;
        }
    }
    public void setTripType(String a){
        switch(a){
            case "1":
                this.triptype=String.valueOf(TripType.ONE_WAY);
                this.z=1;
                break;
            case "2":
                this.triptype=String.valueOf(TripType.RETURN);
                this.z=2;
                break;
        }
    }
    public void setTripSource(String tripSource){
        switch(tripSource){
            case "1":
                this.tripSource=String.valueOf(TripSource.NANJING);
                this.x=1;
                break;
            case "2":
                this.tripSource=String.valueOf(TripSource.BEIJING);
                this.x=2;
                break;
            case "3":
                this.tripSource=String.valueOf(TripSource.SHANGHAI);
                this.x=3;
                break;
            case "4":
                this.tripSource=String.valueOf(TripSource.OULU);
                this.x=4;
                break;
            case "5":
                this.tripSource=String.valueOf(TripSource.HELSINKI);
                this.x=5;
                break;
            case "6":
                this.tripSource=String.valueOf(TripSource.PARIS);
                this.x=6;
                break;
        }
    }
    public void setTripDestination(String tripSource,String tripDestination) {
        switch (tripDestination){
            case "1":
                this.tripDestination=String.valueOf(TripSource.NANJING);
                this.y=1;
                break;
            case "2":
                this.tripDestination=String.valueOf(TripSource.BEIJING);
                this.y=2;
                break;
            case "3":
                this.tripDestination=String.valueOf(TripSource.SHANGHAI);
                this.y=3;
                break;
            case "4":
                this.tripDestination=String.valueOf(TripSource.OULU);
                this.y=4;
                break;
            case "5":
                this.tripDestination=String.valueOf(TripSource.HELSINKI);
                this.y=5;
                break;
            case "6":
                this.tripDestination=String.valueOf(TripSource.PARIS);
                this.y=6;
                break;
        }
    }
    public void setDepartingTicketPrice(int i,int j){
        i=x;
        j=y;
        if(x<4 && y<4){
            this.sDT=(300+30+15)*totalPassengers;
        }
        else if(3<x && x<5 && 5>y && y>3){
            this.sDT=(300+15+30)*totalPassengers;
        }
        else{
            this.sDT=(300+45+30)*totalPassengers;
        }
        switch (k){
            case 1:
                this.sDT1=sDT+250*totalPassengers;
                break;
            case 2:
                this.sDT1=sDT+150*totalPassengers;
                break;
            case 3:
                this.sDT1=sDT+50*totalPassengers;

        }

    }
    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                flightCompany + ". Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + tripSource + " to " + tripDestination + "\n" +
                "Date of departure: " + departingDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;

    }
}