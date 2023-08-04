package br.com.insper.DuduMusic.catalogo;

public class Musicas extends Audio {

    private String album;
    private String estiloMusical;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    @Override
    public String toString() {
        return
                "*********************************************************" + "\n" +
                "Musica: " + this.getTitulo() + "\n" +
                "Artista: " + this.getAutor() + "\n" +
                "Álbum: " + this.getAlbum() + "\n" +
                "Estilo musical: " + this.getEstiloMusical() + "\n" +
                "Tempo da música: " + this.getTempoDeDuracaoEmMinutos() + "min" + "\n" +
                "Feedback: " + this.getTotalDeCurtidas();
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 500000) {
            return 10;
        } else if (this.getTotalDeCurtidas() > 100000) {
            return 8;
        } else {
            return 5;
        }
    }
}
