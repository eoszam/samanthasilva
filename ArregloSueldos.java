package examenT2;

public class ArregloSueldos {
	private double sueldo[];
    private int indice;

    public ArregloSueldos() {
        sueldo = new double[10];
        indice = 0;
    }

    public int tamaño() {
        return indice;
    }

    public double obtener(int p) {
        return sueldo[p];
    }

    public void adicionar(double s) {
        if (indice == tamaño())
            ampliarArreglo();
        sueldo[indice] = s;
        indice++;
    }

    private void ampliarArreglo() {
        double aux[] = sueldo;
        sueldo = new double[indice + 10];
        for (int i = 0; i < indice; i++)
            sueldo[i] = aux[i];
    }
    
    public void eliminarTodo() {
        indice = 0;
    }

    public void eliminarFinal() {
        indice--;
    }
    
    public int posicionPrimerSueldoMenorQue1000() {
    	for (int i = 0; i < indice; i++) {
            if (sueldo[i] > 1000 && sueldo[i] < 2500) {
                return i;
            }
        }
        return -1;
    }
    
    public double sueldoMayor() {
        if (indice == 0) {
            return 0;
        }

        double mayorSueldo = sueldo[0];
        for (int i = 1; i < indice; i++) {
            if (sueldo[i] > mayorSueldo) {
                mayorSueldo = sueldo[i];
            }
        }
        return mayorSueldo;
    }
    
    public boolean reemplazarPrimerSueldoMenorQue950() {
        if (indice == 0) {
            return false;
        }

        double sueldoMenor950 = -1;
        int posicionMenor950 = -1;

        //
        for (int i = 0; i < indice; i++) {
            if (sueldo[i] < 950) {
                sueldoMenor950 = sueldo[i];
                posicionMenor950 = i;
                break;
            }
        }

        
        if (posicionMenor950 == -1) {
            return false;
        }
        double sueldoMayor = sueldoMayor();

        sueldo[posicionMenor950] = sueldoMayor;

        return true;
    }

}
