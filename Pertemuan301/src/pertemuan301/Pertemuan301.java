package pertemuan301;

import java.util.Scanner;

/**
 *
 * @author Made Artha
 * TGL 22 Maret 2025
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Perulangan While
        int awal = 0;
        int akhir = 10;
        
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Isikan Nilai Awal: ");
        awal = Integer.parseInt( dtIN.nextLine() );
        System.out.print("Isikan Nilai Akhir: ");
        akhir = Integer.parseInt( dtIN.nextLine() );
        
        System.out.println("Perulangan dengan while");
        int pAwal = awal;
        while( pAwal < akhir ){
            System.out.println("Perulangan ke-"+pAwal);
            pAwal++;
        }
        
        System.out.println("Perulangan dengan do ..while");
        pAwal = awal;
        do{
            System.out.println("Perulangan ke-"+pAwal);
            pAwal++;
        }while(pAwal < akhir);
        
        System.out.println("Perulangan dengan For");
        for(pAwal=awal;pAwal<akhir;pAwal++){
            System.out.println("Perulangan ke-"+pAwal);
        }
        
    }
    
}
