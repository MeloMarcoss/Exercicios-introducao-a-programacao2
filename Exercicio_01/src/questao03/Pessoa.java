package questao03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private LocalDate dataNascimento;
    private String nome;
    private String cpf;

    public Pessoa(LocalDate dataNascimento, String nome, String cpf) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return ((int) dataNascimento.until(dataAtual, ChronoUnit.YEARS));
    }

}
