package Basic_OOPS1;

public class Date {
    int dd, mm, yy;
    Date(){
        dd=1;
        mm=1;
        yy=2000;
        //System.out.println("Non para constructor is called");
    }
    Date(int dd, int mm, int yy)
    {
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
        //System.out.println("Parameter constructor is called");
    }
    void display()
    {
        System.out.println("Date = "+dd+"/"+mm+"/"+yy);
    }

    public static void main(String[] args) {
        Date d1= new Date();
        d1.display();

        Date d2=new Date(11,12,2000);
        d2.display();
    }
}
