package main;

public class Series {

    private String nome;
    private String plataforma;
    private double nota;


    public Series(String plataforma, String nome) {
        this.plataforma = plataforma;
        this.nome = nome;
        this.nota = 0;
    }

    public Series(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma Indefinida";
        this.nota = 0;
    }

    public double getNota() {
        return nota;
    }

    public boolean setNota(double nota) {
        if (nota < 0 || nota > 10){
            return false;
        }
           this.nota= nota;
        return false;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota +
                '}';
    }
}



