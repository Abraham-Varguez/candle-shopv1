public class Candle {

    private String name;
    private int amount;
    private double price;

    public Candle(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public void printReceipt() {
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name);
        System.out.println("Amount: " + amount);
        System.out.println("Price: $" + price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}


