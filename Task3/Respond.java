class Respond{
    public String getResponse(String input){
        input=input.toLowerCase();
        if(input.contains("hello")|| input.contains("hi"))
            return "Hello, How can I help you";
        else if(input.contains("how are you"))
            return "I am great";
        else if(input.contains("your name"))
            return "I am Java chatbot";
        else if(input.contains("java"))
            return "Java is a Object-oriented programing language";
        else if(input.contains("oop"))
            return "OOP stands for Object-Oriented Programming.";
        else if(input.contains("arraylist"))
            return "ArrayList is a dynamic collection in Java.";
        else if(input.contains("hashmap"))
            return "HashMap stores data in key-value pairs.";
        else if(input.contains("bye"))
            return "Goodbye! Have a nice day.";
        else
            return "Sorry! I didn't understand the question";

    }
}