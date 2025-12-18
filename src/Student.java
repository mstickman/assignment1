public class Student {
    public String name = "";
    public int id = 0;
    public String major = "";
    public double gpa = 0.0f;
    public int credits = 0;

    public void Student(String name_, int id_, String major_)
    {
        this.name = name_;
        this.id = id_;
        this.major = major_;
        this.gpa = 0.0;
        this.credits = 0;
    }


    public void AddCredits(int c)
    {
        this.credits += c;
    }

    public  void updateGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public boolean isHonors()
    {
        return this.gpa >= 3.5;
    }

    public void SummaryStudent()
    {
        String sum = String.format("Name: %s, Id: %d, Major: %s, Gpa: %f, Credits: %d", name, id, major, gpa, credits);
        System.out.println(sum);
    }



}
