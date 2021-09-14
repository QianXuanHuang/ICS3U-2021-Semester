package week2;

public class HW10 {
    public static void main(String[]args){
        double a = 1;
        double b = 10;
        double c = 3;
        double x = b * b - 4 * a * c;
        double rootPos = ((-b + Math.sqrt(x)) / (2 * a));
        double rootNeg = ((-b - Math.sqrt(x)) / (2 * a));
System.out.println(rootPos);
System.out.println(rootNeg);

    }
    
}
