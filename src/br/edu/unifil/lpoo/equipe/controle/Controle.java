package br.edu.unifil.lpoo.equipe.controle;

import br.edu.unifil.lpoo.equipe.modelo.Equipe;
import br.edu.unifil.lpoo.equipe.modelo.Jogador;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Jogador> listaJogadores;
    private ArrayList<Equipe> listaEquipes;

    public Controle(){
        listaJogadores = new ArrayList<>();
        listaEquipes = new ArrayList<>();
    }

    public void cadJogador(String nome, String posicao){
        Jogador auxJogador = new Jogador(nome, posicao);
        listaJogadores.add(auxJogador);
    }

    public void cadEquipe(String nomeEq){
        Equipe equipe = new Equipe(nomeEq);
        listaEquipes.add(equipe);
    }

    public void contratarJogador(String nomeEq, String nomeJog){
        Equipe auxEq;
        for(int i=0; i<listaEquipes.size();i++){
            auxEq = listaEquipes.get(i);
            if (auxEq.getNome().equals(nomeEq)){
                for(int j=0; j < listaJogadores.size(); j++){
                    Jogador auxJog = listaJogadores.get(j);
                    if(auxJog.getNome().equals(nomeJog)){
                        auxEq.addJogador(auxJog);
                        break;
                    }
                }
                break;
            }
        }
    }

    public void demitirJogador(String nomeEq, String nomeJog){
        Equipe auxEq;
        for (int i=0; i<listaEquipes.size(); i++){
            auxEq = listaEquipes.get(i);
            if (auxEq.getNome().equals(nomeEq)){
                Jogador auxJ;
                for (int x=0; x<listaJogadores.size(); x++){
                    auxJ = listaJogadores.get(x);
                    if (auxJ.getNome().equals(nomeJog)){
                        auxEq.removeJogador(auxJ);
                        break;
                    }
                }
                break;
            }
        }
    }

    public String listarJogEq(String nomeEq){
        String out = "";
        Equipe auxEq;
        for (int i=0; i<listaEquipes.size(); i++){
            auxEq = listaEquipes.get(i);
            if (auxEq.getNome().equals(nomeEq)){
                out = auxEq.listarJogadores();
                break;
            }
        }
        return out;
    }

    public String mostrarJogPos(String posicao){
        String out = "";
        Jogador jogAux;
        for (int i=0; i<listaJogadores.size(); i++){
            jogAux = listaJogadores.get(i);
            if (jogAux.getPosicao().equals(posicao)){
                out += jogAux.getNome() + '\n';
            }
        }
        return out;
    }

}
