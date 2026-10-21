package palmeiras;

/**
 *
 * @author augusto
 */
public class Convocados {
    String nome;
    int idade;
    String posicao;
    int qtdGols;
    int qtdDeJogosAtuandoEmCampo;

    public Convocados(String nome, int idade, String posicao, int qtdGols, int qtdDeJogosAtuandoEmCampo) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.qtdGols = qtdGols;
        this.qtdDeJogosAtuandoEmCampo = qtdDeJogosAtuandoEmCampo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQtdGols() {
        return qtdGols;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols = qtdGols;
    }

    public int getQtdDeJogosAtuandoEmCampo() {
        return qtdDeJogosAtuandoEmCampo;
    }

    public void setQtdDeJogosAtuandoEmCampo(int qtdDeJogosAtuandoEmCampo) {
        this.qtdDeJogosAtuandoEmCampo = qtdDeJogosAtuandoEmCampo;
    }

  
    

   
    
    
}
