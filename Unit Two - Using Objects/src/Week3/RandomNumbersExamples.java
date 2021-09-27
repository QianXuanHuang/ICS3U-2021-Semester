package Week3;

public class RandomNumbersExamples {
    public static void main(String[] args){
        System.out.println(Math.random()); //[0.0, 0.9999999999]
        double r = Math.random(); 

        int lower = -5;
        int upper = 5;
        int numPossibilities = (upper - lower + 1);

        int rand = (int)((upper - lower + 1) * r) + lower;
        int rand2 = (int) r * numPossibilities + lower; //brackets matter

        String str = "Random Numbers"; //replace a random character with an "x"
        int index = (int)(Math.random()*str.length());
        str = str.substring(0,index) + "x" + str.substring(index + 1);
        System.out.println(str);
        System.out.println(index);
        
        System.out.println(rand);
        System.out.println(rand2);
        

    }
    
}
