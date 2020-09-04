package br.edu.unifil.lpoo.equipe.modelo;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Equipe(String nome) {
        this.nome = nome;
        jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador player){
        jogadores.add(player);
    }

    public void removeJogador(Jogador player){
        jogadores.remove(player);
    }

    public String listarJogadores(){
        String out = "";
        Jogador auxJog;
        for (int i=0; i<jogadores.size(); i++){
            auxJog = jogadores.get(i);
            out = out + auxJog.getNome() + '\n';
        }
        return out;
    }

    public Jogador getJogador(String nome) {
        Jogador auxJog;
        for (int i = 0; i < jogadores.size(); i++) {
            auxJog = jogadores.get(i);
            if (nome.equals(auxJog.getNome())) {
                return auxJog;
            }
        }
        return null;
    }

}
