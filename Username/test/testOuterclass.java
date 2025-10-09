package Username.test;

import Username.Interface.Ourterclass;
import Username.src.LayDuLieu;

public class testOuterclass {
    public static void main(String[] args) {
        Ourterclass outer = new Ourterclass();
        LayDuLieu laydulieu = new LayDuLieu();
        outer.var = laydulieu.laySoNguyen("Nhap gia tri var: ");  
        outer.outerMethod();
       
}}
