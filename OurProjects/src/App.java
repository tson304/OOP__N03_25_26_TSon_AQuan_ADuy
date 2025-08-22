public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Son, Quan, Duy Anh xin chao ca lop!");

        Bia biaSon = new Bia();
        biaSon.tenbia = "Bia cua Son";
        Bia biaADuy = new Bia();
        biaADuy.tenbia = "Sai Gon";

        System.out.println("1." + biaADuy.getTen());
        System.out.println("2." + biaSon.getTen());
    }
}
