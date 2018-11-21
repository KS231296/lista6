package zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        String[] przedmioty1 = {"Matematyka", "Mechanika", "Anatomia", "Angielski"};
        String[] przedmioty2 = {"Matematyka", "Mechanika", "Fizyka", "Angielski"};
        String[] przedmioty3 = {"Statystyka", "Mechanika", "Optyka", "Angielski"};
        String[] przedmioty4 = {"Matematyka", "Komunikacja", "Fizyka", "Angielski"};
        String[] przedmioty5 = {"Matematyka", "Mechanika", "Lasery", "Angielski"};

        ArrayList<String> kursy = new ArrayList<>(Arrays.asList(przedmioty1));
        Double[] oc1 = {4.0, 3.5, 3.0, 4.5};
        Double[] oc2 = {4.0, 5.0, 3.5, 4.0};
        Double[] oc3 = {5.0, 4.0, 4.5, 4.0};
        Double[] oc4 = {3.0, 3.5, 3.5, 4.0};
        Double[] oc5 = {4.0, 3.5, 5.5, 4.5};
        ArrayList<Double> oceny = new ArrayList<>(Arrays.asList(oc1));

        Student st1 = new Student("Anna", "Nowak", kursy, oceny);

        oceny = new ArrayList<>(Arrays.asList(oc2));
        kursy = new ArrayList<>(Arrays.asList(przedmioty2));
        Student st2 = new Student("Jan", "Kowal", kursy, oceny);

        oceny = new ArrayList<>(Arrays.asList(oc3));
        kursy = new ArrayList<>(Arrays.asList(przedmioty3));
        Student st3 = new Student("Genowefa", "Prus", kursy, oceny);

        oceny = new ArrayList<>(Arrays.asList(oc4));
        kursy = new ArrayList<>(Arrays.asList(przedmioty4));
        Student st4 = new Student("Krzysztof", "Dawid", kursy, oceny);

        oceny = new ArrayList<>(Arrays.asList(oc5));
        kursy = new ArrayList<>(Arrays.asList(przedmioty5));
        Student st5 = new Student("Abelard", "Giza", kursy, oceny);



        st3.addCourseAndGrade("Anatomia", 3.0);

        st4.removeCourseAndGrade("Angielski");


        Student[] studenci = {st1,st2,st3,st4,st5};
        System.out.println("lista");
        for (int i = 0; i<studenci.length; i++) System.out.printf("%s %n", studenci[i]);

        Arrays.sort(studenci);
        System.out.println("SORTOWANIE");

        for (int i = 0; i<studenci.length; i++) System.out.printf("%s %n", studenci[i]);

        Comparator<Student> imie = new NameComparator();
        Arrays.sort(studenci, imie );
        System.out.println("PO IMIENIU");
        for (int i = 0; i<studenci.length; i++) System.out.printf("%s %n", studenci[i]);

        Comparator<Student> liczba = new CourseComparator();
        Arrays.sort(studenci, liczba );
        System.out.println("PO LICZBIE KURSÓW");
        for (int i = 0; i<studenci.length; i++) System.out.printf("%s %n", studenci[i]);


    }


}

