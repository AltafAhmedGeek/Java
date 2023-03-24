package TicketBookingSystemThread;
class TicketBookingSystem{
private int total_seats;
	
	TicketBookingSystem(int totalSeats){
		this.total_seats=totalSeats;
	}
	
	synchronized void book_seat(int seat)
	{
		if(seat>total_seats)
		{
			System.out.println("Cannot book seat(s)..");
			System.out.println("Total available seat(s): "+total_seats);
		}
		else {
			total_seats-=seat;
			System.out.println(seat+"Seat(s) Booked");
			System.out.println("Total available seat(s): "+total_seats);
		}
	}
	
}

public class TicketBooking extends Thread {
	
	 static TicketBookingSystem book;
	 int seat;
	public  void run() {
		book.book_seat(seat);
		System.out.println();
	}

	public static void main(String[] args) {
		book= new TicketBookingSystem(30);
		
		TicketBooking ram= new TicketBooking();
		ram.seat=10;
		ram.start();
		TicketBooking sham= new TicketBooking();
		sham.seat=20;
		sham.start();
		TicketBooking jam= new TicketBooking();
		jam.seat=10;
		jam.start();
		

	}

}
