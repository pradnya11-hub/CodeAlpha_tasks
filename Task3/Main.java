import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Chatbot bot=new Chatbot("Java chatbot");
        Respond response= new Respond();
        bot.greet();
        while(true){
            System.out.print("\nYou:");
            String input=sc.nextLine();
            String res=response.getResponse(input);
            System.out.println("Bot: "+res);
            if(input.equalsIgnoreCase("bye"))
                break;
        }
        sc.close();
    }
}