package erik2310;

public class Start {

    public static void main(String[] args) {

        // Laver et objekt af DatHoldet klassen
        DatHoldet datHoldet = new DatHoldet();

        // Bruger datHoldet objektet så man kan bruge getStuderende til at udskrive alle de studerende
        System.out.println("getStuderende:");
        System.out.println();
        datHoldet.getStuderende();

        // Laver et objekt af MineMetoder klassen
        MineMetoder metoder = new MineMetoder();

        // Bruger metoder objektet til at kalde på getWhile
        System.out.println("getWhile:");
        metoder.getWhile();
        System.out.println();

        // Bruger metoder objektet til at kalde på getFor
        System.out.println();
        System.out.println("getFor:");
        metoder.getFor();
        System.out.println();

        // Bruger metoder objektet til at kalde på getRandom
        System.out.println();
        System.out.println("getRandom:");
        metoder.getRandom();
        System.out.println();

        // Bruger metoder objektet til at kalde på getScanner
        System.out.println("getScanner:");
        metoder.getScanner();
        System.out.println();

        // Bruger metoder objektet til at kalde på getArray
        System.out.println("getArray:");
        metoder.getArray();

    }
}
