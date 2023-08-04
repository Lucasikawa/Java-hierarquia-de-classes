package br.com.insper.DuduMusic.catalogo;

public class Audio {
    private String titulo;
    private String autor;
    private double tempoDeDuracaoEmMinutos;
    private int anoDeLancamento;
    private int totalDeCurtidas;
    private int classificacao;
    private int totalDeReproducoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getTempoDeDuracaoEmMinutos() {
        return tempoDeDuracaoEmMinutos;
    }

    public void setTempoDeDuracaoEmMinutos(double tempoDeDuracaoEmMinutos) {
        this.tempoDeDuracaoEmMinutos = tempoDeDuracaoEmMinutos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalDeCurtidas++;
    }
    public void reproduz() {
        this.totalDeReproducoes++;
    }
}
