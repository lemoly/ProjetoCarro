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
    }
}
