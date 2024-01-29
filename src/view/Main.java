package view;

import controller.StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(scanner);
        int choice;
        do {
            System.out.println("----------- Menu -----------");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Find Student by Name");
            System.out.println("6. Find Student ID by Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;

                case 2:
                    studentManager.updateStudent();
                    break;

                case 3:
                    studentManager.deleteStudent();
                    break;

                case 4:
                    studentManager.displayAllStudents();
                    break;

                case 5:
                    studentManager.findStudentByName();
                    break;

                case 6:
                    studentManager.findStudentIdByName();
                    break;

                case 0:
                    System.out.println("Thoát chương trình ");
                    break;

                default:
                    System.out.println("Nhập không hơp lệ . Vui lòng nhập lại");
                    break;
            }

        } while (choice != 0);

    }
}
