package org.generation.classes;

public class Employee {
	//propiedades
	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vacationDaysTaken;
	double salary;
	int yearsWorked;
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDaysWorked() {
		return daysWorked;
	}
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}
	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYearsWorked() {
		return yearsWorked;
	}
	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
		//constructor
		public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}
	
		public int timeToRetirement(){
	      // time to retirement = min(60 - age, 40 - yearsWorked)
			int retirement = Math.min(60 - age, 40 - yearsWorked);
			return  retirement;
	   }//Metodo para calcular el tiempo de jubilacion del empleado

		public int vacationTimeLeft(){
	       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
			int vacation =(daysWorked/360)*(30-vacationDaysTaken);
			return vacation;
	   }//Metodo para calcular las vacaciones restantes del empleado

		public int calculateBonus(){
	       // bonus = 2.2*salary
			int bonus = (int) (2.2*salary);
			return bonus;
	   }//Metodo para calcular el bonus del empleado
	
	//toString
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}
	
	
	
	
	
	
	
}//class
