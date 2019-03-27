public class Carro {
    String Modelo;
    String Cor;
    int Ano;
    String Marca;
    int Chaci;
    String Proprietario;
    int Velocidade_maxima;
    int N_portas;
    int Velocidade_atual;
    String teto_solar;
    int n_Marcas;
    String Cambio;
    int Volume_combustivel;
    int marcha_atual;

    void acerela(){

        Velocidade_atual += 1;
    }
    void freia(){

        Velocidade_atual = 0;
    }
    void  trocarMarcha(int marcha){

        n_Marcas = marcha;
    }
    void reduzirMarcha(){
        n_Marcas -= 1;
    }
}
