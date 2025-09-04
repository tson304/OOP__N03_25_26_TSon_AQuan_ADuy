public class Book {
    public String Name;
    public int ID;
    public String varString1;
    public String varString2;
    public int varInt1;
    public int varInt2;

    Book(){}

    Book(String name, int id){
        Name = name;
    }
    Book(int id){
        ID = id;
    }
    Book(String name){
        Name = name;
    }

    public String layName(){
        return Name;
    }
}
