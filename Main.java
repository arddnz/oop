package tr.edu.maltepe.oop;

class Person {
    String name;
    int age;

    public Person( ) { // has the same name as the class and has no return type.
        name="Eylül";
        age=22;
        System.out.println("ciao");
    }

    public Person( String name,int age) {
        this(); // calls the first constructor.
        this.name = name;
        this.age = age;

    }


}

    public class Main {


        public static void main(String[] args) {
            Person person1= new Person( "Arda", 21);

            Person person2= new Person();

            Person person3= new Person(); // default constructor
            person3.name="Ada";
            person3.age=28;

            new Person(); // garbage


            System.out.println(person1.name);
            System.out.println(+person1.age);
            System.out.println("\n");
            System.out.println(person2.name);
            System.out.println(+person2.age);
            System.out.println("\n");
            System.out.println(person3.name);
            System.out.println(+person3.age);




        }

    }