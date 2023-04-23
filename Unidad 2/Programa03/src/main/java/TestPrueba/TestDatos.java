package TestPrueba;
import EntradaSalida.Tools;
import Actualizacion.BinarioDecimal;
import Actualizacion.DecimalOctal;
import Actualizacion.Fibonacci;
import Actualizacion.Potencia;
public class TestDatos {
    
    public static void main(String[] args){
		
	DecimalOctal.Octal();
	Potencia.potencia(5, 5);
	BinarioDecimal.BinarioDes("1010");
	Fibonacci.fibonacci(8);
		
	int oc= DecimalOctal.decimalToOctal(100);
	Tools.imprimePantalla(""+oc);
		
	Tools.imprimePantalla(""+Potencia.recPot(5, 5, 1));
		
	Tools.imprimePantalla(Fibonacci.recFibo(8, "", 0, 0, 1));
    }
}


