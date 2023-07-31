public class Demo5 {
    public static void main(String[] args) {
        int num1 = 978;
        int num2 = 3;
        int num3 = 16;
        int num4 = 1484100;

        String reset = "\033[0m";
        String color1 = "\033[31m";
        String color2 = "\033[32m";
        String color3 = "\033[33m";
        String color4 = "\033[34m";

        System.out.printf("%s%2$03d%3$s-%4$s%5$01d%3$s-%6$s%7$02d%3$s-%8$s%9$07d%3$s \n",color1,num1,reset,color2,num2,color3,num3,color4,num4);
    }
}
