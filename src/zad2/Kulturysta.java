package zad2;

import java.time.LocalDate;

public class Kulturysta {
    private String imie;
    private Plec plec;

    public enum Plec {
        S,
        M,
        L,
        XL
    }

    private double masa;
    private double wzrost;
    private LocalDate dataUrodzenia;

    public int wiek() {
        return LocalDate.now().minusYears(dataUrodzenia.getYear()).getYear();
    }

    @Override
    public String toString() {
        return "imie: " + imie + ", płeć: " + plec + ", masa ciała: " + masa + ", wzrost: " + wzrost + "data urodzenia" + dataUrodzenia;
    }

    public interface Measurable {
        public double getMeasure();
    }

}
