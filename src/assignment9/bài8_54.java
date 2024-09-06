package assignment9;

public class bài8_54 {
    void m() {System.out.println("method is invoked");}
    void n() {this.m();}
    void p() {n();}

    public static void main(String args[]) {
        bài8_54 s1 = new bài8_54();
        s1.p();
    }
}
