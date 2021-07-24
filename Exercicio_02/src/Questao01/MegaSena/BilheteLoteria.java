package Questao01.MegaSena;

import java.util.Arrays;
import java.util.Random;

public class BilheteLoteria {

    private int[] jogo;

    public BilheteLoteria(int tamanho)
    {
        //Define o tamanho do vetor como parâmetro
        jogo = new int[tamanho];

        //Random em parâmetro
        Random r = new Random();

        //Ativa loop até o tamanho max do vetor
        int i = 0;
        do {
            //Escolhe um num entre 1 e 60
            int numeroSorteado = r.nextInt(60) + 1;

            boolean adicionar = true;

            //Verifica se o num ta no Array
            for(int numeroContido: jogo){
                if (numeroContido == numeroSorteado){
                    adicionar = false;
                    break;
                }
            }

            //Se adicionar ainda tiver true, adiciona o numero
            if(adicionar){
                jogo[i] = numeroSorteado;
                i++;
            }
        }while (i < jogo.length);
        //Ordena os numeros em ordem crescente
        Arrays.sort(jogo);
    }

    //Get and Set
    public int[] getVetorInteiros(){
        return jogo;
    }
    public void setVetorInteiros(int[] jogo){
        this.jogo = jogo;
    }
    @Override
    public String toString(){
        return Arrays.toString(jogo);
    }
    public int qtdNumerosContidos(BilheteLoteria outroBilhete){
        int i;
        int qtdNumerosContidos = 0;
        for(i = 0; i < this.jogo.length; i++){
            for(int numeroContido: outroBilhete.jogo){
                if (this.jogo[i] == numeroContido){
                    qtdNumerosContidos++;
                }
            }
        }
        return qtdNumerosContidos;
    }

}
