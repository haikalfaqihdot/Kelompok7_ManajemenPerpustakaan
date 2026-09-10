public class Person {
    private String nama;
    private String alamat;
    private String email;

    public Person(String nama, String alamat, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }

    public String getNama() { 
        return nama; 
    }

    public String getAlamat() { 
        return alamat; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setNama(String nama) {
        if(nama != null && !nama.trim().isEmpty()){
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong");
        }
    }

    public void setAlamat(String alamat) {
        if(alamat != null && !alamat.trim().isEmpty()){
            this.alamat = alamat;
        } else {
            System.out.println("Alamat tidak boleh kosong");
        }
    }

    public void setEmail(String email) {
        if(email != null && !email.trim().isEmpty() && email.contains("@")){
            this.email = email;
        } else {
            System.out.println("Email tidak valid");
        }
    }

    public void tampikanIdentitas() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Email: " + email);
    }
}