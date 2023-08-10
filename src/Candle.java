public class Candle {

    public String name;
    public int amount;
    public double price;


    //A constructor method to create the variables needed to be printed on to the receipt
    public Candle(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }


    //The method created to actually print the variables for the receipt that we will call in the CandleShopReceipt class
    public void printReceipt() {
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name);
        System.out.println("Amount: " + amount);
        System.out.println("Price: $" + price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}


