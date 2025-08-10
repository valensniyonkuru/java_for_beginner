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
@Override
    public String toString(){
        return "Name:" + name+ ", shoolName:"+shoolName+",department:"+department+",";
    }
}
