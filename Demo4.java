public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 2;
        int year = 2023;
        int hours = 13;
        int minutes = 24;
        int seconds = 56;
        
        String reset = "\033[0m";
        String color1 = "\033[31m";
        String color2 = "\033[32m";
        String color3 = "\033[33m";
        String color4 = "\033[34m";
        String color5 = "\033[35m";
        String color6 = "\033[36m";
        
        String dateAndTime = "%s%2$02d%3$s/%4$s%5$02d%3$s/%6$s%7$d%3$s %8$s%9$02d%3$s:%10$s%11$02d%3$s:%12$s%13$02d%3$s \n"; 

        System.out.printf(dateAndTime,color1,month,reset,color2,day,color3,year,color4,hours,color5,minutes,color6,seconds);
    }
}
