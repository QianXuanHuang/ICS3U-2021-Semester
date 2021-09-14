package week2;

public class HW9 {
    public static void main(String[]args){
     int pennyNum = 10;
     int nickleNum = 3;
     int dimeNum = 7;
     int quarterNum = 13;
     int loonieNum = 20;
     int tonnieNum = 4;
     double balance =  (double)(pennyNum * 0.01) + (nickleNum * 0.05) + (dimeNum * 0.1) + (quarterNum * 0.25) + (loonieNum * 1) + (tonnieNum * 2);
    System.out.print(balance + "$");
}
}
