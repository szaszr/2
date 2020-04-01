package lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Student ion = new Student("Ion", 5);
        Student vasile = new Student("Vasile", 10);
        Student andrei = new Student("Andrei", 5);

        List<Student> originalStudentList = new ArrayList<>();
        originalStudentList.add(ion);
        originalStudentList.add(vasile);
        originalStudentList.add(andrei);
//
//
        Map<Integer, List<Student>> studentMap = new HashMap();

        for (Student student : originalStudentList) {
            if (studentMap.get(student.getFinalGrade()) == null){
                List<Student> students = new ArrayList<>();
                students.add(student);
                studentMap.put(student.getFinalGrade(), students);
            } else {
                List<Student> existingList = studentMap.get(student.getFinalGrade());
                existingList.add(student);
                studentMap.put(student.getFinalGrade(), existingList);
            }
        }

        System.out.println("asd");





//        studentMap.put(5, ion);
//
//
//        studentMap.put(vasile.getFinalGrade(), vasile);

        Map<String, String> simpleMap = new HashMap<>();

        simpleMap.put("a", "abc");
        simpleMap.put("a", "ana");
//        simpleMap.put("key1", "value 3");

        System.out.println(simpleMap.get("a"));
    }
}
