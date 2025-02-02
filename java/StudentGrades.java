import java.util.Scanner;

public class StudentGrades {
    private static String[] subjects;
    private static String[] studentNames;
    private static int[][] marks;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get number of students and subjects
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Initialize arrays
        subjects = new String[numSubjects];
        studentNames = new String[numStudents];
        marks = new int[numStudents][numSubjects];
        
        // Register subjects
        registerSubjects(scanner);
        
        // Register students and enter marks
        registerStudentsAndMarks(scanner, numStudents, numSubjects);
        
        // Display report
        displayReport(numStudents, numSubjects);
        
        scanner.close();
    }
    
    private static void registerSubjects(Scanner scanner) {
        System.out.println("\nRegister subjects:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = scanner.next();
        }
    }
    
    private static void registerStudentsAndMarks(Scanner scanner, int numStudents, int numSubjects) {
        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter student " + (i + 1) + " name: ");
            studentNames[i] = scanner.next();
            
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for " + subjects[j] + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
    }
    
    private static void displayReport(int numStudents, int numSubjects) {
        System.out.println("\nStudent Report:");
        System.out.println("------------------------------------");
        System.out.printf("%-15s %-10s %-10s\n", "Student Name", "Avg Marks", "Grade");
        System.out.println("------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            double avgMarks = calculateAverage(marks[i], numSubjects);
            char grade = determineGrade(avgMarks);
            System.out.printf("%-15s %-10.2f %-10c\n", studentNames[i], avgMarks, grade);
        }
    }
    
    private static double calculateAverage(int[] studentMarks, int numSubjects) {
        int total = 0;
        for (int mark : studentMarks) {
            total += mark;
        }
        return (double) total / numSubjects;
    }
    
    private static char determineGrade(double avgMarks) {
        if (avgMarks >= 90) return 'A';
        else if (avgMarks >= 80) return 'B';
        else if (avgMarks >= 70) return 'C';
        else if (avgMarks >= 60) return 'D';
        else return 'F';
    }
}

