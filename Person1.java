package Basic_OOPS1;

public class Person1 {
    String name, add;
    Person1()
    {

    }
    Person1(String name, String add)
    {
        name=name;
        this.add=add;
        //System.out.println("Para const is called");
    }
    void display()
    {
        System.out.println("Name = "+name+", Address = "+add);
    }
    public static void main(String[] args) {
        Person1 p1= new Person1();
        p1.display();
        Person1 p2= new Person1("Shashwat Sharma", "Bhilai");
        p2.display();
    }
}
