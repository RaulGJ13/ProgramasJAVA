package TestPrueba;
import Entrada.Tools;
import Metodos.FuncionesRecursivas;
import Metodos.FuncionesIterativas;
public class Test {
    
    public static void main(String[] args){
		
        //Diseñar un metodo de clase que reciba como parametro un valor entero e imprima la tabla de multiplicar
	
        FuncionesIterativas.tablaMultiplicar((byte) 5);
	Tools.imprimePantalla(FuncionesRecursivas.tablaMultiplicar((byte) 6, (byte)1));
		
        //Diseñar un metodo de clase que imprima los datos almacenados e un arreglo
		
        int a[]= {1,2,3,4,5};
	FuncionesIterativas.imprimeArrayI(a);
	Tools.imprimePantalla(FuncionesRecursivas.imprimeArrayRec(a, (byte) 0));
    }
}


