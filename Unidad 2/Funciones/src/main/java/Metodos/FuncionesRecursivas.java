package Metodos;

import Entrada.Tools;

public class FuncionesRecursivas {
    private static String lista="";
    public static String funcionRecursiva1 (int j,int n)
	{
	if (j<=n) 
	{
	   
	   return j+"\n"+funcionRecursiva1(j+1,n); 
	} 
        else return "";
	}
    
    public static String funcionIterativa2 (int j, int n){
        
        if(j<=n)
        {
            return "\n"+j+funcionIterativa2(j+1,n);
        }
        else return "";
    }
    
    public static String funcionIterativa3 (int j, int n){
        
        return(j<=n)? "\n"+j+funcionIterativa3(j+1,n):"";
    }
    
    //Diseñar un metodo de clase que reciba como parametro un valor entero e imprima la tabla de multiplicar
    
    public static String tablaMultiplicar(byte num, byte j){
        
        if(j<=10) 
        {
            tablaMultiplicar((byte) num,(byte)(j+1));
            return num+"*"+j+"="+(num*j)+"\n";
	}
        else 
        {
            return "";
	}
    }
    
    //Diseñar un método de clase que imprima los datos almacenados en un arreglo
    
    public static String imprimeArrayRec(int a[], byte j){
	if(j<a.length) 
        {
            imprimeArrayRec(a,(byte)(j+1));
            return lista+=j+"["+a[j]+"]\n";
	}
        else return "";
    }
}
