package aula13;

public class Principal {
    public static void main(String[] args) {
        Controle ctr = new Controle();
        ControleSistema sis = new ControleSistema();

        Gerente g = new Gerente();
        g.setNome("Fulano");
        g.setSenha("123");
        ctr.inserirFuncionario(g);

        Secretaria s = new Secretaria();
        s.setNome("Secretaria teste");
        ctr.inserirFuncionario(s);

        Diretor d = new Diretor();
        d.setNome("Ciclano");
        d.setSenha("123");

        System.out.println(sis.login(g, "2222"));
        System.out.println(sis.login(d, "123"));

        Fornecedor forn = new Fornecedor();
        System.out.println(sis.login(forn, "senha2020"));

        //System.out.println(sis.login(s, "abc"));

        if (forn instanceof Acesso) {
            System.out.println("Fornecedor e Acesso");
        }

    }
}
