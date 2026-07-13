class Room{
    int roomNo;
    String category;
    double price;
    boolean available;
    Room(int roomNo,String category,double price){
        this.roomNo=roomNo;
        this.category=category;
        this.price=price;
        this.available=true;
    }
    void displayRooms(){
        System.out.println("----------Room Details------------");
        System.out.println("Room number: "+roomNo);
        System.out.println("Room Category: "+category);
        System.out.println("Room price: "+price);
        System.out.println("Status of the room: "+(available?"available":"booked"));
    }
}