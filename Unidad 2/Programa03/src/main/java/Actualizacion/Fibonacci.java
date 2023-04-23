package Actualizacion;
import EntradaSalida.Tools;
public class Fibonacci {
    
    //Iterativo
    public static void fibonacci(int n){
    	int a = 0;
        int b = 1;
        String res="";
        for (int i = 0; i<n; i++) 
        {
            res=res+","+a;
            int aux = a;
            a = b;
            b = aux + b;
        }
        Tools.imprimePantalla(res);
    }
    
    //Recursivo
    public static String recFibo(int n, String res, int aux, int a, int b){
    	if(n>0) 
        {
            return recFibo(n-1, res=res+","+a, aux=a, a=b, b=aux+b);
    	}
        else 
        {
            return res;
    	}
    }
}
