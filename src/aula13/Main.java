package aula13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controle ctrl = new Controle();
        ControleSistema ctrSis = new ControleSistema();

        int option = 0;
        int option1 = 0;
        int matricula;
        String password;

        while (option != 9) {
            System.out.println("[ 1 ] Incluir funcionário");
            System.out.println("[ 2 ] Login do funcionário");
            System.out.println("[ 3 ] Incluir do fornecedor");
            System.out.println("[ 4 ] Login de fornecedor");
            System.out.println("[ 9 ] Encerrar programa");
            System.out.print("Sua opção: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("[ 1 ] Gerente");
                    System.out.println("[ 2 ] Secretária");
                    System.out.println("[ 3 ] Diretor");
                    System.out.print("Sua opção: ");
                    option1 = input.nextInt();
                    input.nextLine();

                    switch (option1) {
                        case 1:
                            Gerente g = new Gerente();
                            System.out.print("Nome: ");
                            String name = input.nextLine();
                            g.setNome(name);
                            System.out.print("Crie uma senha: ");
                            password = input.nextLine();
                            g.setSenha(password);
                            ctrl.inserirFuncionario(g);
                            break;
                        case 2:
                            Secretaria s = new Secretaria();
                            System.out.print("Nome: ");
                            name = input.nextLine();
                            s.setNome(name);
                            ctrl.inserirFuncionario(s);
                            break;
                        case 3:
                            Diretor d = new Diretor();
                            System.out.print("Nome: ");
                            name = input.nextLine();
                            d.setNome(name);
                            System.out.print("Crie uma senha: ");
                            password = input.nextLine();
                            d.setSenha(password);
                            ctrl.inserirFuncionario(d);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Matricula do funcionário: ");
                    matricula = input.nextInt();
                    input.nextLine();
                    Funcionario f = ctrl.getFuncionario(matricula);
                    if (f == null) {
                        System.out.println("Este fucnionário não existe");
                    } else {
                        if (f instanceof Acesso) {
                            System.out.println("Bem-vindo, " + f.getNome() + "!");
                            System.out.print("Insira sua senha: ");
                            password = input.nextLine();
                            if (ctrSis.login((Acesso)f, password)) {
                                System.out.println("Acesso permitido.");
                            } else {
                                System.out.println("Senha incorreta.");
                            }
                        } else {
                            System.out.println("Acesso negado.");
                        }
                    }
                    break;
                case 3:
                    Fornecedor forn = new Fornecedor();
                    System.out.print("Nome: ");
                    String name = input.nextLine();
                    forn.setNome(name);
                    ctrl.inserirFornecedor(forn);
                    break;
                case 4:
                    System.out.print("Nome do fornecedor: ");
                    name = input.nextLine();
                    forn = ctrl.getFornecedor(name);

                    if (forn == null) {
                        System.out.println("O funcionário não existe.");
                    } else {
                        System.out.println("Bem-vindo, " + forn.getNome() + "!");
                        System.out.print("Insira sua senha: ");
                        password = input.nextLine();
                        if (ctrSis.login((Acesso)forn, password)) {
                            System.out.println("Acesso permitido.");
                        } else {
                            System.out.println("Senha incorreta");
                        }
                    }
                    break;
            }
        }
    }
}
