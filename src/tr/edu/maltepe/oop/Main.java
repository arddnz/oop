package tr.edu.maltepe.oop;


public class Main {

    public static void main(String[] args) {
        Prof prof1 = new Prof();
        prof1.name = "Ensar Gül";
        prof1.age = 60;
        prof1.department = "software engineeer";
        prof1.lesson = "oop";

        Prof prof2 = new Prof();
        prof2.name = "Hamit Topuz";
        prof2.age = 53;
        prof2.department = "industry engineer";
        prof2.lesson = "probability and statictic";


        Student student1 = new Student();
        student1.name = "Deniz";
        student1.age = 21;
        student1.department = "computer engineer";
        student1.grade=2;

        Student student2 = new Student();
        student2.name = "Şevval";
        student2.age = 22;
        student2.department = "law";
        student2.grade=3;


        System.out.println("prof."+prof1.name);
        System.out.println(prof1.age);
        System.out.println(prof1.department);
        prof1.teaches();
        System.out.println("\n");
        System.out.println("prof."+prof2.name);
        System.out.println(prof2.age);
        System.out.println(prof2.department);
        prof2.teaches();
        System.out.println("\n");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.department);
        System.out.println(student1.grade+".class");
        System.out.println("\n");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.department);
        System.out.println(student2.grade+".class");


    }
}

