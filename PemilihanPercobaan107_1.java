import java.util.Scanner;

public class PemilihanPercobaan107_1 {
    public static void main(String[] args){
        Scanner input07 =new Scanner(System.in);
        System.out.println("masukkan angka");
        int umur = input07.nextInt();

        if (umur < 17){
            System.out.println("umur"+umur+" belum punya ktp");
        }
        else{System.out.println("umur"+umur+" punya ktp");

        }
            
    }
    
}