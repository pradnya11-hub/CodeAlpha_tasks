public class Transaction {
    String stockName;
    int quantity;
    String type;
    Transaction(String stockName,int quantity,String type){
        this.stockName=stockName;
        this.quantity=quantity;
        this.type=type;
    }
}
