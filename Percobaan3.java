import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun -1));
        }
    }
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int saldoAwal, tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = input15.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = input15.nextInt();

        System.out.println("Jumlah saldo setelah " + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
}
