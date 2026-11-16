package main;

import utils.Input;

public class Main {
    public static void main(String[] args) {
        Series s1 = new Series("La casa de papel","Netflix");
        Series s2 = new Series("shadowhunters");

        System.out.println(s1.getNome());
        s1.setNota(Input.db("Informe sua nota: "));
        System.out.println(s2.getNome());
        s2.setNota(Input.db("Informe uma nota: "));

        System.out.println(s1.toString());
        System.out.println(s2.toString() );

        if (s1.setNota(Input.db("informe sua nota: "));{
            System.out.println("nota invalid! ");
        }

    }
}
