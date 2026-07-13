public class Stock {
    String stockName;
    int price;
    Stock(String stockName,int price){
        this.stockName=stockName;
        this.price=price;
    }
    void display(){
        System.out.println(stockName+" : "+ price);
    }
}
