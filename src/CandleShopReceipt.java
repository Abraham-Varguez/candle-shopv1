public class CandleShopReceipt {

    public static void main(String[] args) {


        Candle strawberry = new Candle("Strawberry Fields", 3, 7.50);
        strawberry.printReceipt();


        Candle tobacco = new Candle("Smokey Tobacco", 1, 10.50);
        tobacco.printReceipt();


        Candle ocean = new Candle("Ocean Breeze", 5, 8.75);
        ocean.printReceipt();
    }

}