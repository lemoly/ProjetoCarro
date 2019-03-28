package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
        Paciente p1 = new Paciente("Gabriel", 90876,"Rua xpto");

        //criação do medico

        Medico m1 = new Medico("Joao",233334,"Rua Oliveira");

        //criação do atendimento médico

        AtendimentoMedico at1 = new AtendimentoMedico("24/03/2019",90.00,p1, m1);


    }
}
