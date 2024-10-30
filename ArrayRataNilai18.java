import java.util.Scanner;
public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[10];
        double total = 0, rata2, rata2lulus = 0, rata2tidak = 0;
        int jmlLulus = 0, jumlahTidaklulus = 0, totalLulus = 0, totalTidaklulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus!");
                jmlLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " Tidak lulus!");
                jumlahTidaklulus++;
                totalTidaklulus += nilaiMhs[i];
            }
        }
        rata2 = total / jumlahMahasiswa;
        if (jmlLulus > 0) {
            rata2lulus = totalLulus / jmlLulus;
        }
        if (jumlahTidaklulus > 0) {
            rata2tidak = totalTidaklulus / jumlahTidaklulus;
        }
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai Mahasiswa yang lulus = " + jmlLulus);
        System.out.println("Rata-rata nilai Mahasiswa yang tidak lulus = " + jumlahTidaklulus);
        System.out.println("Jumlah Mahasiswa yang lulus= " + jmlLulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus = " + jumlahTidaklulus);
    }
}