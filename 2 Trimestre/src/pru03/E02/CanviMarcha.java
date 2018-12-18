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
	
	public MarxaManual CanviarMarxaManual(int cambiomarxam) throws Exception {
		
	
		if (motor.equals(EstatsMotorCotxe.EnMarxa)) {
			if (marxam.equals(MarxaManual.primera)) {
				if (cambiomarxam==2) {
					marxam=MarxaManual.segona;
					}
				else if (cambiomarxam==-1) {
					marxam=MarxaManual.R;
					}
				}
			else if (marxam.equals(MarxaManual.segona)) {
				if (cambiomarxam==3) {
					marxam=MarxaManual.tercera;
					}
				else if (cambiomarxam==1) {
					marxam=MarxaManual.primera;
					}
				}
			else if (marxam.equals(MarxaManual.tercera)) {
				if (cambiomarxam==4) {
					marxam=MarxaManual.quarta;
					}
				else if (cambiomarxam==2) {
					marxam=MarxaManual.segona;
					}
				}
			else if (marxam.equals(MarxaManual.quarta)) {
				if (cambiomarxam==5) {
					marxam=MarxaManual.cinquena;
					}
				else if (cambiomarxam==3) {
					marxam=MarxaManual.tercera;
					}
				}
			else if (marxam.equals(MarxaManual.cinquena)) {
				if (cambiomarxam==6) {
					marxam=MarxaManual.sisena;
					}
				else if (cambiomarxam==4) {
					marxam=MarxaManual.quarta;
					}
				}
			else if (marxam.equals(MarxaManual.R)) {
				if (cambiomarxam==1) {
					marxam=MarxaManual.primera;
					}
				}
			}
			else {
				throw new Exception ("No puedes cambiar de marcha si tienes el vehiculo apagado.");
			}
			return marxam;
	}
}
