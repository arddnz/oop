package tr.edu.maltepe.oop;

public class Student extends Person {
  private int ıdd;
  
 
public Student(int ıdd) {
    
    this.ıdd = ıdd;
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


