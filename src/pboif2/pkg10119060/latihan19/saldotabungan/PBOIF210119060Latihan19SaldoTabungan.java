/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan19.saldotabungan;

/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Saldo Tabungan
 */
public class PBOIF210119060Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            double lama, bunga, saldo, saldoAwal, saldoAkhir;
            
            saldoAwal = 2500000;
            bunga = 15;
            lama = 6;
            
             for(int i= 1 ; i <= lama; i++){
                    saldo = saldoAwal * bunga / 100;
                    saldoAkhir = saldo + saldoAwal;
                    System.out.printf(" Saldo di bulan ke- " + i + " Rp.%,1.0f%n ", +saldoAkhir);
                    saldoAwal += saldo;
             }
        }
    
}
