public class Mahasiswa extends Member {
    private String nim;
    private String programStudi;
    private int semester;

    public Mahasiswa(String nama, String alamat, String email, String idMember, String tanggalDaftar,
                      String nim, String programStudi, int semester) {
        super(nama, alamat, email, idMember, tanggalDaftar);
        this.nim = nim;
        this.programStudi = programStudi;
        this.semester = semester;
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

    public void tampikanIdentitas() {
        super.tampikanIdentitas();
        System.out.println("Role: Mahasiswa");
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("Semester: " + semester);
    }
}