package entendendo.motodos.java.aula1.horadia;

import java.time.LocalTime;

public class HoraDia {

    int hora;
    int minuto;

    private LocalTime manha = LocalTime.of( 12, 00);
    private LocalTime tarde = LocalTime.of( 19, 00);
    private LocalTime noite = LocalTime.of( 05, 30);
    private LocalTime horario;


    public HoraDia (int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        LocalTime horario = LocalTime.of(hora, minuto);
        this.horario = horario;
    }

    public void BomDia(){
        System.out.println("Bom dia! São " + hora + " horas e " + minuto +" minutos.");
    }

    public void BoaTarde(){
        System.out.println("Boa Tarde! São " + hora + " horas e " + minuto +" minutos.");
    }

    public void BoaNoite(){
        System.out.println("Boa noite! São " + hora + " horas e " + minuto +" minutos.");
    }

    public void horaAtual() {
        if (horario.isAfter(noite) && horario.isBefore(manha) || horario.equals(manha)) {
            BomDia();
        } else if (horario.isAfter(manha) && horario.isBefore(tarde) || horario.equals(tarde)) {
            BoaTarde();
        } else {
            BoaNoite();
        }
    }
    public static void main(String[] args) {

        HoraDia agora = new HoraDia(12, 00);
        agora.horaAtual();


    }

}
