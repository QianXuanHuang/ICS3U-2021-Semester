package week1;

public class ExampkeSix {
    public static void main(String[] args){
        int x = 1;
        int y = 3;
        double z = 1;

        x = x + 1;//(x = 2)take x add 1 to it and assign it back to x
        y = y - 1;//(y = 2)
        x = x + 3;//(x = 5)

        x += 1; //equavilent to x = x + 1
        y -= 1; //equavilent to y = y - 1
        x += 3; //equvilent to x = x + 3 

        y = y / 2; //equvilent to y /= 2;
        z = z * 2; //equvilent to z *= 2;

        x++; //increment by 1
        y--; //decrease by 1

        // modulus operator % -> returns the remainer

        System.out.println(13 % 3); // 13/3 what is the remainder

        y = y % 2; //equivalent to y %= 2

        int a = 5;
        a++;
        ++a;
        a--;
        --a;

        int b = 3;
        int e = 3;
        int c = 2 * b++;
        int d = 2 * ++e;

    }
    
}
