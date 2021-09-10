package week1;
/**
 * More of the same
 * Interger vs Double math
 */

public class ExampleFive {
    public static void main(String[] args){
        int markOne = 75, markTwo = 80, markThree = 87; //decleared and initialized on the same line.

        double average = (markOne + markTwo + markThree) / 3; //interger division 242/3 = 80
        average = (markOne + markTwo + markThree) / 3.0; //interger division 242/3.0 = 80.6667
        System.out.println("The average is:" + average);

    }
    
}
