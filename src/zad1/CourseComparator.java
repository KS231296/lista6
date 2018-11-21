package zad1;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return  s1.getListaKursow().size() - s2.getListaKursow().size();
    }
}
