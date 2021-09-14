package week2;

public class HW11 {
    public static void main(String[]args){
double x = 5.5, y = 3.0/*, z = -2.0*/;
int i = 5, j = 4, k = 3;

//a
int temp;
temp = i - j;
temp = i - temp;
temp = i - temp;
temp = i - temp;

System.out.println((double)temp);
//System.out.println(i - (i - (i - (i - j))));

//c
double xy = x - y;
double yx = y - x;
System.out.println(xy - yx - xy - yx);

//f
double ij = i * j;
double jk = ij / k;
double ki = jk + i;
double iJ = ki - j;
System.out.println(iJ);

//h
double JK = (double) j / k;
double IJK = (double) JK + i;
System.out.println(IJK);

//i
int XK = (int)x / k;
int XKXK = (int) XK - XK;
System.out.println(XKXK);

//j
double IJ = (double)i / j;
double Ij = (double)i / j - IJ;
System.out.println(Ij);








    }
    
}
