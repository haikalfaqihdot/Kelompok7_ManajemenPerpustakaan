public class Main {

    public static void main(String[] args){
        genreBuku genre01 = new genreBuku("G001", "Fiksi");
        genreBuku genre02 = new genreBuku("G002", "Sains");

        Buku bk01 = new Buku("BK001", "Laskar Pelangi");
        Buku bk02 = new Buku("BK002", "Fisika Dasar");

        AdminPerpus admin01 = new AdminPerpus("Sari", "Jl. Perpus No.1", "sari@perpus.com", "AD001", "Kepala Perpustakaan");
        admin01.tampikanIdentitas();
        System.out.println();

        // Admin menambahkan buku ke katalog sekaligus assign genre
        admin01.tambahBukuBaru(bk01, genre01);
        admin01.tambahBukuBaru(bk02, genre02);
        admin01.tampilkanBukuDikelola();
        System.out.println();

        Mahasiswa mhs01 = new Mahasiswa("Andi", "Jl. Merdeka No.1", "andi@mail.com",
                                         "MB001", "2024-01-10",
                                         "J04001", "Teknologi Rekayasa Perangkat Lunak", 5);
        mhs01.tampikanIdentitas();
        System.out.println();

        mhs01.tambahBuku(bk01);
        mhs01.tambahBuku(bk02);
        mhs01.tampilkanBuku();
        System.out.println();

        bk01.tampilkanPeminjam();
        System.out.println();

    }
}