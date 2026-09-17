public class Mahasiswa extends Member {
    private String nim;
    private String programStudi;
    private int semester;
    private double ipk;

    public Mahasiswa(String nama, String alamat, String email, String idMember, String tanggalDaftar,
                      String nim, String programStudi, int semester, double ipk) {
        super(nama, alamat, email, idMember, tanggalDaftar);
        this.nim = nim;
        this.programStudi = programStudi;
        this.semester = semester;
        this.ipk = 0.0;
        setIPK(ipk);
    }

    public void setIPK(double ipk){
        if(ipk >= 0.0 && ipk <= 4.0){
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid, harus 0.0 - 4.0");
        }
    }

    public String getNim(){ 
        return nim; 
    }

    public String getProgramStudi(){ 
        return programStudi; 
    }

    public int getSemester(){ 
        return semester; 
    }

    public double getIpk(){ 
        return ipk; 
    }

    @Override
    public String getRole(){
        return "Mahasiswa";
    }

    @Override
    public void tampikanIdentitas() {
        super.tampikanIdentitas();
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("Semester: " + semester);
        System.out.println("IPK: " + ipk);
    }
}