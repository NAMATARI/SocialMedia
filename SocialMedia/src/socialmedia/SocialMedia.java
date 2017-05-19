
package socialmedia;

public class SocialMedia implements Comparable<SocialMedia>{
    public String nama, jenisKel,ttl;

    public SocialMedia (String nama, String jenisKel, String ttl){
        this.nama = nama;
        this.jenisKel = jenisKel;
        this.ttl = ttl;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenisKel() {
        return jenisKel;
    }
    public void setJenisKel(String jenisKel) {
        this.jenisKel = jenisKel;
    }
    public String getTtl() {
        return ttl;
    }
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
    public int compareTo(SocialMedia a){
        if(nama.compareTo(a.getNama())<0) return -1;
        if(nama.compareTo(a.getNama())==0) return 0;
        if(jenisKel.compareTo(a.getNama())<0) return -1;
        if(jenisKel.compareTo(a.getNama())==0) return 0;
        if(ttl.compareTo(a.getNama())<0) return -1;
        if(ttl.compareTo(a.getNama())==0) return 0;
        return 1;
    }
}
    
