package assignment9;

public class bài8_48 {
    int id;
    String name;
    bài8_48(int id, String name) {
        id = id;
        name = name;
    }
    void display() {
        System.out.println(id + " " + name);}

    public static void main(String[] args) {
        bài8_48 s1 = new bài8_48(111,"Karan");
        bài8_48 s2 = new bài8_48(321,"Aryan");
        s1.display();
        s2.display();
    }
} 
