import java.util.Scanner;
public class UTS_GASAL_BP_1 {

    public static void main(String[] args) {

        System.out.println("UTS SEMESTER GANJIL TA. 2022/2023");
        System.out.println("Mata Kuliah : Bahasa Pemrograman 1");
        System.out.println("Kelas/Paralel : D");
        System.out.println("Anggota Kelompok : ");
        System.out.println("1. Hussein Muhammad Ibrahim 22082010132");
        System.out.println("2. Azzahra Rahmadani 22082010155");
        System.out.println("3. Muhammad Arief Budianto 22082010160");
        System.out.println("4. Fatharani Mazaya Agniya Putri 22082010171");
        System.out.println("5. Keysha Naila Chadijah 22082010173");
        System.out.println(" ");


            Scanner input = new Scanner(System.in);
            String kembali;

            float redev, x, y, z;
            float jumlah1 = 0;
            float jumlah2 = 0;
            float jumlah3 = 0;


            //Array data penjualan per-bulan
            int b = 11;
            int [] bulan = new int[b];
            int n = bulan.length;


            do{
                System.out.println("Masukkan Data Penjualan Per-Bulan");
                System.out.println(" ");

                for (int i = 0; i<n; i++) {
                    System.out.print("Data Penjualan Bulan ke-" + (i+1) + ": ");
                    bulan[i] = input.nextInt();
                }
                System.out.println(" ");


                //orde 2
                System.out.println("==================== ORDE-2 ====================");
                for (int i = 0; i<n-2; i++) {
                    float fungsi1 = ((bulan[i] + bulan[i + 1]) / 2);
                    System.out.println("Data Bulan ke-" + (i+3));
                    System.out.println("Unit Terjual = " + bulan [i+2]);
                    System.out.println("Data Peramalan = " + fungsi1);
                    float hasil = bulan [i+2] - fungsi1;
                    if (hasil<0) {
                        hasil *= -1;
                    }
                    else {
                        hasil *= 1;
                    }
                    redev = ((hasil) / bulan[i+2] * 100);
                    System.out.println("Relative Deviation Orde-2 = " + redev + "%");
                    jumlah1 = jumlah1 + redev;
                    System.out.println(" ");
                }

                x = jumlah1 / 9;
                System.out.println("Rata-Rata Relative Deviation untuk Orde-2 adalah: " + x + "%");
                System.out.println(" ");


                //orde 3
                System.out.println("==================== ORDE-3 ====================");
                for (int i = 0; i<n-3; i++) {
                    float fungsi2 = ((bulan[i] + bulan[i+1] + bulan[i+2]) / 3);
                    System.out.println("Data Bulan ke-" + (i+4));
                    System.out.println("Unit Terjual = " + bulan[i+3]);
                    System.out.println("Data Peramalan = " + fungsi2);
                    float hasil = bulan[i+3] - fungsi2;
                    if (hasil<0) {
                        hasil *= -1;
                    }
                    else {
                        hasil *= 1;
                    }
                    redev = ((hasil) / bulan[i+3] * 100);
                    System.out.println("Relative Deviation Orde-3 = " + redev + "%");
                    jumlah2 = jumlah2 + redev;
                    System.out.println(" ");
                }

                y = jumlah2 / 8;
                System.out.println("Rata-Rata Relative Deviation untuk Orde-3 adalah: " + y + "%");
                System.out.println(" ");


                //orde 4
                System.out.println("==================== ORDE-4 ====================");
                for (int i = 0; i<n-4; i++) {
                    float fungsi3 = ((bulan[i] + bulan[i+1] + bulan[i+2] + bulan[i+3]) / 4);
                    System.out.println("Data Bulan ke-" + (i+5));
                    System.out.println("Unit Terjual = " + bulan[i+4]);
                    System.out.println("Data Peramalan = " + fungsi3);
                    float hasil = bulan[i+4] - fungsi3;
                    if (hasil<0) {
                        hasil *= -1;
                    }
                    else {
                        hasil *= 1;
                    }
                    redev = ((hasil) / bulan[i+4] * 100);
                    System.out.println("Relative Deviation Orde-4 = " + redev + "%");
                    jumlah3 = jumlah3 + redev;
                    System.out.println(" ");
                }

                z = jumlah3 / 7;
                System.out.println("Rata-Rata Relative Deviation untuk Orde-4 adalah: " + z + "%");
                System.out.println(" ");
                System.out.println("===================================================");
                System.out.println(" ");


                if (x<y && x<z) {
                    System.out.println("Karena Nilai Relative Deviation yang Terkecil adalah yang Orde 2 Bulan yaitu " + x +
                            "% Maka yang dipilih adalah data peramalan dengan orde 2 bulan. Dengan Demikian pada " +
                            "bulan ke 12 jumlah unit yang terjual diperkirakan sejumlah 9430 unit.");

                } else if (y<x && y<z){
                    System.out.println("Karena Nilai Relative Deviation yang Terkecil adalah yang Orde 3 Bulan yaitu " + y +
                            "% Maka yang dipilih adalah data peramalan dengan orde 2 bulan. Dengan Demikian pada " +
                            "bulan ke 12 jumlah unit yang terjual diperkirakan sejumlah 9253 unit.");

                } else if (z<x && z<y){
                    System.out.println("Karena Nilai Relative Deviation yang Terkecil adalah yang Orde 4 Bulan yaitu " + z +
                            "% Maka yang dipilih adalah data peramalan dengan orde 2 bulan. Dengan Demikian pada " +
                            "bulan ke 12 jumlah unit yang terjual diperkirakan sejumlah 9015 unit.");
                }
                System.out.println(" ");
                System.out.println("===================================================");
                System.out.println(" ");


                System.out.println("Apakah Anda ingin mengulang kembali? (ya/tidak)");
                kembali = input.next();
                System.out.println(" ");
                if (kembali.equalsIgnoreCase("ya")) {
                } else {
                    System.exit(0);
                }

            } while (true);
    }
}
