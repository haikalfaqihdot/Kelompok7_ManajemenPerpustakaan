import java.util.ArrayList;
import java.util.List;

public class AdminPerpus extends Person {
    private String idAdmin;
    private String jabatan;
    private List<Buku> daftarBukuDikelola;

    public AdminPerpus(String nama, String alamat, String email, String idAdmin, String jabatan) {
        super(nama, alamat, email);
        this.idAdmin = idAdmin;
        this.jabatan = jabatan;
        this.daftarBukuDikelola = new ArrayList<>();
    }

    public void tambahBukuBaru(Buku bk, genreBuku genre){
        bk.setGenre(genre);
        daftarBukuDikelola.add(bk);
        System.out.println(getNama() + " menambahkan buku baru: " + bk.getJudul());
    }

    public void hapusBukuDariKatalog(Buku bk){
        if(daftarBukuDikelola.remove(bk)){
            System.out.println(getNama() + " menghapus buku: " + bk.getJudul());
        } else {
            System.out.println("Buku tidak ditemukan di katalog yang dikelola " + getNama());
        }
    }

    public String getIdAdmin(){ return idAdmin; }
    public String getJabatan(){ return jabatan; }

    public void tampilkanBukuDikelola(){
        System.out.println("Buku yang dikelola " + getNama() + ":");
        for(Buku bk: daftarBukuDikelola){
            System.out.println("- " + bk.getKode() + " (" + bk.getJudul() + ")");
        }
    }

    @Override
    public void tampikanIdentitas() {
        super.tampikanIdentitas();
        System.out.println("Role: Admin Perpustakaan");
        System.out.println("ID Admin: " + idAdmin);
        System.out.println("Jabatan: " + jabatan);
    }
}