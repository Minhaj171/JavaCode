//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDataMain<arraylist> {
    public static void main(String[] args) {

        //StudentDetails student = new StudentDetails(101, "minhaj", "Daffodil");
        ArrayList<StudentData> arraylist = new ArrayList<StudentData>();

        arraylist.add(new StudentData(108, "minhaj", "Daffodil"));
        arraylist.add(new StudentData(102, "bisal", "stamfford"));
        arraylist.add(new StudentData(101, "radhio", "buet"));
        arraylist.add(new StudentData(109, "avi", "eastwest"));
        arraylist.add(new StudentData(100, "alvi", "eastwest"));
        arraylist.add(new StudentData(100, "alvj", "eastwest"));

        System.out.println("Sorting Student Id:");
        System.out.println("--------------------------------");
        Collections.sort(arraylist);
        for(StudentData au: arraylist){
            System.out.println(au.getStudentID()+", "+au.getStudentname()+", "+
                    au.getVersityName());
        }

        System.out.println("\nSorting Student ID & Name:");
        System.out.println("--------------------------------");
        Collections.sort(arraylist, new NameComperator());
        for(StudentData au: arraylist){
            System.out.println(au.getStudentID()+", "+au.getStudentname()+", "+
                    au.getVersityName());
        }


    }




    }


