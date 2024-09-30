package Empleado;

public class Empleado {
	public enum TipoEmpleado{Vendedor, Encargado};
	float SalarioBase;
	float primas;
	float hextras;
	
	public float CalculoNominaBruta(TipoEmpleado tipo, float ventaMes, float horasExtra) {
	if(tipo == TipoEmpleado.Encargado) {
		SalarioBase = 2500;
	}else if(tipo == TipoEmpleado.Vendedor) {
		SalarioBase=2000;
	}
	//Determinaremos las primas 
	if(ventaMes >=1500) {
		primas = 200;
	}else if(ventaMes>=1000) {
		primas = 100;
	}else {
		primas = 0;
	}
	//Determinar horas extras
	hextras = horasExtra*30;
	return SalarioBase + primas +hextras;
	}
	public float CalculoNominaNeta(float nominaBruta) {
		float retencion = 0;
		if(nominaBruta>1500) {
			retencion = 0.18f;
				
		}else if (nominaBruta>2000) {
			retencion = 0.15f;
		}
		return nominaBruta*(1-retencion);
	}
}
