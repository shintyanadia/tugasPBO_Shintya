package com.kuliah.others.pbo;

public class MainApp {

    public static void main(String[] args) {
        //panggil class Manusia
        Manusia m = new Manusia();

        //[nama class] [variabel buatanmu] = new [nama class]();
        m.setRambut("Keriting");
        System.out.println("Rambutku "+ m.getRambut());

        /*
        Latihan: 
        silakan buat class Hewan dan PesawatTelepon kemudian
        gunakan class tersebut dan letakan kode dibawah ini
        */
        
        // aplikasikan class Hewan
        Hewan h = new Hewan();
        h.setKaki("ada 4");
        System.out.println("Kakiku "+ h.getKaki());
        h.makan("whiskas");

        // aplikasikan class PesawatTelepon
        PesawatTelepon pt = new PesawatTelepon();
        pt.setKabel("11 meter");
        System.out.println("Kabel telepon rumah saya lumayan panjang, sekitar "+ pt.getKabel());
        pt.terima_panggilan("om candra", "kemarin");

    }
    
}

