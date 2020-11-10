package aula14;

import java.util.ArrayList;

public class Teste {
        public static void main(String args[]) {
                ArrayList<Tarifado> lista = new ArrayList<>();

                ContaCorrente currentAc = new ContaCorrente();
                currentAc.setTitular("Elizabeth");
                lista.add(currentAc);

                SeguroDeVida lifeIns = new SeguroDeVida();
                lifeIns.setTitular("Beatrice");
                lifeIns.setValorSeguro(300);
                lista.add(lifeIns);

                ContaEspecial specialAc = new ContaEspecial();
                specialAc.setTitular("Erin");
                specialAc.setLimitValue(1500);
                lista.add(specialAc);

                for (int i = 0; i < lista.size(); i++) {
                        Tarifado aux = lista.get(i);
                        System.out.println("-----------------------");
                        if (aux instanceof ContaCorrente) {
                                System.out.println("CONTA CORRENTE");
                                System.out.println("Titular: " + ((ContaCorrente) aux).getTitular());
                                System.out.printf("Tarifa: $%.2f\n", aux.getTarifa());
                        } else if (aux instanceof SeguroDeVida) {
                                System.out.println("SEGURO DE VIDA");
                                System.out.println("Titular: " + ((SeguroDeVida) aux).getTitular());
                                System.out.printf("Tarifa: $%.2f\n", aux.getTarifa());
                        } else if (aux instanceof ContaEspecial) {
                                System.out.println("CONTA ESPECIAL");
                                System.out.println("Titular: " + ((ContaEspecial) aux).getTitular());
                                System.out.printf("Tarifa: $%.2f\n", aux.getTarifa());
                                System.out.printf("Valor limite: $%.2f\n", ((ContaEspecial) aux).getLimitValue());
                        }
                }
        }
}