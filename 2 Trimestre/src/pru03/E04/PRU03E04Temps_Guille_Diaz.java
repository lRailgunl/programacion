package pru03.E04;

public class PRU03E04Temps_Guille_Diaz {
	
	int horas;
	int minutos;
	int segundos;
	
	//Creamos el constructor
	public PRU03E04Temps_Guille_Diaz(int horas, int minutos, int segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	//Creamos el metodo para las horas, minutos y segundos
	@Override
	public String toString() {
		return "La hora actual es: " + horas + "H " + minutos + "Min " + segundos + "S.";
	}


	//Creamos el metodo para sumar tiempo
	public void SumaTemps(int h, int m, int s) {
		//Indicamos los integer de las horas, minutos y el tiempo total.
		int horassuma = h*3600;
		int minssuma = m*60;
		int tiempototalsuma = horassuma+minssuma+s;
		//Indicamos las conversiones.
		int chora = horas*3600;
		int cmin = minutos*60;
		int tiempototal = cmin+chora+segundos;
		//Realizamos la suma.
		int segundostotales = tiempototalsuma+tiempototal;
		//Indicamos las operaciones.
		horas = segundostotales/3600;
		minutos =  (segundostotales % 3600)/60;
		segundos = segundostotales % 60;
	}
	
	//Creamos el metodo para restarle tiempo
	public void RestaTemps(int h, int m, int s) throws Exception {
		//Indicamos los integer de las horas, minutos y el tiempo total.
		int horassuma = h*3600;
		int minssuma = m*60;
		int tiempototalsuma = horassuma+minssuma+s;
		//Indicamos las conversiones.
		int chora = horas*3600;
		int cmin = minutos*60;
		int tiempototal = cmin+chora+segundos;
		//Realizamos la resta.
		int segundostotales = tiempototal-tiempototalsuma;
		//Indicamos la excepcion en caso de que no sea posible realizar la operacion.
		if (segundostotales<0) {
			throw new Exception ("No puedes restarle más tiempo al actual.");
			}
		//Indicamos las operaciones.
		horas = segundostotales/3600;
		minutos =  (segundostotales % 3600)/60;
		segundos = segundostotales % 60;
	}
}