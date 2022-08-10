package com.tutorial;
import java.util.Scanner;

public class Project1 {
      public static void main(String[] args) {
            String nama, klp;
            int umur;
            // judul Project
        System.out.println("Program Project percobaan 1");
        System.out.println("mengunakan if didalam fungsi case");
        System.out.println("program pengelompokan berdasarkan umur");
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.print("masukkan nama anda :");
            nama=scan.nextLine();
        System.out.print("Masukkan umur anda :");
            umur=scan.nextInt();

            if(umur<=20){
                  klp = " anda akan masuk di kelompok 1";
            }else if(umur>21){
                  klp =" Anda akan di masukkan di kelompok 2";
            }else{
                  klp = " salah !!!";
            }

            System.out.println("Selamat "+ nama + klp);
            

      }
}
