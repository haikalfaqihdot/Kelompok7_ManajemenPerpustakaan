public class Main {

    public static void main(String[] args){
        // Buat data Member
        Member mbr01 = new Member("MB001", "Andi");
        Member mbr02 = new Member("MB002", "Budi");
        Member mbr03 = new Member("MB003", "Citra");

        // Buat data Genre
        genreBuku genre01 = new genreBuku("G001", "Fiksi");
        genreBuku genre02 = new genreBuku("G002", "Sains");
        genreBuku genre03 = new genreBuku("G003", "Sejarah");

        // Buat data Buku dan atur genre-nya
        Buku bk01 = new Buku("BK001", "Laskar Pelangi");
        bk01.setGenre(genre01);

        Buku bk02 = new Buku("BK002", "Sejarah Nusantara");
        bk02.setGenre(genre03);

        Buku bk03 = new Buku("BK003", "Fisika Dasar");
        bk03.setGenre(genre02);

        // Relasi peminjaman buku oleh member (many-to-many)
        mbr01.tambahBuku(bk01);
        mbr01.tambahBuku(bk02);
        mbr01.tambahBuku(bk03);

        mbr01.tampilkanBuku();
        System.out.println();

        bk01.tampilkanPeminjam();
        System.out.println();

        bk01.tambahPeminjam(mbr02);
        bk01.tampilkanPeminjam();
        System.out.println();

        // Tampilkan buku berdasarkan genre
        genre01.tampilkanBuku();
    }
}