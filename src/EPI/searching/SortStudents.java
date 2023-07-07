package EPI.searching;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// sort students according to there GPA and if the gpa ties, use name as tie-breaker.
public class SortStudents {
    private class Student{
        public String name;
        public double gradePointAverage;

        public Student(String name, double gradePointAverage){
            this.name = name;
            this.gradePointAverage = gradePointAverage;
        }
    }
    private static Comparator<Student> comparator = (o1, o2) -> {
        if (o1.gradePointAverage != o2.gradePointAverage){
            return Double.compare(o1.gradePointAverage , o2.gradePointAverage);
        }
        return o1.name.compareTo(o2.name);
    };
    private static boolean searchStudent(List<Student> students, Student target, Comparator<Student> comparator){
        return Collections.binarySearch(students,target,comparator)>=0;
    }

}
