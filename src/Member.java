import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private String idMember;
    private String tanggalDaftar;
    private List<Buku> daftarBuku;

    public Member(String nama, String alamat, String email, String idMember, String tanggalDaftar) {
        super(nama, alamat, email);
        this.idMember = idMember;
        this.tanggalDaftar = tanggalDaftar;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku bk){
        if(!daftarBuku.contains(bk)){
            daftarBuku.add(bk);
            bk.tambahPeminjam(this);
        }
    }

    public String getIdMember(){ 
        return idMember; 
    }

    public String getTanggalDaftar(){ 
        return tanggalDaftar; 
    }

    public void tampilkanBuku(){
        System.out.println("Daftar Buku Dipinjam " + getNama() + ":");
        for(Buku bk: daftarBuku){
            System.out.println("- " + bk.getKode() + " (" + bk.getJudul() + ")");
        }
    }

    public void tampikanIdentitas() {
        super.tampikanIdentitas();
        System.out.println("Role: Member");
        System.out.println("ID Member: " + idMember);
        System.out.println("Tanggal Daftar: " + tanggalDaftar);
    }
}