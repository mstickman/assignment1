import java.util.Scanner;

public class Main {
    public static void main()
    {
        Course course = new Course();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course name: ");
        String name = scanner.nextLine();

        System.out.println("Enter course instructor: ");
        String instructor = scanner.nextLine();

        System.out.println("Enter count student: ");
        int count = scanner.nextInt();

        course.Course(name, instructor, count);

        for (int i = 0; i < count; i++)
        {
            Scanner scanner_ = new Scanner(System.in);
            Student student = new Student();

            System.out.println("Enter name student: ");
            String student_name = scanner.next();

            System.out.println("Enter id student: ");
            int student_id = scanner.nextInt();

            System.out.println("Enter major student: ");
            String student_major = scanner.next();

            System.out.println("Enter gpa student: ");
            double gpa = scanner.nextDouble();

            System.out.println("Enter credit student: ");
            int credit = scanner.nextInt();

            student.Student(student_name, student_id, student_major, gpa, credit);

            course.AddStudent(student, i);
        }

        Student std = course.HighestGpaStudent(course.students);
        String stud = String.format("Student: %s, GPA: %.2f", std.name, std.gpa);

        System.out.println(stud);

    }

}
