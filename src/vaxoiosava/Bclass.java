package vaxoiosava;

import java.util.Scanner;

class Bclass extends Aclass {
    private static final String printed ="Hello" ;
    int y;
    public Bclass() {
        super(printed);
    }
    public void first3(){
        Scanner input = new Scanner(System.in);
        System.out.println("print y: ");
        y = input.nextInt();
    }
    public void second3(){
        System.out.println("x+y = "+ (x+y));
    }
}

