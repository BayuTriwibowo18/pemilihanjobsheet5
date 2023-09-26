import java.util.Scanner;

public class PemilihanPerconbaan107 {
    public static void main(String[] args){
        Scanner input07 =new Scanner(System.in);
        System.out.println("masukkan angka");
        int angka = input07.nextInt();

        if (angka % 2 == 0){
            System.out.println("angka "+angka+" bilang genap");
        }
        else{System.out.println("angka "+angka+" bilangan ganjil");

        }
            
    }
    
}
