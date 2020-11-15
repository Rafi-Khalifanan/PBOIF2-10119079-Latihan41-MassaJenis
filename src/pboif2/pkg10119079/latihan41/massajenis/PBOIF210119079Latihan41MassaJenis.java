package pboif2.pkg10119079.latihan41.massajenis;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan41MassaJenis {
    public static void main(String[] args) {
        kubus skubus = new kubus();
        
        skubus.setSisi(5);
        skubus.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi: " + skubus.getSisi());
        System.out.println("Massa: " + skubus.getMassa());
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + skubus.hitungVolume(skubus.getSisi()));
        System.out.println("Massa Jenis : " + skubus.hitungMassaJenis(skubus.getMassa(), skubus.hitungVolume(skubus.getSisi())));
    }
    
}
