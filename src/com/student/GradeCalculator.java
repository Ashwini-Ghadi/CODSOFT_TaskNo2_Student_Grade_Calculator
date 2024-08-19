package com.student;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); 
        String[] subjectNames = new String[numSubjects];
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            while (true) {
                System.out.print("Enter the name of subject " + (i + 1) + ": ");
                subjectNames[i] = scanner.nextLine();

                // Validation
                if (subjectNames[i].matches("[a-zA-Z]+")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter only alphabetic characters.");
                }
            }

            System.out.print("Enter marks for " + subjectNames[i] + " (out of 100): ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else if (averagePercentage >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Results ---");
       
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

}
