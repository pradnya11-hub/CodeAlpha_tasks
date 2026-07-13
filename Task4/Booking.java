class Booking{
    Customer customer;
    Room room;
    boolean paymentStatus;
    Booking(Customer customer,Room room,boolean paymentStatus){
        this.customer=customer;
        this.room=room;
        this.paymentStatus=paymentStatus;
    }
    void displayBookings(){
        System.out.println("--------Booking Details------------");
        System.out.println("Customer name: "+customer.name);
        System.out.println("Customer phone number: "+customer.phn);
        System.out.println("Room Number: "+room.roomNo);
        System.out.println("Room Category: "+room.category);
        System.out.println("Room Price: "+room.price);
        System.out.println("Payment Status: "+(paymentStatus?"Succesfull":"Pending"));
    }
}