package questao01;

public class Estoque {

    private Produto produto;
    private int qtdAtual;
    private int qtdMinima;

    //construtor vazio
    Estoque() {
        produto = null;
        qtdAtual = 0;
        qtdMinima = 0;
    }
    //construtor com parametros
    Estoque(Produto produto, int qtdAtual, int qtdMinima) {
        this.produto = produto;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
    //mudarQtdMinima(qtdMinima)
    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    //reporEstoqueAtual(qtd)
    public void reporEstoque(int qtd) {
        qtdAtual += qtd;
    }
    //darBaixa no estoque
    public void darBaixa(int qtd) {
        if (qtdAtual - qtd < qtdMinima) {
            System.out.println("Não é possível dar baixa!");
        }
        else {
            qtdAtual -= qtd;
        }
    }
    //relatorio(): imprime todos os valores necessários
    public void relatorio() {
        System.out.println("Nome: " + produto.pegarNome());
        System.out.println("Código: " + produto.pegarCodigo());
        System.out.println("Quantidade atual: " + qtdAtual);
        System.out.println("Quantidade minima: " + qtdMinima);
    }

}
