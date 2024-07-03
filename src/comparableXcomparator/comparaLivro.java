package comparableXcomparator;
public class comparaLivro {
    public static void main(String[] args) throws Exception {

        Livro l2 = new Livro("Vida de Inseto", "CARLOS", 2012);
        Livro l1 = new Livro("Vida de Inseto 2", "CARLOS", 2011);

        CompararAutor comparador = new CompararAutor();
        int resultado = comparador.compare(l1, l2);

        ComparaTitulo comparaTitulo = new ComparaTitulo();
        int resultadoTitulo = comparaTitulo.compare(l1, l2);

        if (resultado < 0) {
            System.out.println(l1.getAutor() + " vem antes de " + l2.getAutor());
        } else if (resultado > 0) {
            System.out.println(l2.getAutor() + " vem antes de " + l1.getAutor());
        } else {
            System.out.println(l1.getAutor() + " e " + l2.getAutor() + " são iguais");
        }
        if (resultadoTitulo < 0) {
            System.out.println(l1.getTitulo() + " vem antes de " + l2.getTitulo());
        } else if (resultadoTitulo > 0) {
            System.out.println(l2.getTitulo() + " vem antes de " + l1.getTitulo());
        } else {
            System.out.println(l1.getTitulo() + " e " + l2.getTitulo() + " são iguais");
        }
    }
}

