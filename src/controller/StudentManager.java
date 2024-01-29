package controller;

import model.Student;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int size;
    private Scanner scanner;

    public StudentManager(Scanner scanner) {
        this.students = new Student[100];
        this.size = 0;
        this.scanner = scanner;
    }

    public void addStudent() {
        if (size < 100) {
            System.out.println("Thêm mới học sinh ");
            System.out.println("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();

            students[size++] = new Student(id, name, age, email);
        } else {
            System.out.println("Không thể thêm mới ");
        }
    }

    public void updateStudent() {
        System.out.println("Nhập Id học sinh cần sửa ");
        int updateId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Name: ");
        String updatedName = scanner.nextLine();
        System.out.println("Age: ");
        int updatedAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Email: ");
        String updatedEmail = scanner.nextLine();

        for (int i = 0; i < size; i++) {
            if (students[i].getId() == updateId) {
                students[i] = new Student(updateId, updatedName, updatedAge, updatedEmail);
                return;
            }
        }
        System.out.println("Không tim thấy Id");
    }

    public void deleteStudent() {
        System.out.println("Nhâp Id Cần xoá ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            if (students[i].getId() == deleteId) {

                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                size--;
                System.out.println("Đã xoá");
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void displayAllStudents() {
        if (size == 0) {
            System.out.println("Không có Học viên trong danh sách");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(students[i]);
            }
        }
    }

    public void findStudentByName() {
        System.out.print("Nhâp tên học viên cần tìm ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getName() == searchName) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy " + searchName + ".");
        }
    }

    public void findStudentIdByName() {
        System.out.print("Nhập Id cần tìm :  ");
        int findId = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == findId) {
                System.out.println(students[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy " + findId + ".");
        }
    }
}
