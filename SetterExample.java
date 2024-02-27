class Student1{
    int id;
    String name;
    String branch;
    String colleg;
    double cgpa;
    void setValues(int i,String n,String c,String b,double cg){
        id = i;
        name = n;
        colleg = c;
        branch = b;
        cgpa = cg;
        System.out.print("My Id - "+i+ ", name is " +n+ ", college is " +c+ ", branch "+b+", and CGPA is "+cg);
    }
}
public class SetterExample {
    public static void main(String[] sri){
    Student1 s = new Student1();
    s.setValues(14,"Srinivas","ACOE","CSE",8.6);
    }
}
