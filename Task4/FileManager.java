import java.io.*;
class FileManager{
    String fileName="booking.txt";
    void saveBooking(Booking booking){
        try{
            FileWriter fw=new FileWriter(fileName,true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Customer Name: "+booking.customer.name);
            bw.newLine();
             bw.write("Customer Phone number: "+booking.customer.phn);
            bw.newLine();
             bw.write("Room number: "+booking.room.roomNo);
            bw.newLine();
            bw.write("Room Category: "+booking.room.category);
            bw.newLine();
            bw.write("Room price: "+booking.room.price);
            bw.newLine();
            bw.write("Payment Successfull");
            bw.newLine();
            bw.close();
        }
        catch(IOException e){
            System.out.println("Error saving booking");
        }
    }
    void viewBookings(){
        try{
        BufferedReader br=new BufferedReader(new FileReader(fileName));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        }
        catch(IOException e){
            System.out.println("No booking found");
        }
    }
}