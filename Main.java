import br.com.insper.DuduMusic.catalogo.Musicas;
import br.com.insper.DuduMusic.catalogo.PodCast;
import br.com.insper.DuduMusic.catalogo.PreferidasPeloPublico;

public class Main {
    public static void main(String arg[]) {

        Musicas musica1 = new Musicas();
        musica1.setTitulo("92 Explorer");
        musica1.setAlbum("beerbongs & bentleys");
        musica1.setAutor("Post Malone");
        musica1.setAnoDeLancamento(2018);
        musica1.setEstiloMusical("Hip-hop");
        musica1.setTempoDeDuracaoEmMinutos(3.33);

        for (int i = 0; i < 10000000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 100000; i++) {
            musica1.curte();
        }

        Musicas musica2 = new Musicas();
        musica2.setTitulo("Get It Together");
        musica2.setAlbum("More Life");
        musica2.setAutor("Drake, Black Coffee, Jorja Smith");
        musica2.setAnoDeLancamento(2017);
        musica2.setEstiloMusical("Eletrônica");
        musica2.setTempoDeDuracaoEmMinutos(4.10);

        for (int i = 0; i < 5000000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50000; i++) {
            musica1.curte();
        }

        Musicas musica3 = new Musicas();
        musica3.setTitulo("Wake Up");
        musica3.setAlbum("ASTROWORD");
        musica3.setAutor("Travis Scott");
        musica3.setAnoDeLancamento(2018);
        musica3.setEstiloMusical("Hip-hop");
        musica3.setTempoDeDuracaoEmMinutos(3.51);

        for (int i = 0; i < 50000000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 150000; i++) {
            musica1.curte();
        }

        Musicas musica4 = new Musicas();
        musica4.setTitulo("Home");
        musica4.setAlbum("Home");
        musica4.setAutor("Adriatique");
        musica4.setAnoDeLancamento(2020);
        musica4.setEstiloMusical("Eletrônica");
        musica4.setTempoDeDuracaoEmMinutos(5.30);

        for (int i = 0; i < 2000000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50000; i++) {
            musica1.curte();
        }

        Musicas musica5 = new Musicas();
        musica5.setTitulo("Thunderstruck");
        musica5.setAlbum("The Razors Edge");
        musica5.setAutor("AC/DC");
        musica5.setAnoDeLancamento(1990);
        musica5.setEstiloMusical("Rock");
        musica5.setTempoDeDuracaoEmMinutos(4.52);

        for (int i = 0; i < 100000000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 200000; i++) {
            musica1.curte();
        }

        Musicas musica6 = new Musicas();
        musica6.setTitulo("Thunderstruck");
        musica6.setAlbum("The Razors Edge");
        musica6.setAutor("AC/DC");
        musica6.setAnoDeLancamento(1990);
        musica6.setEstiloMusical("Rock");
        musica6.setTempoDeDuracaoEmMinutos(4.52);

        for (int i = 0; i < 70000000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 800000; i++) {
            musica1.curte();
        }

        PodCast podcast1 = new PodCast();
        podcast1.setTitulo("Abilio Diniz");
        podcast1.setAutor("Flow Podcast");
        podcast1.setApresentador("Igor 3k e Monark");
        podcast1.setFalaSobre("Empreendedorismo");
        podcast1.setAnoDeLancamento(2021);
        podcast1.setTempoDeDuracaoEmMinutos(123);

        for (int i = 0; i < 50000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 700; i++) {
            musica1.curte();
        }

        PodCast podcast2 = new PodCast();
        podcast2.setTitulo("Renda fixa");
        podcast2.setAutor("Os Socios");
        podcast2.setApresentador("Bruno Perini");
        podcast2.setFalaSobre("Financias");
        podcast2.setAnoDeLancamento(2022);
        podcast2.setTempoDeDuracaoEmMinutos(60);

        for (int i = 0; i < 10000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 600; i++) {
            musica1.curte();
        }

        /*
        System.out.println("************************************************************");
        System.out.println(musica1.toString());

        System.out.println("************************************************************");
        System.out.println(musica2.toString());


        System.out.println("************************************************************");
        System.out.println(musica3.toString());


        System.out.println("************************************************************");
        System.out.println(musica4.toString());


        System.out.println("************************************************************");
        System.out.println(musica5.toString());


        System.out.println("************************************************************");
        System.out.println(musica6.toString());

        System.out.println("*************************************************************");
        System.out.println(podcast1.toString());

        System.out.println("*************************************************************");
        System.out.println(podcast2.toString());
        System.out.println("*************************************************************");
        */

        PreferidasPeloPublico preferidasPeloPublico = new PreferidasPeloPublico();
        PreferidasPeloPublico.inclui(musica1);
        PreferidasPeloPublico.inclui(musica2);
        PreferidasPeloPublico.inclui(musica3);
        PreferidasPeloPublico.inclui(musica4);
        PreferidasPeloPublico.inclui(musica5);
        PreferidasPeloPublico.inclui(musica6);
        PreferidasPeloPublico.inclui(podcast1);
        PreferidasPeloPublico.inclui(podcast2);





    }
}