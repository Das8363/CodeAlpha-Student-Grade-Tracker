package Grade;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        // Input: Ask for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        // Input: Collect grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }
        
        // Calculating the average, highest, and lowest grades
        double average = calculateAverage(grades);
        int highest = findHighestGrade(grades);
        int lowest = findLowestGrade(grades);
        
        // Output the results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }

    // Method to calculate the average grade
    public static double calculateAverage(ArrayList<Integer> grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    // Method to find the highest grade
    public static int findHighestGrade(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static int findLowestGrade(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}

