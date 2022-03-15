package tr.edu.maltepe.oop;


public class Main {

    public static void main(String[] args) {
        Prof prof1 = new Prof();
        prof1.setName("Ensar Gül");
        prof1.setAge(60);
        prof1.setDepartment("software engineeer");
        prof1.setLesson("oop");

        Prof prof2 = new Prof();
        prof2.setName("Hamit Topuz");
        prof2.setAge(53);
        prof2.setDepartment("industry engineer");
        prof2.setLesson("probability and statictic");


        Student student1 = new Student();
        student1.setName("Deniz");
        student1.setAge(21);
        student1.setDepartment("computer engineer");
        student1.setId(190704021);

        Student student2 = new Student();
        student2.setName("Şevval");
        student2.setAge(22);
        student2.setDepartment("law");
        student2.setId(190703215);


        System.out.println("prof."+ prof1.getName());
        System.out.println(prof1.getAge());
        System.out.println(prof1.getDepartment());
        prof1.teaches();
        System.out.println("\n");
        System.out.println("prof."+ prof2.getName());
        System.out.println(prof2.getAge());
        System.out.println(prof2.getDepartment());
        prof2.teaches();
        System.out.println("\n");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getDepartment());
        System.out.println(student1.getId() +"");
        student1.learning();
        System.out.println("\n");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getDepartment());
        System.out.println(student2.getId() +"");
         student2.learning();


    }
}

