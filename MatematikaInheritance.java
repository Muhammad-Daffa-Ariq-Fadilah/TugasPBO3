public class MatematikaInheritance {
  public static void main(String[] args) {
    Matematika2 mtk2 = new Matematika2();

    int hasilTambah = mtk2.pertambahan(20, 30);
    int hasilKurang = mtk2.pengurangan(10, 5);
    int hasilKali = mtk2.perkalian(10, 3);
    int hasilBagi = mtk2.pembagian(21, 2);
    int mdls = mtk2.modulus(8, 5);

    System.out.println("Pertambahan : 20+30 = " + hasilTambah);
    System.out.println("Pengurangan : 10-5 = " + hasilKurang);
    System.out.println("Perkalian : 10*3 = " + hasilKali);
    System.out.println("Pembagian : 21/2 = " + hasilBagi);
    System.out.println("Modulus dari 8 dan 5 = " + mdls);
  }
}