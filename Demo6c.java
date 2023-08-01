public class Demo6c {
    public static void main(String[] args) {
        String city1 = "Los Angeles";
        String city2 = "New York";
        String state1 = "Califonia";
        String state2 = "New York";
        int population1 = 3966936;
        int population2 = 8336817;

        String ORANGE = "\033[38:2:255:165:0m";
        String reset = "\033[0;0m";
        String bold = "\033[0;1m";
        String GREEN = "\033[32m";
        String PINK = "\033[35m";

        String tableLines = String.format("%1$s+%2$17s+%3$13s+%3$s+%4$s",ORANGE,"-".repeat(17),"-".repeat(13),reset);
        
        System.out.println(tableLines);
        System.out.printf("%1$s| %2$s%3$-16s%1$s| %2$s%4$-12s%1$s| %2$s%5$-12s%1$s|%6$s\n",ORANGE,bold,"CITY","STATE","POPULATION",reset);
        System.out.println(tableLines);
        System.out.printf("%1$s| %5$s%2$-16s%1$s| %5$s%3$-12s%1$s| %6$s%4$,-12d%1$s|%5$s\n",ORANGE,city1,state1,population1,reset,PINK);
        System.out.println(tableLines);
        System.out.printf("%1$s| %7$s%2$-3s %5$s%3$-12s%1$s| %7$s%2$-3s %5$s%3$-8s%1$s| %6$s%4$,-12d%1$s|%5$s\n",ORANGE,"New","York",population2,reset,PINK,GREEN);
        System.out.println(tableLines);

    }
}
