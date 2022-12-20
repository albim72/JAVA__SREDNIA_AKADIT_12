public class Student {
    int rollno;
    String name,address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return String.format("nr albumu: %s, imię: %s, adres: %s",this.rollno, this.name, this.address);
    }
}
