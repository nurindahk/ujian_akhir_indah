/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai_rapor;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class rapor {

    int Nomor_siswa,Kelas;
    String  hasil_pengumuman;
    double Nilai_mtk, Nilai_bahasaindonesia, Nilai_bahasaingris, Nilai_ipa, Nilai_ips, Nilai_agama, Nilai_olahraga,Jumlah_Nilai,rata_nilai;

    //Constructor
    public rapor() {
        Nomor_siswa = 0;
        Kelas = 0;
        Nilai_mtk = 0.0;
        Nilai_bahasaindonesia = 0.0;
        Nilai_bahasaingris = 0.0;
        Nilai_ipa = 0.0;
        Nilai_ips = 0.0;
        Nilai_agama = 0.0;
        Nilai_olahraga = 0.0;
        Jumlah_Nilai=0.0;
        rata_nilai=0.0;
        hasil_pengumuman="";

    }
//procedure input 

    public void input() {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Nomor Siswa : ");
        Nomor_siswa = inputan.nextInt();

        System.out.print("Kelas : ");
        Kelas = inputan.nextInt();

        System.out.print("Nilai Matematika : ");
          if (!inputan.hasNextDouble()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        { Nilai_mtk=inputan.nextDouble();
        
        }
        System.out.print("Nilai Bahasa Indonesia : ");
         if (!inputan.hasNextDouble()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        { Nilai_bahasaindonesia=inputan.nextDouble();
        
        }
        System.out.print("Nilai Bahasa Inggris : ");
        if (!inputan.hasNextDouble()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        { Nilai_bahasaingris=inputan.nextDouble();
        
        }
        System.out.print("Nilai IPA : ");
         if (!inputan.hasNextDouble()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        { Nilai_ipa=inputan.nextDouble();
        }
        System.out.print("Nilai IPS : ");
         if (!inputan.hasNextDouble()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        { Nilai_ips=inputan.nextDouble();
        }
        System.out.print("Nilai Agama : ");
        if (!inputan.hasNextDouble()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        { Nilai_agama=inputan.nextDouble();
        }
        System.out.print("Nilai Olahraga : ");
         if (!inputan.hasNextDouble()) 
        {
            System.out.print("Harus Angka! Tidak bisa di proses");
        }
        else 
        { Nilai_olahraga=inputan.nextDouble();
        }
    }
 //function if 
    public void ifelse () {
        if (rata_nilai>7) {
                    hasil_pengumuman="Naik Kelas";
                }
                else if (rata_nilai<7) {
                      hasil_pengumuman="Tidak Naik Kelas";
                }
    }
 
//function jumlah 
    public double jumlah () {
        Jumlah_Nilai=Nilai_mtk+Nilai_bahasaindonesia+Nilai_bahasaingris+Nilai_ipa+Nilai_ips+Nilai_agama+Nilai_olahraga;
        return(Jumlah_Nilai);

    }
    public double rata_rata () {
        rata_nilai=Jumlah_Nilai/7;
        return(rata_nilai);
    
}
public void output(){
    Scanner input= new Scanner(System.in);
        System.out.println("==============================");
        ifelse();
        System.out.println("Nomor siswa : "+ Nomor_siswa);
        System.out.println("Kelas: "+Kelas);
        jumlah();
        System.out.println("Jumlah Nilai : "+Jumlah_Nilai);  
        rata_rata();
        System.out.println("Jumlah Rata-rata "+ rata_nilai);
        rata_rata();
        System.out.println("Hasil Pengumuman : "+hasil_pengumuman);
                ifelse();
    
}
}
public class Nilai_rapor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        rapor nr = new rapor();
        nr.input();
        nr.output();
    }

}
