import java.util.ArrayList;
import java.util.List;

public class Buku {
    private String kode;
    private String judul;
    private genreBuku genre;
    private List<Member> daftarPeminjam;

    public Buku(String kode, String judul){
        this.kode = kode;
        this.judul = judul;
        this.daftarPeminjam = new ArrayList<>();
    }

    public void setGenre(genreBuku genre){
        this.genre = genre;
        genre.tambahBuku(this);
    }

    public void tambahPeminjam(Member mbr){
        if(!daftarPeminjam.contains(mbr)){
            daftarPeminjam.add(mbr);
            mbr.tambahBuku(this);
        }
    }

    public String getKode(){
        return kode;
    }

    public String getJudul(){
        return judul;
    }

    public genreBuku getGenre(){
        return genre;
    }

    public void tampilkanPeminjam(){
        System.out.println("Daftar Peminjam Buku "+judul+":");
        for(Member mbr: daftarPeminjam){
            System.out.println("- "+mbr.getNama()+" ("+mbr.getIdMember()+")");
        }
    }
}