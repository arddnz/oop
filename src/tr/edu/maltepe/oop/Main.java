package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        Prof prof1= new Prof();
        prof1.name="Ensar Gül";
        Prof prof2= new Prof();
        prof2.name="Hamit Topuz";

        Student student1= new Student();
        student1.name="Deniz";
        Student student2= new Student();
        student2.name="Tuna";

        prof1.teaches();

        System.out.println(prof1.name);
        System.out.println(prof2.name);
        System.out.println(student1.name);
        System.out.println(student2.name);



    }
}
