package com.tutorial;

import java.util.Scanner;

public class tugasMid {
      public static void main(String[] args) {
            Float hp, gaji = null;
            Scanner scan = new Scanner(System.in);

            System.out.println("======PT. MAJU SELANGKAH======");
            System.out.println("program penentuan gaji sales");
            System.out.println("===============================");

            System.out.print("Masukkan hasil penjualan anda : ");
            hp = scan.nextFloat();

            if(hp<=200000){
                  gaji =((hp*10/100)+10000);
            }else if(hp>200000 & hp<=500000){
                  gaji = ((hp*15/100)+20000);
            }else if(hp>500000){
                  gaji =((hp*20/100)+30000);
            }else{
                  gaji = null;
            }
      System.out.println("Gaji anda adalah : " +gaji);
      }
}
