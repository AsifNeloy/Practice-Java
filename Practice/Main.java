import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.print("Enter Kilometer = ");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        SpeedCalculator s = new SpeedCalculator();
        long fx = s.MilePerHour(input);
        System.out.println(fx);
    }
}
