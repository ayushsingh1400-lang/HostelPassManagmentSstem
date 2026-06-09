import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Hostelpass> passes = new ArrayList<>();

        while (true) {
            System.out.println("\n===== HOSTEL PASS MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Request Pass");
            System.out.println("3. View Students");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Room No: ");
                    String room = sc.nextLine();

                    students.add(new Student(id, name, room));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Pass ID: ");
                    int passId = sc.nextInt();

                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Reason: ");
                    String reason = sc.nextLine();

                    passes.add(new Hostelpass(passId, studentId, reason));
                    System.out.println("Pass Requested Successfully!");
                    break;

                case 3:
                    for (Student s : students) {
                        System.out.println(
                                s.id + "  " + s.name + "  Room: " + s.roomNo);
                    }
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}




















































