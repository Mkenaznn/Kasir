
package kasir;

import java.util.Scanner;
public class Kasir {

 public static void main(String[] args) {
  Scanner aa = new Scanner(System.in);
  
  String nama;
  double harga;
  double jumlah;
  double total;
  double disc=0;
  char jawab;
  double tobar=0;
  double topen=0;
  double dispen=0;
  char jaw;
  
  do
  {
   nama ="";
   harga=0;
   jumlah=0;
   total=0;
   disc=0;
   tobar=0;
   topen=0;
   dispen=0;
   
   do
   {
    System.out.print("Nama Barang : ");
    nama=aa.next();
    System.out.print("Harga Barang : ");
    harga=aa.nextDouble();
    System.out.print("Jumlah yang akan dibeli : ");
    jumlah=aa.nextDouble();
    tobar=tobar+jumlah;
    total=harga*jumlah;
   
    System.out.println("Total Jual : " + total);
  
    if (total > 100000)
    {
     disc = total * 0.1;
     System.out.println("Selamat, Anda mendapatkan diskon dari barang ini senilai " + disc);
    }
   
    topen=topen+(total-disc);
  
    System.out.print("Tambah Barang ? (y/t) ");
    jawab=aa.next().charAt(0);
  
   }while(jawab=='y'|| jawab=='Y');
   
    System.out.println("---------------------------------------------------------------------");
    System.out.println("Total Barang : "+tobar);
    System.out.println("Total Penjualan : Rp. "+topen);
   
    if(topen > 500000)
    {
     dispen=topen*0.05;
     System.out.println("Selamat, anda mendapatkan diskon dari total penjualan senilai "+dispen);
    }
   
    System.out.println("Transaksi Baru ? (y/t)");
    jaw=aa.next().charAt(0);
   
   }while(jaw=='y'|| jaw=='Y');

 }

}