//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nomeAutor ="J.R.R. Tolkien";
        autor.emailAutor = "jrrTolkien@gmail.com";
        autor.cpfAutor = "133-456-78-9";

        Livro livro = new Livro();

        livro.nome = "O Senhor dos Anéis";
        livro.descricao = "Uma historia de fantasia";
        livro.valor = 200.0;
        livro.isbn = "123-456-78-9";

        livro.autor = autor;
       livro.mostrarDetalhes();
       //------------------ outro livro        -----------             ---------
        Autor outroAutor = new Autor();
        outroAutor.nomeAutor ="J.R.R. Tolkien";
        outroAutor.emailAutor = "jrrTolkien@gmail.com";
        outroAutor.cpfAutor = "133-456-78-9";


        Livro outrolivro = new Livro();

        outrolivro.nome = "O pequeno principe";
        outrolivro.descricao = "Uma historia de fantasia 2";
        outrolivro.valor = 100.0;
        outrolivro.isbn = "123-456-78-9";

        outrolivro.autor = outroAutor;
        outrolivro.mostrarDetalhes();
    }
}