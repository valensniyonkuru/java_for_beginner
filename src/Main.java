//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     student studentRecord = new student("Niyonkuru Valens","auca","IT");
        System.out.println(studentRecord);

// accessing individual field using getter
        System.out.println("studentName:"+studentRecord.getName());
        System.out.println("shollName:"+studentRecord.getShoolName());
        System.out.println("Department:"+studentRecord.getDepartment());
        // modify/change name
        studentRecord.setName("uwase cathy");
        System.out.println(studentRecord);




    }
}