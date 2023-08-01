public class Demo6d {
    public static void main(String[] args) {
        String fruit1 = "Apples";
        String fruit2 = "Oranges";
        int quantity1 = 5;
        int quantity2 = 10;
        double price1 = 0.99;
        double price2 = 1.49;

        String ORANGE = "\033[38:2:255:165:0m";
        String reset = "\033[0;0m";
        String bold = "\033[0;1m";
        String GREEN = "\033[32m";
        String BLUE = "\033[34m";
        String PINK = "\033[35m";

        String tableLines = String.format("%1$s+%2$s+%2$s+%3$s+%4$s",ORANGE,"-".repeat(10),"-".repeat(7),reset);
        
        System.out.println(tableLines);
        System.out.printf("%1$s| %2$s%3$-9s%1$s| %2$s%4$-9s%1$s| %2$s%5$-6s%1$s|%6$s\n",ORANGE,bold,"ITEM","QUANTITY","PRICE",reset);
        System.out.println(tableLines);
        System.out.printf("%1$s| %2$s%3$-9s%1$s| %4$s%5$8d%1$s | %6$s%7$s%8$s%9$s%10$-5.2f%1$s|%6$s\n",ORANGE,reset,fruit1,BLUE,quantity1,reset,GREEN,"$",PINK,price1);
        System.out.printf("%1$s| %2$s%3$-9s%1$s| %4$s%5$8d%1$s | %2$s%6$s%7$s%8$s%9$-5.2f%1$s|%2$s\n",ORANGE,reset,fruit2,BLUE,quantity2,GREEN,"$",PINK,price2);
        System.out.println(tableLines);
    }
}
