public class Candle {

    public String name;
    public int amount;
    public double price;

    public int burnTime;



    //A constructor method to create the variables needed to be printed on to the receipt
    public Candle(String name, int amount, double price, int burnTime) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.burnTime = burnTime;
    }

    public double getDollarsPerHour() {
        return price / burnTime;
    }

    //The method created to actually print the variables for the receipt that we will call in the CandleShopReceipt class
    public void printReceipt() {
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name);
        System.out.println("Amount: " + amount);
        System.out.println("Price: $" + price);
        System.out.println("Burn Time: " + burnTime + " Hours");
        double dollarsPerHour = getDollarsPerHour();
        System.out.println("Dollar per Burn Time: " + String.format("%.2f", dollarsPerHour));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}


