package br.com.insper.DuduMusic.catalogo;

public class PodCast extends Audio {

    private String apresentador;
    private String falaSobre;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getFalaSobre() {
        return falaSobre;
    }

    public void setFalaSobre(String falaSobre) {
        this.falaSobre = falaSobre;
    }

    @Override
    public String toString() {
        return "*********************************************************" + "\n" +
                "Titulo do PodCast: " + this.getTitulo() + "\n" +
                "Autor: " + this.getAutor() + "\n" +
                "Apresentador(es): " + this.getApresentador() + "\n" +
                "Sobre: " + this.getFalaSobre() + "\n" +
                "Ano de lançamento: " + this.getAnoDeLancamento() + "\n" +
                "Tempo de duração: " + this.getTempoDeDuracaoEmMinutos() + "\n" +
                "Feedback: " + this.getTotalDeCurtidas();
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 700) {
            return 10;
        } else {
            return 5;
        }
    }
}
