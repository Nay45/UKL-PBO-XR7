package UKLPBO.Perpustakaan;

import java.util.Scanner;

public class Print {
    //    Cetak class buku
    public void cetak(Buku buku){
        int x = buku.getJmlBuku();

        System.out.println("===== List Buku =====");
        System.out.println("Id" + "\t" + "Judul" + "\t" + "Stok" + "\t" + "Harga");
        for (int i = 0; i < x; i++){
            System.out.println(buku.getid(i) + "\t" + buku.getNamaBuku(i) + "\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
        }
    }

    //    Cetak class Array Siswa
    public void cetak(ArraySiswa arraySiswa){
        int x = arraySiswa.getJmlSiswa();

        System.out.println("===== List Siswa =====");
        System.out.println("Id" + "\t" + "Nama" + "\t" + "Alamat" + "\t\t" + "Nomor" + "\t\t" + "Status");
        for (int i = 0; i < x; i++){
            System.out.println(arraySiswa.getid(i) + "\t" + arraySiswa.getNama(i) + "\t" + arraySiswa.getAlamat(i) + "\t" + arraySiswa.getTelepon(i) + "\t" + arraySiswa.getStatus(i));
        }
    }

    public void siswa (int selectedIDSiswa){
        ArraySiswa arraySiswa = new ArraySiswa();
//          Print data siswa terbaru
        System.out.println("\n---------------------------");
        System.out.println("Id Siswa : " + arraySiswa.getid(selectedIDSiswa));
        System.out.println("Nama : " + arraySiswa.getNama(selectedIDSiswa));
        System.out.println("Alamat : " + arraySiswa.getAlamat(selectedIDSiswa));
        System.out.println("Nomor : " + arraySiswa.getTelepon(selectedIDSiswa));


    }

    public void karyawan (){
        ArrayKaryawan arrayKaryawan = new ArrayKaryawan();
//          Print karyawan yang bekerja
        System.out.println("--------- Karyawan ---------");
        System.out.println("Nama : " + arrayKaryawan.getNama(0));
        System.out.println("Alamat : " + arrayKaryawan.getAlamat(0));
        System.out.println("Telepon : " + arrayKaryawan.getTelepon(0));
        System.out.println("---------------------------\n");
    }
}
