
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class sudut {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Sudut (nilai 0 ~ 360) ");
        System.out.println(" *************************************************************");

        double a = sc.nextInt();

        System.out.println(" *********************************************************** ");
        if (a == 90) {
            System.out.println(" *Maka Sudut " + a + " Derajat adalah Sudut Siku-siku ");
        } else if (a < 90) {
            System.out.println(" *Maka Sudut " + a + " Derajat adalah Sudut Lancip ");
        } else if (a > 90 && a < 180) {
            System.out.println(" *Maka Sudut " + a + " Derajat adalah Sudut Tumpul ");
        } else if (a == 180) {
            System.out.println(" *Maka Sudut " + a + " Derajat adalah Sudut Lurus ");
        } else if (a > 180 && a < 360) {
            System.out.println(" *Maka Sudut " + a + " Derajat adalah Sudut Refleks ");
        } else if (a == 360) {
            System.out.println(" *Maka Sudut " + a + " Derajat adalah Putaran Penuh ");
        } else {
            System.out.println(" *Nilai yang anda masukan salah masukan nilai 0 ~ 360 ");
        }
        System.out.println(" *********************************************************** ");
    }

}
