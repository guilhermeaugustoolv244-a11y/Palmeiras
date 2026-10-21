package palmeiras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author augusto
 */
public class TimeDoVerdao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Convocados> elenco = new ArrayList<>();

        // Cadastrando alguns jogadores do Palmeiras
        elenco.add(new Convocados("Cristiano Ronaldo", 41, "Atacante", 981, 1342));
        elenco.add(new Convocados("Estevao", 19, "Ponta Direita", 41, 139));
        elenco.add(new Convocados("Rafael Leao", 27, "Ponta Esquerda", 90, 322));
        elenco.add(new Convocados("Jhon Arias", 29, "Meia Ofensivo", 68, 480));
        elenco.add(new Convocados("Giay", 22, "Lateral Direita", 5, 197));
        elenco.add(new Convocados("Cebolinha", 30, "Lateral Esquerda", 110, 597));
        elenco.add(new Convocados("van Dijk", 35, "Zangueiro",70, 698));
        elenco.add(new Convocados("Felipe Melo", 43, "Zangueiro",73, 882));
        elenco.add(new Convocados("Alisson", 34, "Goleiro",1, 500));
        
        
        System.out.println("=== ELENCO DO VERDÃO ===");
       for (Convocados j : elenco) {
            System.out.println("Nome: " + j.getNome() + 
                " | Idade: " + j.getIdade() + 
                " | Posição: " + j.getPosicao() +
                " | Gols: " + j.getQtdGols() + 
                " | Partidas: " + j.getQtdDeJogosAtuandoEmCampo());
         
            System.out.println("----------------------------------------");
            System.out.println();
       
        }
        
        System.out.println("========================");
    }
}
    

