public class Course {
    public String courseName;
    public String instructor;
    public Student[] students;

    public Course(String name_, String instructor_, int size)
    {
        this.courseName = name_;
        this.instructor = instructor_;
        this.students = new Student[size];
    }

    public void AddStudent(Student s, int index)
    {
        try {
            this.students[index] = s;
        }
        catch (Exception e)
        {
            System.out.println("this index is invalid");
        }
    }

    public double courseGPA()
    {
        double sum = 0;

        for (Student student : this.students) {
            sum += student.gpa;
        }

        return sum / this.students.length;
    }

    public Student highestCreditStudent()
    {
        int credit = this.students[0].credits;
        int id = 0;

        for (int i = 1; i < this.students.length; i++)
        {
            if (credit < students[i].credits)
            {
                credit = students[i].credits;
                id = i;
            }
        }

        return this.students[id];
    }

    public void SummaryOfCource()
    {
        for (Student student : this.students) {
            String std = String.format("Student %s, id: %d, major: %s, gpa: %f, credits: %d", student.name,
                    student.id, student.major, student.gpa, student.credits);
            System.out.println(std);
        }
    }

    public Student HighestGpaStudent(Student[] arr)
    {
        int id = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[id].gpa < arr[i].gpa)
            {
                id = i;
            }
        }

        return arr[id];
    }

    public int countHonors(Student[] arr)
    {
        int count = 0;
        for (Student student : arr) {
            if (student.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public int totalCredits(Student[] arr)
    {
        int total = 0;
        for (Student student : arr) {
            total += student.credits;
        }
        return total;
    }
}
