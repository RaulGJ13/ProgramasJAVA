
package Metodos;
import Entrada.Tools;

public class FuncionesIterativas {
    
    public static void usoWhile(int n){
        int j=1;
        while(j<=n)
        {
            j++;
        }
    }
    
    public static void usoFor(int n){
        for(int j=1;j<=n;j++)
        {
        }
    }
    
    public static void usoDoWhile(int n){
        int j=1;
        do{
            j++;
        }while(j<=n);
    }
    
    public static void tablaMultiplicar(byte num){
        
        String tabla = "";
        
        for(int j=1; j<=10; j++)
        {
            tabla =num+"*"+j+"="+(num*j)+"\n";
        }
        System.out.print(tabla);
    }
    
    public static void imprimeArrayI(int a[]){
        
        String lista="";
        
        for(byte j=0;j<a.length;j++)
        {
            lista+=j+"["+a[j]+"]\n";
        }
        Tools.imprimePantalla(lista);
    }
}
