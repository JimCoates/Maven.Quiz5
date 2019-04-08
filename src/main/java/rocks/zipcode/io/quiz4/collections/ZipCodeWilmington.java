package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    List<Student> enrolledStudents;

    public ZipCodeWilmington(){
        this.enrolledStudents = new ArrayList<>();
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return enrolledStudents.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student student: enrolledStudents) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for (Student student:enrolledStudents) {
           studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
