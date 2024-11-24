//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Double> students = new HashMap<>();
        File inputFile = new File("gpa");

        try (PrintWriter writer = new PrintWriter(new FileWriter(inputFile))) {
            writer.write("Benjamin,4.0\n");
            writer.write("Eric,2.7\n");
            writer.write("Scott,3.0\n");
            writer.write("Mussa,2.4\n");
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file", e);
        }

        try (Scanner input = new Scanner(inputFile)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                Double grade = Double.parseDouble(parts[1]);
                students.put(name, grade);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading from file", e);
        }
        Map.Entry<String, Double> topStudent = students.entrySet().stream()
                .max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
                .orElse(null);

        if (topStudent != null) {
            System.out.println("Student with the highest GPA: " + topStudent.getKey() + " with GPA: " + topStudent.getValue());
        } else {
            System.out.println("No students found.");
        }
    }
}