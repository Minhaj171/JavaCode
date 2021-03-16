import java.util.Comparator;

public class NameComperator implements Comparator<StudentData> {

    @Override
    public int compare(StudentData S1, StudentData S2) {
        return S1.getStudentname().compareTo(S2.getStudentname());
    }
}
