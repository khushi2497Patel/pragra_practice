public class Student {
    private String firstname;
    private String lname;
    private int phone;
    private int studentId;

    public Student(String firstname, String lname, int phone, int studentId) {
        this.firstname = firstname;
        this.lname = lname;
        this.phone = phone;
        this.studentId = studentId;
    }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
