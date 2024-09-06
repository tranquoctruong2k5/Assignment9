package assignment9;

public class bài8_49 {

    int id;
    String name;

    bài8_49(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        bài8_49 s1 = new bài8_49(111, "Karan");
        bài8_49 s2 = new bài8_49(321, "Aryan");
        s1.display();
        s2.display();
    }
}
