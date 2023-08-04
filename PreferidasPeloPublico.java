package br.com.insper.DuduMusic.catalogo;

public class PreferidasPeloPublico {

    public static void inclui(Audio setTitulo) {
        if(setTitulo.getClassificacao() > 9) {
            System.out.println(setTitulo +" esse titulo é considerado fenômeno!");
        } else if (setTitulo.getClassificacao() > 7) {
            System.out.println(setTitulo + " esse titúlo é uma ótima opção para escutar mais tarde!");
        } else {
            System.out.println(setTitulo + " esse titúlo é bem avaliado!");
        }
    }
}
