package TestPrueba;
import EntradaSalida.Tools;
import Actualizacion.Ejercicio;
public class TestDatos {
    
    public static void main(String[] args) {
		
	if(Ejercicio.numAmstrong(Tools.leerInt("Escribe un numero")))
	System.out.println("Es un numero amstrong");
	else System.out.println("No es un numero amstrong");
		
		
	if(Ejercicio.ValidarAmigos(Tools.leerInt("Escribe el primer numero"), Tools.leerInt("Escribe el segundo numero")))
	System.out.print("Son amigos");
	else System.out.print("No son amigos");
		
		
	Ejercicio.sumNum(Tools.leerInt("Inserta un numero"));

	}
}
