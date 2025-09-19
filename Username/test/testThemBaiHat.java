package Username.test;

import Username.src.BaiHat;
import Username.src.DsBaiHat;
import Username.src.LayDuLieu;
import Username.src.ThemBaiHat;

public class testThemBaiHat {
    public static void main(String[] args) {  
        DsBaiHat ds = new DsBaiHat();
        LayDuLieu lay = new LayDuLieu();
        BaiHat bh = lay.layBaiHat();
        System.out.println("So bai hat trong ds:"+ds.getSoLuongBaiHat());        
        System.out.println(ds.getDsBaiHat()[ds.getSoLuongBaiHat()-1].getTenBaiHat());
        ThemBaiHat them = new ThemBaiHat(ds);
        them.themBaiHat(bh);
        System.out.println("So bai hat trong ds:"+ds.getSoLuongBaiHat());
        System.out.println(ds.getDsBaiHat()[ds.getSoLuongBaiHat()-1].getTenBaiHat());
      
    }
}
