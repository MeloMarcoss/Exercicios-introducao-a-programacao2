package questao01;

public class Produto {

    private String codigo;
    private String nome;

    //construtor vazio
    Produto() {
        codigo = "0";
        nome = "padrão";
    }

    //construtor com parametros
    Produto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    //getCodigo
    public String pegarCodigo() {
        return codigo;
    }
    //getNome
    public String pegarNome() {
        return nome;
    }

    //mudarNome(nome)
    public void mudarNome(String nome) {
        this.nome = nome;
    }
    

}
