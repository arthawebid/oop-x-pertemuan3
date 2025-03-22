package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Percabangan IF
        //Lulus apabila nilai 80 ke atas
        
        int nilai=0;
        String ket;
        
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Input Nilai: ");
        nilai = Integer.parseInt(dtIN.nextLine());
        
        if(nilai>=80){
            ket = "Lulus";
        }else{
            ket = "Tidak Lulus";
        }
        
        System.out.printf("dinyatakan %s", ket);
    }
    
}
