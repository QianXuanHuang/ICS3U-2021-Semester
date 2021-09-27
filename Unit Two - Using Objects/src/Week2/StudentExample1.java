package Week2;

public class StudentExample1 {
    public static void main(String[] aStrings){
        //Ritchie is a varaiable to an instance of the class Student
        //Ritchie is an Object (instance of a class)
        Student ritchie = new Student("Ritchie", "45646", 12);
        Student yola = new Student("Yola", "123456", 10);
        //ritchie and yola are references to 2 different students

        Student rastin = ritchie;
        //a void method performs a task and returns NOTHING

        //because rastin and ritche refer to the same Student object it increases the grade for both(still its only one object)
        rastin.increaseGrade(); 

        ritchie = null;
        //student tristan; tristan is currently the null refrence

        ritchie.increaseGrade();
        //throws ajava.long.NullPointerException because ritchie

        double yolaAverage = yola.getAverage();
        System.out.println(yola.getName() + " has an average of " + yolaAverage);
    
}
