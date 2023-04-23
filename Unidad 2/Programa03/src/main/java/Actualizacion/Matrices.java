package Actualizacion;
import EntradaSalida.Tools;
public class Matrices {
    
    //Iterativo
	
    public static void leerMatris(int a[][]){
	int i,j;
	for(i=0; i<a.length; i++) 
        {
            for(j=0; j<a[0].length; j++) 
            {
		a[i][j]=Tools.leerInt("Inserte un numero");
            }
	}
	verMatris(a);
    }
	
    public static void verMatris(int a[][]){
	int i,j;
	String cad="";
	for(i=0; i<a.length; i++) 
        {
            for(j=0; j<a[0].length; j++) 
            {
		cad+="["+a[i][j]+"] ";
            }
		cad+="\n";
	}
	Tools.imprimePantalla(cad);
    }

    //Recursivo
	
    public static String leerMatrisR(int a[][], int i, int j){
	if(j<a[0].length) 
        {
            int n=Tools.leerInt("Imprime un numero");
            a[i][j]=n;
            return " ["+a[i][j]+"]={"+decimalOctalR(n)+"} "+leerMatrisR(a, i, j+1);
	}
            return "";
	}
	
    public static String leerMatrisRi(int a[][], int i, int j){
	String cad="";
	if(i<a.length) 
        {
            return cad+="\n"+leerMatrisR(a, i, 0)+leerMatrisRi(a, i+1, j);
	}
        else 
        {
            return "";
	}
    }
	
    //Llenar una matriz de 3*4 con valores enteros e imprimir el octal de cada uno de los elementos
	
    public static String decimalOctalR(int n){
	if(n!=0) 
        {
            return decimalOctalR(n/8)+n%8;
	}
        else 
        {
            return "";
	}
    }
}
