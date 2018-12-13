package pru03.E02;

public class CanviMarcha extends PRU0302Cotxe_Guille_Diaz implements InterfaceCotxe {
	
	public CanviMarcha(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
		this.marca=marca;
		this.model=model;
		this.tipuscanvi=tipuscanvi;
	}
	
	public enum MarxaAutomatic {
		F,N,R;
	}
	public void CanviarMarxaAutomatic() throws Exception {
		MarxaAutomatic marxa=MarxaAutomatic.N;
		if (motor.equals(EstatsMotorCotxe.EnMarxa)) {
			
			}
			
		}
		else (motor.equals(EstatsMotorCotxe.EnAturat()){
			throw new Exception ("No puedes cambiar de marcha si tienes el vehiculo apagado.");
		}
	}
	
	public enum MarxaManual {
		primera,segona,tercera,quarta,cinquena,sisena, R;
	}
	
	public void CanviarMarxaManual() {
		if (motor.equals(EstatsMotorCotxe.EnMarxa()) {
			
		}
		else (motor.equals(EstatsMotorCotxe.EnAturat()){
			throw new Exception ("No puedes cambiar de marcha si tienes el vehiculo apagado.");
		}
		
	}
	
	public String Canvi(String tipus) {
		if (tipus.equals(tipuscanvi.CanviManual()) {
			this.CanviarMarxaAutomatic();
		}
		else {
			this.CanviarMarxaManual();
		}
		return tipus;
		}

}
