import java.util.Scanner;

public class Main {
    public static String exit(String string) {
        Scanner scanner = new Scanner(System.in);
        if (string.length() < 5) {
            return "Small string";
        } else {
            // превращаем int в String
           String length2 = String.valueOf(length(string));
           // превращаем String в int
           int length3 =  Integer.parseInt(length2);
           return length2;
        }

    }
    public static int length(String string) {
        return string.length();
    }
    public static int mul(int stringLength) {
        return stringLength * 2;
    }
    public static void main(String[] args) {

        String length = exit("welcome");
        int multiplication = mul(Integer.parseInt(exit("welcome")));
        System.out.println(length);
        System.out.println(multiplication);
    }
}