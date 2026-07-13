import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class StockTradingPlatform {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Stock> market=new ArrayList<>();
        market.add(new Stock("TCS",100));
        market.add(new Stock("Infoysus",200));
        market.add(new Stock("Reliance",190));
        market.add(new Stock("Wipro",500));
        User user=new User("Prerna",1500000);
        boolean running = true;
        while(running){
            System.out.println("\n----------Stock Trading Platform--------");
            System.out.println("1. Display Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Display Stock");
                    for(Stock s:market)
                        s.display();
                    
                    break;
                case 2:
                    System.out.println("Buy Stock");
                    System.out.println("Enter stock that you want to buy");
                    String buyStock=sc.next();
                    boolean found=false;
                    System.out.println("Enter quantity you want to buy");
                    int quantity=sc.nextInt();
                    for(Stock s:market){
                        if(s.stockName.equalsIgnoreCase(buyStock)){
                            found=true;
                            int cost=s.price*quantity;
                            if(user.balance>=cost){
                                user.balance-=cost;
                                int current=user.portfolio.getOrDefault(s.stockName,0);
                                user.portfolio.put(s.stockName,quantity+current);
                                System.out.println("stock bought successfully");
                            }
                            else{
                                System.out.println("Balance not sufficient");
                            }
                        }
                       
                    }
                    if(!found){
                        System.out.println("Stock not found");
                    }

                    break;
                case 3:
                    System.out.println("Sell Stock");
                    System.out.println("Enter stock that you want to sell");
                    String sellStock=sc.next();
                    System.out.println("Enter quantity you want to sell");
                    quantity=sc.nextInt();
                    if(user.portfolio.containsKey(sellStock)){
                        int qty=user.portfolio.get(sellStock);
                        if(qty>=quantity){
                            for(Stock s:market){
                                if(s.stockName.equalsIgnoreCase(sellStock)){
                                    user.balance+=quantity*s.price;
                                    user.portfolio.put(sellStock,qty-quantity);
                                    System.out.println("stock sell successfull");


                                }
                            }
                        }
                        else{
                                System.out.println("not enough quantity");
                            }
                    }
                     else{

                        System.out.println("Stock not owned.");

                    }
                    
                    break;
                case 4:
                    System.out.println("Portfolio");
                    for(HashMap.Entry<String,Integer> entry: user.portfolio.entrySet()){
                        System.out.println(entry.getKey()+" : " +entry.getValue());

                    }
                    System.out.println("balance"+user.balance); 
                    break;
                case 5:
                    System.out.println("Exit");
                    running = false;
                    break; 

            
                default:
                    System.out.println("invalid choice");
                    break;
            }

        }
        sc.close();
    }
}
