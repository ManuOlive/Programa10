import java.util.Scanner;

public class CalendarioResta {
    private Integer dia;
    private Integer mes;
    private Integer anio;
    private Integer resta;

    public void setDia(Integer d) {
        dia = d;
    }

    public Integer getDia() {
        return dia;
    }

    public void setMes(Integer m) {
        mes = m;
        if (m == 1) {
            System.out.println("(Enero)");
        } else if (m == 2) {
            System.out.println("(Febrero)");
        } else if (m == 3) {
            System.out.println("(Marzo)");
        } else if (m == 4) {
            System.out.println("(Abril)");
        } else if (m == 5) {
            System.out.println("(Mayo)");
        } else if (m == 6) {
            System.out.println("(Junio)");
        } else if (m == 7) {
            System.out.println("(Julio)");
        } else if (m == 8) {
            System.out.println("(Agosto)");
        } else if (m == 9) {
            System.out.println("(Septiembre)");
        } else if (m == 10) {
            System.out.println("(Octubre)");
        } else if (m == 11) {
            System.out.println("(Noviembre)");
        } else if (m == 12) {
            System.out.println("(Diciembre)");
        }
    }

    public Integer getMes() {
        return mes;
    }

    public void setAnio(Integer a) {
        anio = a;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setSuma(Integer z) {
        resta = z;
    }

    public Integer getSuma() {
        return resta;
    }

    public Integer Operacion() {
        Integer resul = dia - resta;
        return resul;
    }
    public Integer restaMes() {//Valor del mes
        Integer resul2 = mes - 1;
        return resul2;
    }

    public Integer recorridoDia() {//Valor de los dias
        Integer res = dia - resta;
        Integer inv = Math.abs(res);
        Integer reco = 30 - inv;  
        return reco;
    }

    public Integer recorridoDia2() {//Valor de los dias (31 dias)
        Integer res = dia - resta;
        Integer inv = Math.abs(res);
        Integer reco = 31 - inv;  
        return reco;
    }
    public Integer recoBi() {//Febrero bisiesto
        Integer res = dia - resta;
        Integer inv = Math.abs(res);
        Integer reco = 29 - inv;  
        return reco;
    }    
    public Integer recoFeb() {//Febrero no bisiesto
        Integer res = dia - resta;
        Integer inv = Math.abs(res);
        Integer reco = 28 - inv;  
        return reco;
    }
    public Integer restaAnio() {//Resta año
        Integer res = anio - 1;
        return res;
    }
    public Integer reinicioMes() {
        Integer rei = 12;
        return rei;
    }
    public static void main(String[] args) {
        CalendarioResta x = new CalendarioResta();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el dia: ");
        x.setDia(entrada.nextInt());
        System.out.println("Ingresa el mes: ");
        x.setMes(entrada.nextInt());
        System.out.println("Ingresa el año: ");
        x.setAnio(entrada.nextInt());
        System.out.println("La fecha es: " + x.getDia() + "/" + x.getMes() + "/" + x.getAnio());
        System.out.println("¿Cuantos dias se van a restar? ");
        x.setSuma(entrada.nextInt());
        if (x.Operacion() <= 0) {
            while (x.getMes() == 4 || x.getMes() == 6 || x.getMes() == 9 || x.getMes() == 11) {
                System.out.println("El fecha es: " + x.recorridoDia() + "/" + x.restaMes() + "/" + x.getAnio());
                break;    
            }
            while (x.getMes() == 12 || x.getMes() == 3 || x.getMes() == 5 || x.getMes() == 7 || x.getMes() == 8 || x.getMes() == 10) {
                System.out.println("El fecha es: " + x.recorridoDia2() + "/" + x.restaMes() + "/" + x.getAnio());
                break;    
            }
            while (x.getMes()==2){
                if(x.getAnio()%4 == 0){
                    System.out.println("La fecha es: "+ x.recoBi() + "/" + x.restaMes() + "/" + x.getAnio());
                }
                else{
                    System.out.println("La fecha es: "+ x.recoFeb() + "/" + x.restaMes() + "/" + x.getAnio());
                }
                break;
            }
            while (x.getMes()==1){
                System.out.println("El fecha es: " + x.recorridoDia2() + "/" + x.reinicioMes() + "/" + x.restaAnio());
                break;
            }
        } else {
            System.out.println("La fecha es: " + x.Operacion() + "/" + x.getMes() + "/" + x.getAnio());
        }
    }
}
