package ProjetoClinica;

import java.util.Date;

public class AtendimentoMedico {
    String dataconsulta;
    double valorconsulta;
    Paciente paciente;
    Medico medico;

    AtendimentoMedico(String dataconsulta, double valorconsulta, Paciente paciente, Medico medico){
        this.dataconsulta = dataconsulta;
        this.valorconsulta = valorconsulta;
        this.paciente = paciente;
        this.medico = medico;
    }

}
