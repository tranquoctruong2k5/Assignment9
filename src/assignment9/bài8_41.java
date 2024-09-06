package assignment9;

public class bài8_41 {
    int id;
    String name;
    bài8_41(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);}

    public static void main(String[] args) {
        bài8_41 s1 = new bài8_41(111,"Karan");
        bài8_41 s2 = new bài8_41(222,"Aryan");
        s1.display();
        s2.display();
    }
} 

