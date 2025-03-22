package pertemuan303;

import java.util.Scanner;

/**
 *
 * @author Made Artha
 * TGL 22 Maret 2025
 */
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilih;
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Pilih Menu A/B/C: ");
        pilih = dtIN.nextLine();
        switch (pilih) {
            case "A":
                System.out.println("Memilih Menu A");
                break;
            case "B":
                System.out.println("Memilih Menu B");
                break;
            case "C":
                System.out.println("Memilih Menu C");
                break;
            default:
                System.out.println("Pilihan di luar Menu A/B/C");
        }
        
    }
    
}
