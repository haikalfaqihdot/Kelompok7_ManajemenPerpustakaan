import java.util.ArrayList;
import java.util.List;

public class Member {
    private String idMember;
    private String nama;
    private List<Buku> daftarBuku;

    public Member(String idMember, String nama){
        this.idMember = idMember;
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku bk){
        if(!daftarBuku.contains(bk)){
            daftarBuku.add(bk);
            bk.tambahPeminjam(this);
        }
    }

    public String getNama(){
        return nama;
    }

    public String getIdMember(){
        return idMember;
    }

    public void tampilkanBuku(){
        System.out.println("Daftar Buku Dipinjam "+nama+":");
        for(Buku bk: daftarBuku){
            System.out.println("- "+bk.getKode()+" ("+bk.getJudul()+")");
        }
    }
}