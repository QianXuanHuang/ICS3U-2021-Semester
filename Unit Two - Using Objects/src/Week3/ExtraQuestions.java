package Week3;


public class ExtraQuestions {
    public static void main(String[] args){
        questionOne();
        questionTwo();
        String str = question5("This is a Sentence.");
        System.out.println(str);

        str = question6("This is a Sentence.", "ent");

        double slope = question8(1,2,4,5); //(1, 2) and (4, 5)
        System.out.println(question10("This is a sencence"));
    
    
    }

    private static String question10(String string){
        int index = (int)(Math.random()*string.length() + 0);
        String first = string.substring(0, index);
        String last = string.substring(index + 1);
        return first + last;

    }

    private static double question8(int x1, int y1, int x2, int y2){
    int deltaY = y2 - y1;
    int deltaX = x2 - x1;
    
    double slope = (double)deltaY / deltaX;
    return slope;
    }

    private static String question6(String str, String substr){
        int index = str.indexOf(substr);
        String first = str.substring(0, index);
        String last = str.substring(index + str.length());
        return first + last;
    }

    private static String question5(String string){
        int index = string.indexOf("e");
        String first = string.substring(0, index);
        String second = string.substring(index + 1);

        return first + second;
    }

    public static void questionOne(){
        int num = (int)(Math.random()*100) + 1;
        // (int)(Math.random() * numPossibilities) + start

        System.out.println(num);

        

    }

    public static void questionTwo(){
        int num = (int)(Math.random()*101) -50;
        System.out.println(num);
}
}