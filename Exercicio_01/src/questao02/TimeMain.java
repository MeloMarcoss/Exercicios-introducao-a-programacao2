package questao02;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeMain {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a data no formato dd/MM/yyyy: ");
        String data = leitor.next();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataLida = LocalDate.parse(data, formatador);
        LocalDate dataAtual = LocalDate.now();

        System.out.println("\nNúmero de dias entre " + dataAtual.format(formatador) + " e " + dataLida.format(formatador) + " eh: " + Math.abs(dataAtual.until(dataLida, ChronoUnit.DAYS)));

        System.out.println(dataLida.format(formatador) + " + 110: " + dataLida.plusDays(110).format(formatador));

        System.out.println("Alterando mês para agosto: " + dataLida.withMonth(6).format(formatador));

        System.out.println("\nQuantidade de dias Úteis entre datas:\nInforme a primeira data no formato dd/MM/yyyy");
        String dtInicial = leitor.next();
        LocalDate dataInicial = LocalDate.parse(dtInicial, formatador);

        System.out.println("\nInforme a segunda data no formato dd/MM/yyyy");
        String dtFinal = leitor.next();
        LocalDate dataFinal = LocalDate.parse(dtFinal, formatador);
    }

    static int qtdDiasUteis(LocalDate dataInicial, LocalDate dataFinal) {
        int qtdDiasUteis = 0;
        long qtdDias = dataInicial.until(dataFinal, ChronoUnit.DAYS);
        for (int i = 1; i <= qtdDias; i++) {
            if (dataInicial.plusDays(i).getDayOfWeek().getValue() != 6 && dataInicial.plusDays(i).getDayOfWeek().getValue() != 7) {
                qtdDiasUteis++;
            }

        }
        return Math.abs(qtdDiasUteis + 1);

    }
}