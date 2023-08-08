import java.util.Locale;

public class MyClass {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int result = addNumbers(3,2);
        double result1 = addNumbers(3.2, 1.8);
        int result2 = addNumbers(3,2,5);

        System.out.println(result);
        System.out.printf("%.2f", result1);
        System.out.println(result2);

    }
    public static int addNumbers (int a, int b){
        return a + b;
    }
    uebuburbu
    public static double addNumbers (double a, double b){
        return a + b;
    }

    public static int addNumbers (int a, int b, int c){
        return a + b + c;
    }
}
