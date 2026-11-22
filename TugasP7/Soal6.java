package TugasP7;



import java.util.Scanner;

class Civitas {

    private String nama;
    private String status;

    public Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);
        System.out.println();
    }
}

class Dosen extends Civitas {

    public Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas {

    public Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {

    public Staff(String nama) {
        super(nama, "Staff");
    }
}

public class Soal6 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 6: Civitas Akademika ===");
        input.nextLine();
        System.out.print("Masukkan nama dosen: ");
        String namaDosen = input.nextLine();

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = input.nextLine();

        System.out.print("Masukkan nama staff: ");
        String namaStaff = input.nextLine();

        Civitas dosen = new Dosen(namaDosen);
        Civitas mahasiswa = new Mahasiswa(namaMahasiswa);
        Civitas staff = new Staff(namaStaff);

        System.out.println("\nData Civitas Akademika Fakultas Teknik");

        dosen.tampilData();
        mahasiswa.tampilData();
        staff.tampilData();
    }
}
