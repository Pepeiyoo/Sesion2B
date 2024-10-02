package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Empleado.*;
import Empleado.Empleado.TipoEmpleado;

class EmpleadoTest {
	private Empleado emple = new Empleado();
	private float horas, ventas, salario; //Mess
	private TipoEmpleado tipoE;
	private float valor;
	private float salarioBruto;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBruta() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaNeta() {
		fail("Not yet implemented");
	}
	//PRUEBAS DE ENCARGADO Y VENDEDOR EN POSITIVO DE NOMINA BRUTA
	
	void testCalculoNominaBrutaEncargadoNormal() {
		tipoE = TipoEmpleado.Encargado;
		valor = 2500;
		horas=0;
		ventas=0;
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	void testCalculoNominaBrutaVendedorNormal() {
		tipoE = TipoEmpleado.Vendedor;
		valor = 2000;
		horas=0;
		ventas=0;
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	//Vendedor
	void testCalculoNominaBrutaVendedorVentas1000() {
		tipoE = TipoEmpleado.Vendedor;
		horas=1; //30 por cada hora extra
		ventas=1000; // serian 100 mas por cada 1000 euros en ventas
		valor = 2130; //Salario seria 
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	void testCalculoNominaBrutaVendedorVentas1650() {
		tipoE = TipoEmpleado.Vendedor;
		horas=3; //30 por cada hora extra
		ventas=1650; // serian 200 mas por cada 1500 euros en ventas
		valor = 2290; //Salario seria 
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	void testCalculoNominaBrutaVendedorVentas300() {
		tipoE = TipoEmpleado.Vendedor;
		horas=5; //30 por cada hora extra
		ventas=300;
		valor = 2150; //Salario seria 
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	//Encargado
	void testCalculoNominaBrutaEncargadoVentas1000() {
		tipoE = TipoEmpleado.Vendedor;
		horas=1; //30 por cada hora extra
		ventas=1000; // serian 100 mas por cada 1000 euros en ventas
		valor = 2630; //Salario seria 
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	void testCalculoNominaBrutaEncargadoVentas1650() {
		tipoE = TipoEmpleado.Vendedor;
		horas=3; //30 por cada hora extra
		ventas=1650; // serian 200 mas por cada 1500 euros en ventas
		valor = 2790; //Salario seria 
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	void testCalculoNominaBrutaEncargadoVentas300() {
		tipoE = TipoEmpleado.Vendedor;
		horas=5; //30 por cada hora extra
		ventas=300;
		valor = 2650; //Salario seria 
		assertEquals(valor,emple.CalculoNominaBruta(tipoE, ventas, horas) );
	}
	//NOMINA NETA
	void testCalculoNominaNeta2000() {
		salarioBruto = 2000;
		valor = 2000;
		assertEquals(valor, emple.CalculoNominaNeta(salarioBruto));
		
	}
	void testCalculoNominaNeta2300() {
		salarioBruto = 2300; //Al ser 2300 hay retencion 
		valor = 1955;// retencion 2300*(1-0,85)
		assertEquals(valor, emple.CalculoNominaNeta(salarioBruto));
		
	}
	void testCalculoNominaNeta2600() {
		salarioBruto = 2600; //Al ser 2300 hay retencion 
		valor = 2132;// retencion 2300*(1-0,82)
		assertEquals(valor, emple.CalculoNominaNeta(salarioBruto));
		
	}
}
