public class Main {

    public static void main(String[] args){
        genreBuku genre01 = new genreBuku("G001", "Fiksi");
        genreBuku genre02 = new genreBuku("G002", "Sains");

        Buku bk01 = new Buku("BK001", "Laskar Pelangi");
        Buku bk02 = new Buku("BK002", "Fisika Dasar");

        AdminPerpus admin01 = new AdminPerpus("Ibu Sari", "Jl. Perpus No.1", "sari@perpus.com", "AD001", "Kepala Perpustakaan");
        admin01.tambahBukuBaru(bk01, genre01);
        admin01.tambahBukuBaru(bk02, genre02);
        System.out.println();

        Mahasiswa mhs01 = new Mahasiswa("Andi", "Jl. Merdeka No.1", "andi@mail.com",
                                         "MB001", "2024-01-10",
                                         "J04001", "Teknik Informatika", 5, 3.7);

        Member mbr02 = new Member("Budi", "Jl. Sudirman No.5", "budi@mail.com", "MB002", "2024-02-15");

        Person[] daftarOrang = { admin01, mhs01, mbr02 };
        System.out.println("=== Semua Orang di Sistem Perpus ===");
        for(Person p : daftarOrang){
            p.tampikanIdentitas();  
            System.out.println();
        }

        Peminjam[] daftarPeminjam = { mhs01, mbr02 };
        System.out.println("=== Aktivitas Peminjaman ===");
        daftarPeminjam[0].pinjamBuku(bk01);
        daftarPeminjam[1].pinjamBuku(bk02);
        for(Peminjam p : daftarPeminjam){
            p.tampilkanBukuDipinjam();
        }
        System.out.println();

        bk01.tampilkanPeminjam();
        System.out.println();

        PengelolaBuku pengelola = admin01; 
        pengelola.hapusBukuDariKatalog(bk02);
        admin01.tampilkanBukuDikelola();
    }
}