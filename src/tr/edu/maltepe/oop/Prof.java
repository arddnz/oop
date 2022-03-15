package tr.edu.maltepe.oop;

public class Prof extends Person{
private String lesson;

    

public Prof(String lesson){
    this();
    this.lesson=lesson;
}


    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void teaches () {
        System.out.println(getName() +" is teaching " +lesson);
    }
    }









