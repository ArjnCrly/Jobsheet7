import java.util.Scanner;
/**
 * ForKelipatan04
 */
public class ForKelipatan04 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int kelipatan, jumlah = 0, counter = 0;
      float ratarataKelipatan = 0f;

      System.out.print("Masukkan bilangan kelipatan (1-9) : ");
      kelipatan = scan.nextInt();

   for (int i = 1; i <= 50; i++) {
      if (i % kelipatan == 0) {
         jumlah += i;
         counter++;
         ratarataKelipatan++;
      }
   }
        ratarataKelipatan = jumlah / ratarataKelipatan;
        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata kelipatan %d dari 1 sampai 50 adalah %5f\n", kelipatan, ratarataKelipatan);
        scan.close();
   }
}