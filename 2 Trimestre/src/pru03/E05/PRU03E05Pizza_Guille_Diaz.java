package pru03.E05;

public class PRU03E05Pizza_Guille_Diaz {
	//Creamos las variables demanades y servides.
	 static int totalDemanades = 0;
	 static int totalServides = 0;
	  //Creamos las variables para el tamaño, el tipo y el estado del pedido.
	  private String tamany;
	  private String tipus;
	  private String estat;
	  //Creamos el constructor
	  public PRU03E05Pizza_Guille_Diaz(String tipus, String tamany) {
	    this.tipus = tipus;
	    this.tamany = tamany;
	    this.estat = "demanada";
	    PRU03E05Pizza_Guille_Diaz.totalDemanades++;
	  }
	  //Creamos metodo para tipo, tamaño y estado.
	  public String toString() {
	    return "La Pizza es: " + this.tipus + " " + this.tamany + ", " + this.estat;
	  }
	  //Le pedimos que devuelva el total de pedidas.
	  public static int getTotalDemanades() {
	    return PRU03E05Pizza_Guille_Diaz.totalDemanades;
	  }
	  //Le pedimos que devuelva el total de servidas.
	  public static int getTotalServides() {
	    return PRU03E05Pizza_Guille_Diaz.totalServides;
	  }
	  //Creamos el metodo para indicar que la pizza ya fue servida.
	  public void serveix() {
	    if (this.estat.equals("Demanada")) {
	      this.estat = "Servida";
	      PRU03E05Pizza_Guille_Diaz.totalServides++;
	    } else {
	      System.out.println("Aquesta pizza ja s'ha servit.");
	    }
	  }
	}