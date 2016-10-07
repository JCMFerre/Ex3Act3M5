package ex3_act3_m5;

public class Utils {

    public boolean comprobarEntrada(String s) {
        try {
            int i = Integer.valueOf(s);
            if (i < 0) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public int calcularMatricula(String s) {
        int ufs = Integer.valueOf(s);
        if (ufs < 12) {
            return ufs * 30;
        } else if (ufs >= 1000) {
            return -6000;
        } else {
            return 380;
        }
    }

    public String textoAMostrar(String entrada) {
        if (comprobarEntrada(entrada)) {
            int valor = calcularMatricula(entrada);
            if (valor == -6000) {
                return "Més de 1000 UF's... Potser es masa no?";
            } else {
                int preu = Integer.valueOf(entrada);
                return "El valor de la matricula per " + ((preu == 1) ? preu + " UF" : preu + " UF's") + " és "
                        + valor + "€.";
            }
        } else {
            return "No has introduit un valor valid.";
        }
    }

}
