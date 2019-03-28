package ProjetoPessoa;

public class Main {
    public static void main(String args[]){
        Pessoa p = new Pessoa();
        p.setNome("Joao");
        p.setCpf("04892304");

        System.out.println(p.getNome());
        System.out.println(p.getCpf());

    }
}
