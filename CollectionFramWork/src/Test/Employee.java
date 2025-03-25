package Test;

import java.time.LocalDate;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

	private LocalDate birthday;

	public Employee(LocalDate birthday) {
		super();
		this.birthday = birthday;
	}

	public int getAge() {
		return Period.between(birthday, LocalDate.now()).getYears();
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee(LocalDate.of(1990, 1, 1));
		
		System.out.println(e.birthday);
		
	}

}
