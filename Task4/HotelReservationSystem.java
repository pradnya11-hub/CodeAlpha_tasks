import java.util.ArrayList;
import java.util.Scanner;
class HotelReservationSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Room> rooms=new ArrayList<>();
        rooms.add(new Room(101,"Standard",15000.00));
        rooms.add(new Room(102,"Standard",15000.00));
        rooms.add(new Room(103,"Deluxe",20000));
        rooms.add(new Room(104,"Deluxe",20000));
        rooms.add(new Room(105 ,"Suite",25000));
        rooms.add(new Room(101,"Suite",25000));
        ArrayList<Booking> bookings=new ArrayList<>();
        FileManager file=new FileManager();
        while(true){
            System.out.println("--------------Hotel Reservation System---------------");
            System.out.println("1.Display Rooms");
            System.out.println("2. Book  Rooms");
            System.out.println("3.Cancle Booking");
            System.out.println("4. View Booking Details");
            System.out.println("5. View saved booking");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    for(Room r:rooms){
                        r.displayRooms();
                    }
                    
                    break;
                case 2:
                    System.out.println("Enter the room number you want to book");
                    int rNo=sc.nextInt();
                    Room selectedRoom=null;
                    for(Room r:rooms){
                        if(r.roomNo==rNo){
                            selectedRoom=r;
                            break;
                        }
                    }
                    if(selectedRoom==null){
                        System.out.println("Room not found");
                        break;
                    }
                    if(!selectedRoom.available){
                     System.out.println("Room already booked");
                     break;
                    }
                    sc.nextLine();
                    System.out.println("Enter Customer name");
                    String name=sc.nextLine();
                    System.out.println("enter customer phone number");
                    String phn=sc.nextLine();
                    Customer customer=new Customer(name, phn);
                    System.out.println("Processing payment");
                    System.out.println("payment succesfull");
                    selectedRoom.available=false;
                    Booking booking=new Booking(customer, selectedRoom, true);
                    bookings.add(booking);
                    file.saveBooking(booking);
                    System.out.println("Room booked successfully");
                    break;
                
                case 3:
                    System.out.println("Enter the room number that you want to cancel booking");
                    int cancelRoom=sc.nextInt();
                    boolean found=false;
                    for(Booking b:bookings){
                        if(b.room.roomNo==cancelRoom){
                            b.room.available=true;
                            bookings.remove(b);
                            System.out.println("booking removed successfullly");
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Booking not found");
                    }
                    break;
                case 4:
                    if(bookings.isEmpty()){
                        System.out.println("no booking yet");
                    }
                    else{
                    for(Booking b:bookings){
                        b.displayBookings();
                    }
                }
                    break;
                case 5:
                    file.viewBookings();
                    break;
                case 6:
                    System.out.println("Thankyou for visiting");
                    System.exit(0);



            
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}