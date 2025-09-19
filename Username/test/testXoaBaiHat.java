package Username.test;

import Username.src.DsBaiHat;
import Username.src.XoaBaiHat;

public class testXoaBaiHat {
    public static void main(String[] args) {  
        DsBaiHat ds = new DsBaiHat();
        System.out.println("So bai hat trong ds:"+ds.getSoLuongBaiHat()); 
    
        XoaBaiHat xoa = new XoaBaiHat(ds);
        xoa.xoaBaiHatTheoId(2);
        System.out.println("So bai hat trong ds:"+ds.getSoLuongBaiHat()); 
        xoa.xoaBaiHatTheoTen("buong doi tay nhau ra");
        
        
    }
}

