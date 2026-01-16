public class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    public HotelBooking()
    {
        guestName = "none";
        roomType = "none";
        nights = 0;
    }

    public HotelBooking(String guestName,String roomType,int nights)
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking hb)
    {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    public void displayDetails()
    {
        System.out.println("Guest Name : "+guestName);
        System.out.println("Room Type : "+roomType);
        System.out.println("Number of nights : "+nights);
        System.out.println("=================================================");
    }


    public static void main(String[] args) {

        HotelBooking hotelbooking  = new HotelBooking();
        HotelBooking hotelbooking1  = new HotelBooking("Kartik","Super Deluxe",10);
        HotelBooking hotelbookingclone  = new HotelBooking(hotelbooking1);

        hotelbooking.displayDetails();
        hotelbooking1.displayDetails();
        hotelbookingclone.displayDetails();

    }

}
