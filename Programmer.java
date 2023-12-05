package Basic_OOPS1;

public class Programmer {
    int id, salary;
    String spec;
    Programmer(){

    }
    Programmer(int id, int salary, String spec)
    {
        this.id=id;
        this.salary=salary;
        this.spec=spec;
    }
    void display()
    {
        System.out.println("Salary = "+salary+", ID = "+id+" Specialization = "+spec);
    }

    public static void main(String[] args) {
        Person1 P1= new Person1("Shashwat Sharma", "Bhilai");
        P1.display();
        Programmer p1= new Programmer(101,50000,"Java");
        p1.display();
        //System.out.println(p1);
    }
}
