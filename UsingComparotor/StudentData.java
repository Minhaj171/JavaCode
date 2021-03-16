import java.util.Comparator;
import java.util.*;

public class StudentData implements Comparable {
    private int StudentID;
    private String StudentName;
    private String VersityName;





    public StudentData(int StudentID, String StudentName, String VersityName) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.VersityName = VersityName;
    }

//showing normal output
//	void Studentinfo(int id, String name, String Uname) {
//		 this.StudentID = id;
//		 this.name = name;
//		 this.University_name = Uname;
//
//		System.out.printf("Student id: " + StudentID);
//		System.out.printf("\n Student Name: " + Name);
//		System.out.printf("\n Student University Name: " + University_name);
//	}

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int rollno) {
        this.StudentID = StudentID;
    }

    public String getStudentname() {
        return StudentName;
    }
    public void setStudentname(String studentname) {
        this.StudentName = StudentName;
    }

    public String getVersityName() {
        return VersityName;
    }
    public void setVersityName(String VersityName) {
        this.VersityName = VersityName;
    }





//    public int compareTo(Object comparestd) {
//        int compareStdName = compareTo(((StudentData) comparestd).getStudentname());
//
////		return Comparestdid(comparestd);
////		return CompareStdName(comparestd);
////
//
//    }
////
//	public int Comparestdid(Object comparestd) {
//
//	}
//
//	public int CompareStdName(Object comparestd) {
//
//		}
//



//    @Override
//    public int compareTo(Object comparestd) {
//        int compareStdID = ((StudentData)comparestd).getStudentID();
//        return this.StudentID-compareStdID;
//    }





    @Override
    public int compareTo(Object comparestd) {
        int compareStdID = ((StudentData)comparestd).getStudentID();
        return this.StudentID-compareStdID;
        //return 0;
    }

    @Override
    public String toString() {
        return " StudentID=" + StudentID + ", StudentName=" + StudentName + ", VersityName=" + VersityName + "";

    }

}