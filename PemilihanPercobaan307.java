import java.util.Scanner;

public class PemilihanPercobaan307 {
    public static void main(String[] args){
        Scanner input07 =new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

    
        System.out.println("masukkan angka pertama: ");
        angka1 = input07.nextDouble();
        System.out.println("masukkan angka kedua: ");
        angka2 = input07.nextDouble();
        System.out.println("masukkan operator (+ - * /): ");
        operator = input07.next().charAt(0);

        switch (operator){
            case '+':
              hasil = angka1 + angka2;
              System.out.println(angka1 + "-" + angka2 +"=" +hasil);
              
            case '-':
              hasil = angka1 - angka2;
              System.out.println(angka1 +"-" + angka2 + "=" +hasil);
              break;
            case '*':
              hasil = angka1 * angka2;
              System.out.println(angka1 + "*" +angka2 + "="+ hasil);
              break;
            case '/':
            hasil= angka1 / angka2;
            System.out.println(angka1 + "/" + angka2 + "=" +hasil);
            break;
        }
    }
    
}
