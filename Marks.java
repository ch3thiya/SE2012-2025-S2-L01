import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        double[][] matrix = new double[n][3];
        
        while (true) {
            System.out.print("Enter command:\n" +
                    "01. add {studentID} = add marks for a student\n" +
                    "02. update {studentID} {subjectID} = update marks for a student\n" +
                    "03. average_s {subjectID} = get average marks for a subject\n" +
                    "04. average {studentID} = get average marks for a student\n" +
                    "05. total {studentID} = get total marks for a student\n" +
                    "06. grades = show grades for all students\n" +
                    "07. exit = exit the program\n");
            String command = sc.next();
            
            if (command.equals("add")) {
                int studentID = sc.nextInt();
                System.out.println("Enter marks for student " + studentID + ":");
                System.out.print("Mathematics: ");
                matrix[studentID-1][0] = sc.nextDouble();
                System.out.print("Chemistry: ");
                matrix[studentID-1][1] = sc.nextDouble();
                System.out.print("Physics: ");
                matrix[studentID-1][2] = sc.nextDouble();
                System.out.println("Marks added successfully.");
                
            } else if (command.equals("update")) {
                int studentID = sc.nextInt();
                int subjectID = sc.nextInt();
                System.out.print("Enter new mark: ");
                double newMark = sc.nextDouble();
                matrix[studentID-1][subjectID-1] = newMark;
                System.out.println("Mark updated successfully.");
                
            } else if (command.equals("average_s")) {
                int subjectID = sc.nextInt();
                double sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += matrix[i][subjectID-1];
                }
                double average = sum / n;
                System.out.println("Average for subject " + subjectID + ": " + average);
                
            } else if (command.equals("average")) {
                int studentID = sc.nextInt();
                double sum = matrix[studentID-1][0] + matrix[studentID-1][1] + matrix[studentID-1][2];
                double average = sum / 3;
                System.out.println("Average for student " + studentID + ": " + average);
                
            } else if (command.equals("total")) {
                int studentID = sc.nextInt();
                double total = matrix[studentID-1][0] + matrix[studentID-1][1] + matrix[studentID-1][2];
                System.out.println("Total marks for student " + studentID + ": " + total);

            } else if (command.equals("grades")) {
                System.out.println("\nGrades Summary:");
                System.out.println("Student ID\tMathematics\tChemistry\tPhysics");
                
                for (int i = 0; i < n; i++) {
                    System.out.print((i+1) + "\t\t");
                    for (int j = 0; j < 3; j++) {
                    
                    if (matrix[i][j] >= 90) System.out.print("A\t\t");
                    else if (matrix[i][j] >= 80) System.out.print("B\t\t");
                    else if (matrix[i][j] >= 70) System.out.print("C\t\t");
                    else if (matrix[i][j] >= 60) System.out.print("D\t\t");
                    else System.out.print("Fail\t\t");
                    }
                    System.out.println();
                }
            } else if (command.equals("exit")) {
                break;
                
            } else {
                System.out.println("Invalid command.");
            }
        }
        
        sc.close();
    }
}