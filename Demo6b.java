public class Demo6b {
    public static void main(String[] args) {
        String name1 = "Alice";
        String name2 = "Bob";
        int age1 = 24;
        int age2 = 30;

        String ORANGE = "\033[38:2:255:165:0m";
        String reset = "\033[30;0m";
        String BLUE = "\033[34;1m";
        String PINK = "\033[35m";

        String tableLines = String.format("%s+%17s+%5s+%s",ORANGE,"-".repeat(17),"-".repeat(5),reset);
        
        System.out.println(tableLines);
        System.out.printf("%1$s| %2$s%4$-16s%3$s%1$s| %2$s%5$-4s%3$s%1$s|\n",ORANGE,BLUE,reset,"NAME","AGE");
        System.out.println(tableLines); 
        System.out.printf("%1$s| %2$s%3$-16s%1$s|%2$s%4$s%5$ 4d %1$s|%2$s\n",ORANGE,reset,name1,PINK,age1);
        System.out.printf("%1$s| %2$s%3$-16s%1$s|%2$s%4$s%5$ 4d %1$s|%2$s\n",ORANGE,reset,name2,PINK,age2);
        System.out.println(tableLines);
        
    }
}
