public class student {
    private String name;
    private String shoolName;
    private String department;

    public student( String fullname, String shoolName, String department){
        this.name=fullname;
        this.shoolName=shoolName;
        this.department=department;
    }
   public student(){
    }
    /* getter method: they are used to access/read private field of class  outSide of class
                      in controlled format,known as encapsulation.
    getter methods  return value  */

 public String getName(){
     return name;
 }
public String getShoolName(){
     return shoolName;
}
public String getDepartment(){
     return department;
}
/*
setter method they do not return value .
setter method they are used to write/ MODIFY/CHANGE
setter method are used to validate field
*/
    public void setName(String names){
        this.name=names;
    }
     public void setShoolName(String shoolNames){
        this.shoolName=shoolNames;
     }
     public void setDepartment(String departments){
        this.department=departments;
     }
@Override
   public String toString(){
      return "Name:" + name+ ", shoolName:"+shoolName+",department:"+department+",";
    }
}
