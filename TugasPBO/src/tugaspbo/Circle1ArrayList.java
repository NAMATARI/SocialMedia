
package tugaspbo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Circle1ArrayList {
    public static void main(String []args){
        ArrayList<SocialMedia> satu = new ArrayList<>();
        
        satu.add(new SocialMedia("Kim Seok Jin", "Laki-Laki", "4 Desember"));
        satu.add(new SocialMedia("Kim Namjoon", "Laki-Laki", "12 September"));
        satu.add(new SocialMedia("Fatmawati","Wanita","25 November"));
        satu.add(new SocialMedia("Ditha Ameilia", "Wanita", "8 Mei"));
        
        for (SocialMedia s:satu){
            System.out.println(s.getNama());
            System.out.println(s.getJenisKel());
            System.out.println(s.getTtl());
            System.out.println("---------------");
        }
        System.out.println("\n>>Sebelum sorting<<");
        satu.stream().forEach(SocialMedia -> System.out.println(SocialMedia.getNama()));
        System.out.println();
        Collections.sort(satu);
        System.out.println(">>Setelah sorting<<");
        satu.stream().forEach(SocialMedia -> System.out.println(SocialMedia.getNama()));
        
    }
}
