/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan41.massajenis;

/**
 * @author 
 * NAMA      : Garry Prang
 * KELAS     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menghitung massa jenis kubus.
 */

public class PBO210116147Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        System.out.println("======= MASSA JENIS KUBUS =======");
        kubus.setSisi(5);
        System.out.println("Sisi\t\t: " + kubus.getSisi());
        //int sisi = scanner.nextInt();
        //kubus.setSisi(Sisi);
        kubus.setMassa(250);
        System.out.println("Massa\t\t: " + kubus.getMassa());
        //int massa = scanner.nextInt;
        //kubus.setMassa(massa);
        
        System.out.println();
        System.out.println("======= HASIL PERHITUNGAN =======");
        System.out.println("Volume\t\t: " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis\t: " + kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
    }
    
}
