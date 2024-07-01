package arreglos;

import clases.Empleados;
import java.util.ArrayList;

public class ArregloEmpleados {
	private ArrayList<Empleados> emp;
	
	public ArregloEmpleados() {

	}
	
	public void adicionar(Empleados nuevoEmpleado) {
		emp.add(nuevoEmpleado);
	}
	
	public int tamaño() {
        return emp.size();
	}
	
	public Empleados obtener(int posicion) {
        return emp.get(posicion);
	}
}
