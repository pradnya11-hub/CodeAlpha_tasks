class Chatbot{
    String botName;
    Chatbot(String botName){
        this.botName=botName;
    }
    void greet(){
        System.out.println("Helloo, I am "+ botName);
        System.out.println("Type 'bye' to exit");
    }
}