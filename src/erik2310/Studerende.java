package erik2310;

public class Studerende {

    // Deklarer variabler som skal bruges i klassen, der beskriver de studerende og giver dem default værdier
    private String navn = "";
    private int alder = 0;
    private String by = "";
    private String skole = "";

    // Default no-arg constructor som bliver kaldt når objektet skal oprettes
    public Studerende() {

    }

    // Laver en constructor med arguments så man kan lave objekter af studerende og give dem navn, alder, by, skole
    public Studerende(String navn, int alder, String by, String skole)  {
        this.navn = navn;
        this.alder = alder;
        this.by = by;
        this.skole = skole;
    }

    // Laver en metode der returnere navn som String
    String getNavn() {
        return navn;
    }

    // Laver en metode der returnere alder som int
    int getAlder()  {
        return alder;
    }

    // Laver en metode der returnere by som String
    String getBy()   {
        return by;
    }

    // Laver en metode der returnere skole som String
    String getSkole() {
        return skole;
    }
}
