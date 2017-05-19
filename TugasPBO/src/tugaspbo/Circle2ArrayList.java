
package tugaspbo;

import java.util.ArrayList;
import java.util.Collections;

public class Circle2ArrayList {
    public static void main(String []args){
        ArrayList<SocialMedia> dua = new ArrayList<>();
        
        dua.add(new SocialMedia("Puteri Agustini", "Wanita", "13 Agustus"));
        dua.add(new SocialMedia("Kim TaeHyung", "Laki-Laki", "30 Desember"));
        dua.add(new SocialMedia("Jeon JungKook", "Laki-Laki", "1 September"));
        dua.add(new SocialMedia("Fina Afifana","Wanita","9 April"));
        
        for (SocialMedia m:dua){
            System.out.println(m.getNama());
            System.out.println(m.getJenisKel());
            System.out.println(m.getTtl());
            System.out.println("---------------");
        }
        
        System.out.println();
         System.out.println(">>Sebelum sorting<<");
        dua.stream().forEach(SocialMedia -> System.out.println(SocialMedia.getNama()));
        
        System.out.println();
        
        Collections.sort(dua);
        System.out.println(">>Setelah sorting<<");
        dua.stream().forEach(SocialMedia -> System.out.println(SocialMedia.getNama()));
     
     }
}
