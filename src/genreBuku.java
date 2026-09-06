import java.util.ArrayList;
import java.util.List;

public class genreBuku {
    private String kodeGenre;
    private String namaGenre;
    private List<Buku> daftarBuku;

    public genreBuku(String kodeGenre, String namaGenre){
        this.kodeGenre = kodeGenre;
        this.namaGenre = namaGenre;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku bk){
        if(!daftarBuku.contains(bk)){
            daftarBuku.add(bk);
            bk.setGenre(this);
        }
    }

    public String getKodeGenre(){
        return kodeGenre;
    }

    public String getNamaGenre(){
        return namaGenre;
    }

    public void tampilkanBuku(){
        System.out.println("Daftar Buku Genre "+namaGenre+":");
        for(Buku bk: daftarBuku){
            System.out.println("- "+bk.getKode()+" ("+bk.getJudul()+")");
        }
    }
}