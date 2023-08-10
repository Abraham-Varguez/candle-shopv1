# candle-shopv1
Candle Shop Inventory Java Program
This is a basic Java program to manage candle shop inventory. It allows you to create candle products and print receipts.

Candle Class
The Candle class represents a candle product. It has three attributes:

name - The name of the candle (e.g. "Luscious Lavender")
amount - The quantity in stock (e.g. 3)
price - The price per candle (e.g. $7.50)
The Candle class has a constructor to create a new candle by passing in the name, amount, and price.

It also has a printReceipt() method to print a formatted receipt for that candle.

CandleShop Class
The CandleShop class demonstrates using the Candle class.

In the main() method, it creates a new Lavender candle product.

It passes "Luscious Lavender" for the name, 3 for the amount, and 7.50 for the price.

It then calls printReceipt() on that candle instance to print out the sample receipt.

This shows how you can use the Candle class to model candle products in your inventory system.

You would create more Candle instances to represent each unique product. And call printReceipt() to print orders, invoices, etc.
