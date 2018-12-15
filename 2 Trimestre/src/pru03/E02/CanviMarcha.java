package pru03.E02;

public class CanviMarcha extends PRU0302Cotxe_Guille_Diaz implements InterfaceCotxe {
	
	MarxaAutomatic marxa=MarxaAutomatic.N;
	MarxaManual marxam=MarxaManual.primera;
	
	public CanviMarcha(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
		this.marca=marca;
		this.model=model;
		this.tipuscanvi=tipuscanvi;
	}
	
	public enum MarxaAutomatic {
		F,N,R;
	}
	public MarxaAutomatic CanviarMarxaAutomatic(int cambiomarxa) throws Exception {
		
		if (motor.equals(EstatsMotorCotxe.EnMarxa)) {
			if (marxa.equals(MarxaAutomatic.N)) {
				if (cambiomarxa==1) {
					marxa=MarxaAutomatic.F;
				}
				else if (cambiomarxa==-1) {
					marxa=MarxaAutomatic.R;
				}
			}
			
			else if (marxa.equals(MarxaAutomatic.F)) {
				if (cambiomarxa==0) {
					marxa=MarxaAutomatic.N;
				}
			}
			
			else if (marxa.equals(MarxaAutomatic.R)) {
				if (cambiomarxa==0) {
					marxa=MarxaAutomatic.N;
				}
			}
			}
		
		else {
			throw new Exception ("No puedes cambiar de marcha si tienes el vehiculo apagado.");
		}
		return marxa;
	}
	
	public enum MarxaManual {
		primera,segona,tercera,quarta,cinquena,sisena, R;
	}
	
	public MarxaManual CanviarMarxaManual(int cambiomarxa) throws Exception {
		
	
		if (motor.equals(EstatsMotorCotxe.EnMarxa)) {
			if (marxam.equals(MarxaManual.primera)) {
				if (cambiomarxa==2) {
					marxam=MarxaManual.segona;
					}
				else if (cambiomarxa==-1) {
					marxam=MarxaManual.R;
					}
				}
			else if (marxam.equals(MarxaManual.segona)) {
				if (cambiomarxa==3) {
					marxam=MarxaManual.tercera;
					}
				else if (cambiomarxa==1) {
					marxam=MarxaManual.primera;
					}
				}
			else if (marxam.equals(MarxaManual.tercera)) {
				if (cambiomarxa==4) {
					marxam=MarxaManual.quarta;
					}
				else if (cambiomarxa==2) {
					marxam=MarxaManual.segona;
					}
				}
			else if (marxam.equals(MarxaManual.quarta)) {
				if (cambiomarxa==5) {
					marxam=MarxaManual.cinquena;
					}
				else if (cambiomarxa==3) {
					marxam=MarxaManual.tercera;
					}
				}
			else if (marxam.equals(MarxaManual.cinquena)) {
				if (cambiomarxa==6) {
					marxam=MarxaManual.sisena;
					}
				else if (cambiomarxa==4) {
					marxam=MarxaManual.quarta;
					}
				}
			else if (marxam.equals(MarxaManual.R)) {
				if (cambiomarxa==1) {
					marxam=MarxaManual.primera;
					}
				}
			else {
				throw new Exception ("No puedes cambiar de marcha si tienes el vehiculo apagado.");
			}
			return marxam;
		
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
