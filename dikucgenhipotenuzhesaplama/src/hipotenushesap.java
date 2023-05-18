import java.util.Scanner;

public class hipotenushesap {
    public static void main(String[] args) {
        int a,b;
        double c;
        // kullanıcıların verilerinin girilmesi
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kısa Kenarı Girin : ");
        System.out.print("Kısa Kenarı Girin : ");
        a = girdi.nextInt();
        System.out.print("Uzun Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs :" +c);



    }







}
