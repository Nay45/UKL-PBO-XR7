package UKLPBO.Perpustakaan;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        try {
//            Scanner
            Scanner input = new Scanner(System.in);

//            Progres status
            boolean progres = true;

//            Random key
            String key;

//            Membuat objek arraysiswa
            UKLPBO.Perpustakaan.ArraySiswa arraySiswa = new ArraySiswa();

//            Membuat objek buku
            UKLPBO.Perpustakaan.Buku buku = new Buku();

//            Membuat objek arraykaryawan
            UKLPBO.Perpustakaan.ArrayKaryawan arrayKaryawan = new ArrayKaryawan();

//            Membuat objek print
            UKLPBO.Perpustakaan.Print print = new Print();

//            Program utama
            while (progres) {
//            Menu
                System.out.println("---- Library ----");
                System.out.println("1. List Buku");
                System.out.println("2. List Siswa");
                System.out.println("3. Pinjam/Kembalikan");
                System.out.println("4. Exit");
                System.out.print("Pilih menu: ");
                int menu = input.nextInt();

//            Percabangan
                if (menu == 1) {
                    System.out.println();
                    System.out.println("---------------------------\n");

                    // menampilkan daftar buku
                    print.cetak(buku);
                    System.out.println("Press any key and enter...");
                    key = input.next();
                } else if (menu == 2) {
                    System.out.println();
                    System.out.println("---------------------------\n");

                    //menampilkan daftar siswa
                    print.cetak(arraySiswa);
                    System.out.println("Press any key and enter...");
                    key = input.next();
                } else if (menu == 3) {
                    System.out.println();
                    System.out.println("---------------------------\n");
                    System.out.println("---- Peminjaman Buku / Pengembalian ----");

                    System.out.print("Masukkan id siswa : ");
                    int selectedIDSiswa = input.nextInt();
                    selectedIDSiswa -= 1; // Id siswa - 1

                    System.out.print("Masukkan id Buku : ");
                    int selectedIDBuku = input.nextInt();
                    selectedIDBuku -= 1; // Id buku - 1

                    System.out.print("Banyak buku " + buku.getNamaBuku(selectedIDBuku) + " yang dipinjam : ");
                    int banyakbuku = input.nextInt();

//                    Percabangan
                    if (arraySiswa.getStatus(selectedIDSiswa) == true) {
                        System.out.println("Sedang diproses");
                        if (banyakbuku <= buku.getStok(selectedIDBuku)) {
                            buku.setBukuMin(selectedIDBuku, banyakbuku);
                            arraySiswa.editStatus(selectedIDSiswa, false);
                        } else { // tidak sesuai dengan kriteria
                            System.out.println("Maaf permintaan tidak bisa diproses");
                            System.out.println("Press any key and enter...");
                            key = input.next();
                        }

//                        Print data siswa terbaru
                        print.siswa(selectedIDSiswa);
                        System.out.println("Status terbaru : " + arraySiswa.getStatus(selectedIDSiswa));
                        System.out.println("---------------------------\n");

//                        Print karyawan yang bekerja
                        print.karyawan();

                    } else if (arraySiswa.getStatus(selectedIDSiswa) == false) {
                            System.out.print("Siswa Telah meminjam!");
                            System.out.print("\nApakah anda ingin mengembalikan buku ? y/n : ");
                            key = input.next();
                            if (key.equalsIgnoreCase("Y")) {
                                System.out.print("Masukkan id buku yang dipinjam : ");
                                int idbukupinjam = input.nextInt();
                                idbukupinjam -= 1; // id buku - 1

                                System.out.print("Masukkan jumlah buku " + buku.getNamaBuku(idbukupinjam) + " yang dipinjam : ");
                                int jumlahbukupinjam = input.nextInt();

                                buku.setBukuPlus(idbukupinjam, jumlahbukupinjam);

                                arraySiswa.editStatus(selectedIDSiswa, true);
                            }
//                        Print data siswa terbaru
                            print.siswa(selectedIDSiswa);
                            System.out.println("Status terbaru : " + arraySiswa.getStatus(selectedIDSiswa));
                            System.out.println("---------------------------\n");

//                        Print karyawan yang bekerja
                            print.karyawan();

                            }
                } else if (menu == 4) {
                    //variabel "progres" diset false menyebabkan program berhenti (Menu exit / menghentikan program)
                    progres = false;
                }
            }
        } catch (Exception e) { // Mengetahui error
            System.out.println("Terdapat Exception! \n Info : " + e.getMessage());
        }
    }
}
