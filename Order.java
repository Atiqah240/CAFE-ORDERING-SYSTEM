public class Order{
    public int qty;
    public double totalPrice;
    //default constructor
    public Order (){
        qty = 0;
        totalPrice = 0.00;
    }
    //normal constructor
    public Order (int qty,double price){
        this.qty = qty;
        this.totalPrice = price;
    }
    //getter method
    public int getQty(){
        return qty;
    }
    public double getPrice(){
        return totalPrice;
    }
    //processor method
    public double calcOrder (int qty,double price){
        double totalPrice = 0.00;
        totalPrice += (qty*price);
        return totalPrice;
    }
}
