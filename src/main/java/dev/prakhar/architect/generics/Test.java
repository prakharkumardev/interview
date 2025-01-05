package dev.prakhar.architect.generics;

public class Test {
    public Test(){

    }
    public Test(String s){

    }
    public void play(){
        System.out.println("Play Test!");
    }
    public static void main(String[] args) {
        Test t = new C("DF");
        t.play();
    }
}

class B extends Test{

    public B(String s) {
    }
}

class C extends B{
    public C(String s){
        super(s);

    }
    public void play(String s){
        super.play();
        System.out.println("Play C!");
    }
}
