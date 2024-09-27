package org.generation.classes;

public class SalesRep extends Employee{

	//propiedades
	double salesMade;

	//getters and setters
	public double getSalesMade() {
		return salesMade;
	}
	
	//Constructor
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade =salesMade;
		
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}
	
	public int calculateComission(){
	      int comission = (int) (0.1 * salesMade);
		return comission;
	}//Metodo para calcular las comisiones 

	@Override
	public String toString() {
		return "SalesRep [firstName=" + firstName + ", lastName=" + lastName
				+ ", registration=" + registration + ", age=" + age + ", daysWorked=" + daysWorked
				+ ", vacationDaysTaken=" + vacationDaysTaken + ", salary=" + salary + ", yearsWorked=" + yearsWorked
				+", salesMade=" + salesMade
				+ "]"; 
	}
	
	
	
	
}//class
