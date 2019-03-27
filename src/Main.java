public class Main {
    public static void main(String[]args){
        Carro meuCarro = new Carro();

        meuCarro.Cor = "Azul";
        meuCarro.Ano = 2018;
        meuCarro.Chaci = 900087;
        meuCarro.n_Marcas = 5;
        meuCarro.Marca = "Fiat";
        meuCarro.Modelo ="Palio";
        meuCarro.N_portas = 4;
        meuCarro.Velocidade_maxima = 250;
        meuCarro.Volume_combustivel = 10;
        meuCarro.Velocidade_atual = 40;
        meuCarro.marcha_atual = 3;

        System.out.println(meuCarro.Velocidade_atual);
        meuCarro.acerela();
        System.out.println(meuCarro.Velocidade_atual);

        Proprietario proprietario = new Proprietario();

        proprietario.Nome = "Gabriel";
        proprietario.CEP = 66095015;
        proprietario.Bairro = "Marco";
        proprietario.Cidade = "Belem";
        proprietario.CPF = 02474767223;
        proprietario.Estado = "Pará";
        proprietario.Data_nascimento = "25/06/19990";
        proprietario.Rua = "Eneas pinheiro";

        System.out.println(proprietario.Nome);
        System.out.println(proprietario.Data_nascimento);
        System.out.println(proprietario.CPF);
        System.out.println(proprietario.Estado);
        System.out.println(proprietario.Cidade);
        System.out.println(proprietario.Bairro);
        System.out.println(proprietario.CEP);
        System.out.println(proprietario.Rua);
    }
}
