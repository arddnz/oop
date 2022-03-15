package tr.edu.maltepe.oop;

public class Student extends Person {
  private int ıdd;
    private String lesson;
  
 
public Student(int ıdd) {
    
    this.ıdd = ıdd;
    this.lesson=lesson;
}


  public int getId(){

      return ıdd;
  }

 public void setId(int ıdd) {

      this.ıdd = ıdd;
 }
      public void learning () {
        System.out.println(getName() +" is learning " +lesson);
    }
}


