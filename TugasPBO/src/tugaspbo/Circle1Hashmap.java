
package tugaspbo;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Circle1Hashmap {
    public static void main(String[] args){
        HashMap<String, SocialMedia> satusatu = new HashMap<>();
        satusatu.put("Circle 0", new SocialMedia("Ditha Ameilia", "Wanita", "8 Mei"));
        satusatu.put("Circle 1", new SocialMedia("Kim Seok Jin", "Laki-Laki", "4 Desember"));
        satusatu.put("Circle 2", new SocialMedia("Fatmawati","Wanita","25 November"));
        satusatu.put("Circle 3", new SocialMedia("Kim Namjoon", "Laki-Laki", "12 September"));
        
        for(SocialMedia h : satusatu.values()){
            System.out.println(h.getNama());
            System.out.println(h.getJenisKel());
            System.out.println(h.getTtl());
            System.out.println("--------------");
        }
    }
}
