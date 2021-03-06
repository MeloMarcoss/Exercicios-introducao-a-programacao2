package Questao03.receitas;

import Questao03.Transacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Receita implements Transacao {

    protected LocalDateTime data;

    protected String descricao;

    @Override
    public LocalDateTime getData() {
        return data;
    }

    @Override
    public String getTipo() {
        return "RECEITA";
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public abstract double calcularTotal();

    @Override
    public String toString() {
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("kk:mm - dd/MM/yyyy");

        return "Receita{" +
                "data=" + data.format(ft) +
                ", descricao='" + descricao + '\'' +
                ", total=" + calcularTotal() +
                '}';
    }
}