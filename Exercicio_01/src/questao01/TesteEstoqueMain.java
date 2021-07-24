package questao01;

public class TesteEstoqueMain {

    public static void main(String[] args) {

        //Instanciar os objetos:
        //dois produtos
        Produto produto01 = new Produto("1", "Teclado");
        Produto produto02 = new Produto("2", "Mouse");

        //dois estoques
        Estoque estoque1 = new Estoque(produto01, 20, 15);
        Estoque estoque2 = new Estoque(produto02, 30, 10);

        //dar baixa em 10 unidades de estoque1
        estoque1.darBaixa(10);
        //fazer a reposição de 19 unidades de estoque2;
        estoque2.reporEstoque(19);

        //Relatório dos estoque1 e estoque2
        estoque1.relatorio();
        estoque2.relatorio();

        //Mudar o nome do produto01 para "Teclado Virtual"
        produto01.mudarNome("Teclado Virtual");

        //Relatório de estoque1 para comprovar a mudança do nome "Teclado Virtual"
        estoque1.relatorio();

    }

}
