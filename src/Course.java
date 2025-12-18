public class Course {
    public String courseName;
    public String instructor;
    public Student[] students;

    public void Course(String name_, String instructor_, int size)
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

        for (int i = 0; i < this.students.length; i++)
        {
            sum += students[i].gpa;
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
        for (int i = 0; i < this.students.length; i++) {
            String std = String.format("Student %s, id: %d, major: %s, gpa: %f, credits: %d",  this.students[i].name,
                    this.students[i].id,  this.students[i].major,  this.students[i].gpa,  this.students[i].credits);
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isHonors())
            {
                count++;
            }
        }
        return count;
    }

    public int totalCredits(Student[] arr)
    {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].credits;
        }
        return total;
    }
}
