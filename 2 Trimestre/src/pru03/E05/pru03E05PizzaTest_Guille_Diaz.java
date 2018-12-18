package pru03.E05;

public class pru03E05PizzaTest_Guille_Diaz {
	
  public static void main(String[] args) {
	  
	PRU03E05Pizza_Guille_Diaz p1 = new PRU03E05Pizza_Guille_Diaz("margarita", "mitjana");
	PRU03E05Pizza_Guille_Diaz p2 = new PRU03E05Pizza_Guille_Diaz("funghi", "familiar");
    p2.serveix();
    PRU03E05Pizza_Guille_Diaz p3 = new PRU03E05Pizza_Guille_Diaz("quatre formatges", "mitjana");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.serveix();
    System.out.println("demanades: " + PRU03E05Pizza_Guille_Diaz.getTotalDemanades());
    System.out.println("servides: " + PRU03E05Pizza_Guille_Diaz.getTotalServides());
  }
}