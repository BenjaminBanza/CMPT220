/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */
import java.util.Random;
class Student { // I don't why but after I deleted "public" it started running well.
    String name;
    String year;
    double gpa;
    int id;

    public Student(String n, String y, double g, int i) {
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

    public boolean RollStudent() {
        return gpa > 3.6;
    }

    public boolean FreeLunch(int randomId) {
        return randomId == id;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Ricky", "Freshman", 3.8, 100);
        Student student2 = new Student("Ben", "Sophomore", 3.5, 111);
        Student student3 = new Student("Panther", "Junior", 3.9, 109);
        

        Student[] students = {student1, student2, student3};

        for (Student s : students) {
            if (s.RollStudent()) {
                System.out.println(s.name + " is on the honor roll!");
            } else {
                System.out.println(s.name + " is not on the honor roll.");
            }
        }

        Random rand = new Random();
        int randomId = rand.nextInt(120);
        System.out.println("\nRandomly generated student ID for free lunch check: " + randomId);

        for (Student s : students) {
            if (s.FreeLunch(randomId)) {
                System.out.println(s.name + " gets free lunch today!");
            } else {
                System.out.println(s.name + " does not get free lunch today.");
            }
        }
    }
}
