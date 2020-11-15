/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan50_EnergiKinetik;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan energi kinetik
 */
public class PBO_IF2_10116414_EnergiKinetik {
    public static void main(String[] args) {
        Energi energi = new Energi();
        energi.setMassa(145);
        energi.setKecepatan(25);
        
        System.out.println("1 buah baseball dengan massa = " + energi.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + energi.getKecepatan() + " m/s");
        
        double massa = energi.getMassa();
        double kecepatan = energi.getKecepatan();
        
        System.out.println("\nA. Energi Kinetik = " + energi.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + energi.usaha());
        System.out.println("Catatan : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
}
