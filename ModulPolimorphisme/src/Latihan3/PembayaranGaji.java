/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author asus
 */
class PembayaranGaji {
    public int hitunganGaji(Pegawai peg){
        int uang = peg.gaji();
        if (peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        
        if (peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        
        return uang;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur Tony = new Direktur();
        System.out.println("gaji staf = "+pg.hitunganGaji(ali));
        System.out.println("gaji direktur = "+pg.hitunganGaji(Tony));
    }
    
}
