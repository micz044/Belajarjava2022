package com.tutorial;
import java.util.Scanner;

public class tugasMid2 {
      public static void main(String[] args) {
            int noStudio, jmlKarcis, hargaKarcis;
            String jFilm;

            System.out.println("Panakukkang  Theatre");
            System.out.println("=====================");

            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);

            System.out.print("Masukkan nomor studio yang ingin dimasuki :");
            noStudio =scan.nextInt();
            System.out.print("Masukkan jumlah karcis yang di inginkan : ");
            jmlKarcis = scan.nextInt();

            switch (noStudio) {
                  case 1:
                        hargaKarcis = 5000;
                        jFilm = "Titanic";
                        System.out.println("judul film yang akan di tonton adalah "+jFilm);
                        System.out.println("jumlah pembayaran tiket adalah "+jmlKarcis * hargaKarcis);
                        break;
                  case 2:
                        hargaKarcis = 4000;
                        jFilm = "The Mummy";
                        System.out.println("judul film yang akan di tonton adalah "+jFilm);
                        System.out.println("jumlah pembayaran tiket adalah "+jmlKarcis * hargaKarcis);
                  case 3:
                        hargaKarcis = 6000;
                        jFilm = "Terminator 3";
                        System.out.println("judul film yang akan di tonton adalah "+jFilm);
                        System.out.println("jumlah pembayaran tiket adalah "+jmlKarcis * hargaKarcis);
                  default:
                        break;
            }





      }
}
