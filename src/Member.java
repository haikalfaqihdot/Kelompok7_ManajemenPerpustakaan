import java.util.ArrayList;
import java.util.List;

public class Member extends Person implements Peminjam {
    private String idMember;
    private String tanggalDaftar;
    private List<Buku> daftarBuku;

    public Member(String nama, String alamat, String email, String idMember, String tanggalDaftar) {
        super(nama, alamat, email);
        this.idMember = idMember;
        this.tanggalDaftar = tanggalDaftar;
        this.daftarBuku = new ArrayList<>();
    }

    @Override
    public void pinjamBuku(Buku bk){
        if(!daftarBuku.contains(bk)){
            daftarBuku.add(bk);
            bk.tambahPeminjam(this);
        }
    }

    @Override
    public void tampilkanBukuDipinjam(){
        System.out.println("Daftar Buku Dipinjam " + getNama() + ":");
        for(Buku bk: daftarBuku){
            System.out.println("- " + bk.getKode() + " (" + bk.getJudul() + ")");
        }
    }

    public String getIdMember(){ 
        return idMember;
    }

    public String getTanggalDaftar(){ 
        return tanggalDaftar; 
    }

    @Override
    public String getRole(){
        return "Member";
    }

    @Override
    public void tampikanIdentitas() {
        super.tampikanIdentitas();
        System.out.println("ID Member: " + idMember);
        System.out.println("Tanggal Daftar: " + tanggalDaftar);
    }
}