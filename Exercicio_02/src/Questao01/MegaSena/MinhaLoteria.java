package Questao01.MegaSena;

import java.util.ArrayList;

public class MinhaLoteria {

    public static void main(String[] args) {

        //instância do bilhete premiado
        BilheteLoteria bilhetePremiado = new BilheteLoteria(6);

        boolean ganhou = false;
        int quantQuadras = 0;
        int quantQuinas = 0;

        int i;
        for (i = 6; i <= 15; i++) {

            ganhou = false;
            quantQuadras = 0;
            quantQuinas = 0;

            int quantApostas = 0;

            while (!ganhou) {

                BilheteLoteria bilheteSorteado = new BilheteLoteria(i);

                if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 6) {
                    ganhou = true;
                } else if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 5) {
                    quantQuinas++;
                } else if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 4) {
                    quantQuadras++;
                }
                quantApostas++;

            }
            System.out.println("\nJogos de " + i + " números: você apostou " + quantApostas + " vezes" +
                    " para ganhar na mega-sena. Dentre esses jogos, você acertou " + quantQuadras +
                    " quadras e " + quantQuinas + " quinas.");

        }

    }
}
