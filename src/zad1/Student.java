package zad1;

import java.util.ArrayList;

public class Student  implements Comparable<Student> {
    private String imie;
    private String nazwisko;
    private ArrayList<String> listaKursow;
    private ArrayList<Double> oceny;

    public Student(String imie, String nazwisko, ArrayList<String> listaKursow, ArrayList<Double> oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaKursow = listaKursow;
        this.oceny = oceny;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaKursow = new ArrayList<>();
        this.oceny = new ArrayList<>();
    }

    public Student() {
        this.listaKursow = new ArrayList<>();
        this.oceny = new ArrayList<>();
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<String> getListaKursow() {
        return listaKursow;
    }

    public ArrayList<Double> getOceny() {
        return oceny;
    }

    public void addCourseAndGrade(String course, double grade) {
        listaKursow.add(course);
        oceny.add(grade);
    }

    public void removeCourseAndGrade(String course) {
        int number = listaKursow.indexOf(course);
        listaKursow.remove(number);
        oceny.remove(number);
    }

    public double srednia() {
        double suma = 0;
        for (int i = 0; i < oceny.size(); i++) {
            suma = suma + oceny.get(i);
        }
        return suma / oceny.size();
    }

    @Override
    public String toString() {
        return "imie: " + imie + ", nazwisko: " + nazwisko + ", kursy: " + listaKursow.toString() + ", oceny: " + oceny.toString();
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(srednia(), other.srednia());
    }

/*
    public interface Comparable<Double> {
        int compareTo(Double other);
    }*/

}

