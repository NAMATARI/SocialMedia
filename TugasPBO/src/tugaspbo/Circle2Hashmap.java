
package tugaspbo;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Circle2Hashmap {
    public static void main(String[] args){
        HashMap<String, SocialMedia> duadua = new HashMap<>();
        duadua.put("Circle 0", new SocialMedia("Puteri Agustini", "Wanita", "13 Agustus"));
        duadua.put("Circle 1", new SocialMedia("Kim TaeHyung", "Laki-Laki", "30 Desember"));
        duadua.put("Circle 2", new SocialMedia("Fina Afifana","Wanita","9 April"));
        duadua.put("Circle 3", new SocialMedia("Jeon JungKook", "Laki-Laki", "1 September"));
        for(SocialMedia h : duadua.values()){
            System.out.println(h.getNama());
            System.out.println(h.getJenisKel());
            System.out.println(h.getTtl());
            System.out.println("--------------");
        }
    }
}
