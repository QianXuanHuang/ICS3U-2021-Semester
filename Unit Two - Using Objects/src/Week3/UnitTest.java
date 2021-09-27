package Week3;

public class UnitTest {
    public void main(String[] args){
        /*System.out.println(threeCopies("Happy"));

    }
    

    /**
     * write a function that accepts a String and an int that represnts an index. Obtain 3 characters at that index and return 3 copies of that String.
     */
    public static String threeCopies(String str, Int index){
        String s = str.substring(index, index + 2); //gets 2 characters starting at index
        return s + s + s;


    }

    public static String removeChars(String str, int index, int n){
        String n1 = str.substring(0, index) + str.substring(index + n, str.length());
    }

    public static double sqrtSum(int number){
        int n1 = number / 1000;
        int n2 = number / 100 % 10;
        int n3 = number / 10 % 10;
        int n4 = number % 10;
         
        int sum = n1 + n2 + n3 + n4;
       return Math.sqrt(sum);
*
    }
}
