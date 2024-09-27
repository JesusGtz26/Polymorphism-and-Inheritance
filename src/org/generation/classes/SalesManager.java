package org.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep{

	private HashMap <Integer, SalesRep> salesTeam  = new HashMap<>();
	
	
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
	}
	
	
	//Agregar Representante
	public void addSalesRep(SalesRep salesRep) {
	    salesTeam.put(salesRep.getRegistration(), salesRep);
	}
	
	//Eliminar representante
	public void removeSalesRep(int registration) {
	    salesTeam.remove(registration);
	}
	
	//Caclcular la comision total del equipo
	public int calculateComission() {
	    double totalSales = 0.0;
	    //suma las ventas de cada miembro del equipo
	    for (SalesRep rep : salesTeam.values()) {
	        totalSales += rep.getSalesMade();
	    }
	    return (int) (0.03 * totalSales); 
	}

}//class
