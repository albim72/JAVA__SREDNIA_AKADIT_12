import java.util.Comparator;

public class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}
