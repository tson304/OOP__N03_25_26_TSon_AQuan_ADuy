package Username.test;

import Username.src.BaiHat;
import Username.src.DsBaiHat;
import Username.src.ThemBaiHat;

public class testThemBaiHat {
    public static void main(String[] args) {  
        DsBaiHat ds = new DsBaiHat();
        BaiHat bh = new BaiHat(10,"abcd","abcd",500,"abc");
        System.out.println(ds.getSoLuongBaiHat()); 
        System.out.println(ds.getDsBaiHat()[ds.getSoLuongBaiHat()-1].getTenBaiHat());
        ThemBaiHat them = new ThemBaiHat(ds);
        them.themBaiHat(bh);
        System.out.println(ds.getSoLuongBaiHat()); 
        System.out.println(ds.getDsBaiHat()[ds.getSoLuongBaiHat()-1].getTenBaiHat());
        

        
    }
}
