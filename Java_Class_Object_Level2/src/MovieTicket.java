class MovieTicket {
    String movieName;
    int seatNumber;
    double price;


    void bookTicket(String name, int seat, double p) {
        movieName = name;
        seatNumber = seat;
        price = p;
        System.out.println("Ticket booked successfully!");
    }


    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", 25, 250.0);
        ticket.displayTicket();
    }
}
