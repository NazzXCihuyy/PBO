package TugasP7;

class Mobil{
    String merk;
    String warna;
    
    Mobil(String merk, String warna){
        this.merk = merk;
        this.warna = warna;
    }
    
    void tampilInfo(){
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Warna Mobil: " + warna);
    }
}

public class Soal1 {

    public void jalankan(){
        System.out.println("=== Soal 1: Class dan Object === ");
        System.out.println("Class adalah Blueprint untuk membuat project");
        System.out.println("Object adalah wujud nyata dari class");
        System.out.println("Object dapat memiliki atribut dan mennnjalan method yang ada di class");
        
        Mobil mobil1 = new Mobil("Toyota", "Hitam");
        
        mobil1.tampilInfo();
    }
}
