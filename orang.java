package com.file;

public class orang {
    String nama;
    String alamatRumah;
    int noTelp;
    int noHp;
    int usia;
    int id;
    
    public void orang(){
        System.out.println("nama: "+nama);
        System.out.println("id: "+id);
        System.out.println("alamat: "+alamatRumah);
        System.out.println("no telp: "+noTelp);
        System.out.println("no hp: "+noHp);
        System.out.println("usia: "+usia);

    }
}

class mhs extends orang{
    int jumlahSKSdiambil;
    public void mhs(){
        super.orang();
        System.out.println("jumlah sks: "+jumlahSKSdiambil);
    }

    public static void main(String[] args) {
        mhs mhs = new mhs();
        dosen dosen = new dosen();
        karyawan karyawan = new karyawan();
        
        //Mahasiswa
        mhs.nama = "Kiyotaka Fahreza";
        mhs.id = 1203210057;
        mhs.alamatRumah = "Nusa Kambangan";
        mhs.noTelp = 628111;
        mhs.noHp = 62813181;
        mhs.usia = 19;
        mhs.jumlahSKSdiambil = 21;

        //Dosen
        dosen.nama = "Fahreza sama";
        dosen.id = 1110011;
        dosen.nidn = 14031031;
        dosen.alamatRumah = "Tokyo";
        dosen.noTelp = 62318871;
        dosen.noHp = 62887819;
        dosen.usia = 26;
        dosen.jumlahSKSdiajar = 15;
        dosen.gaji = 20000000;

        //Karyawan
        karyawan.nama = "Aether";
        karyawan.id = 556672361;
        karyawan.alamatRumah = "Sumeru";
        karyawan.noTelp = 623178278;
        karyawan.noHp = 627236217;
        karyawan.usia = 500;

        
        System.out.println("\nData mahasiswa: ");
        mhs.mhs();
        System.out.println("\nData dosen: ");
        dosen.dosen();
        System.out.println("\nData karyawan: ");
        karyawan.orang();


    }
}

class dosen extends orang{
    int nidn;
    int jumlahSKSdiajar;
    int gaji;

    public void dosen(){
        super.orang();
        System.out.println("nidn: "+nidn);
        System.out.println("jumlah sks: "+jumlahSKSdiajar);
        System.out.println("gaji: "+gaji);
    }
}

class karyawan extends orang{
    public void karyawan(){
        super.orang();
    }
}
