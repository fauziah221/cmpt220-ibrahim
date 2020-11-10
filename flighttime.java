 package cmpt220;
 
 import java.util.ArrayList;

 import java.util.GregorianCalendar;

 class Flight{
		 private String flightNo;
		 private GregorianCalendar departureTime;
		 private GregorianCalendar arrivalTime;
		
		
		
		 Flight(String flightNo,GregorianCalendar departureTime,GregorianCalendar arrivalTime ){
			 
		 this.flightNo=flightNo;
		 this.departureTime=departureTime;
		 this.arrivalTime=arrivalTime;}
		
		 public void getDepartureTime(GregorianCalendar departureTime){
		 this.departureTime=departureTime;}
		
		 public GregorianCalendar getDepartureTime(){
		 return this.departureTime;}
		
		 public void getArrivalTime(GregorianCalendar arrivalTime){
		 this.arrivalTime=arrivalTime;}
		
		 public GregorianCalendar getArrivalTime(){
		 return this.arrivalTime;}
		
		 public long getFlightTime(){
		 if (departureTime != null && arrivalTime!=null){
			 
		 long difference=arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis();
		 return (difference/ (1000*60));}
		
		 return 0;}
		 }

 

 class Itinerary{
		 ArrayList<Flight> flights=new ArrayList<>();
		 public Itinerary(ArrayList<Flight> flights) {
		 this.flights=flights;}


		 public long getTotalFlightTime(){
				 long totalFlightTime=0;
		 for (Flight flight : flights){
		 totalFlightTime+=flight.getFlightTime();}
		 return totalFlightTime;}
		
		 public long getTotalTime(){
		 Flight firstFlight=flights.get(0);
		 Flight lastFlight=flights.get(flights.size()-1);
		 long difference=lastFlight.getArrivalTime().getTimeInMillis()-firstFlight.getDepartureTime().getTimeInMillis();
		 return (difference/(1000*60));}}
		
		 public class flighttime {
		 public static void main(String[] args) {
		 ArrayList<Flight> flights=new ArrayList<>();
		
		 GregorianCalendar departureTime=new GregorianCalendar(2014,4,5,5,5,0);
		 GregorianCalendar arrivalTime=new GregorianCalendar(2014,4,5,6,15,0);
		 Flight flightone=new Flight("US230", departureTime, arrivalTime);
		 
		 departureTime=new GregorianCalendar(2014,4,5,6,55,0);
		 arrivalTime=new GregorianCalendar(2014,4,5,7,45,0);
		 Flight flighttwo=new Flight("US235", departureTime, arrivalTime);
		 
		 departureTime=new GregorianCalendar(2014,4,5,9,35,0);
		 arrivalTime=new GregorianCalendar(2014,4,5,12,55,0);
		 Flight flightthree=new Flight("US237", departureTime, arrivalTime);
		
	
		 flights.add(flightone);
		 flights.add(flighttwo);
		 flights.add(flightthree);
		
		 
		 Itinerary itinerary= new Itinerary(flights);
		 System.out.println("Total flight time is "+ itinerary.getTotalFlightTime()+" minutes"+ " and total travel time is "+itinerary.getTotalTime()+" minutes");
		 }
}

