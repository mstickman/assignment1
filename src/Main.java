void main() {

    Scanner scanner = new Scanner(System.in);

    IO.println("Enter course name: ");
    String name = scanner.nextLine();

    IO.println("Enter course instructor: ");
    String instructor = scanner.nextLine();

    IO.println("Enter count student: ");
    int count = scanner.nextInt();

    Course course = new Course(name, instructor, count);

    for (int i = 0; i < count; i++) {

        IO.println("Enter name student: ");
        String student_name = scanner.next();

        IO.println("Enter id student: ");
        int student_id = scanner.nextInt();

        IO.println("Enter major student: ");
        String student_major = scanner.next();

        IO.println("Enter gpa student: ");
        double gpa = scanner.nextDouble();

        IO.println("Enter credit student: ");
        int credit = scanner.nextInt();

        Student student = new Student(student_name, student_id, student_major);
        student.SetCredits(credit);
        student.updateGpa(gpa);

        course.AddStudent(student, i);
    }

    Student std = course.HighestGpaStudent(course.students);
    String stud = String.format("Student: %s, GPA: %.2f", std.name, std.gpa);

    IO.println(stud);

}
