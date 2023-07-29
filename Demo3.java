public class Demo3 {
    public static void main(String[] args) {
        String GREEN = "\033[33;1m";
        String NC = "\033[0m";
        int num1 = 123;
        int num2 = 456;
        int num3 = 7890;
        
        System.out.printf("%1$s(%3$d)%2$s %4$d-%5$d\n",GREEN,NC,num1,num2,num3);
    }
}
