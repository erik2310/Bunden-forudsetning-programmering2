package erik2310;

public class DatHoldet {

    // Default no-arg constructor som bliver kaldt når objektet skal oprettes
    public DatHoldet() {

    }

    // Laver en void metode med de studerende som objekter, som også udskriver alle de studerende
    void getStuderende() {
        // Laver de studerende som objekter af klassen Studerende og giver dem navn, alder, by og skole
        Studerende student1 = new Studerende("Erik", 22, "Næstved", "EASJ");
        Studerende student2 = new Studerende("Daniel" , 23, "Næstved", "EASJ");
        Studerende student3 = new Studerende("Burhan", 30, "Næstved" , "EASJ");
        Studerende student4 = new Studerende("Niels", 40, "Næstved", "EASJ");
        Studerende student5 = new Studerende("Mads", 20, "Næstved", "EASJ");

        // Udskriver alle de studerende med navn, alder, by og skole ved at bruge metoderne i Studerende klassen
        System.out.println("Navn: " + student1.getNavn());
        System.out.println("Alder: " + student1.getAlder());
        System.out.println("By: " + student1.getBy());
        System.out.println("Skole: " + student1.getSkole());
        System.out.println();
        System.out.println("Navn: " + student2.getNavn());
        System.out.println("Alder: " + student2.getAlder());
        System.out.println("By: " + student2.getBy());
        System.out.println("Skole: " + student2.getSkole());
        System.out.println();
        System.out.println("Navn: " + student3.getNavn());
        System.out.println("Alder: " + student3.getAlder());
        System.out.println("By: " + student3.getBy());
        System.out.println("Skole: " + student3.getSkole());
        System.out.println();
        System.out.println("Navn: " + student4.getNavn());
        System.out.println("Alder: " + student4.getAlder());
        System.out.println("By: " + student4.getBy());
        System.out.println("Skole: " + student4.getSkole());
        System.out.println();
        System.out.println("Navn: " + student5.getNavn());
        System.out.println("Alder: " + student5.getAlder());
        System.out.println("By: " + student5.getBy());
        System.out.println("Skole: " + student5.getSkole());
        System.out.println();

    }
}
