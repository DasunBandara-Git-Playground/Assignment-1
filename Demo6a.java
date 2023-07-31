public class Demo6a {
    public static void main(String[] args) {
        String RED = "\033[41;1m";
        String GREEN = "\033[42;1m";
        String reset = "\033[0m";

        System.out.printf("%s[%6s%s%-6s]%s\n",RED,"5",GREEN,"0%",reset);
        
    }
}
