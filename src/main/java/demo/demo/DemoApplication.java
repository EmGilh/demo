package demo.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Clients c = new Clients();
		Employees e = new Employees();

		e.setName("Emmanuel");
		c.setName("Samsung");

		String employeeName = e.getName();
		String clientName = c.getName();

	System.out.println("El empleado " + employeeName + " atiende al cliente " + clientName);


//		People p = new People();
//		p.setName("");
//
//		System.out.println("Ingrese el nombre:");
//		Scanner PersonName = new Scanner(System.in);
//		System.out.println("El nombre es: " + PersonName);
	}
}

