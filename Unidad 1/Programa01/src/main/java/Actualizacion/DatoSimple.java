
package Actualizacion;
import EntradaSalida.Tools;

public class DatoSimple {
    
    private Object datos[];
    private byte p;
 
    public DatoSimple(byte tam){
        datos=new Object[tam];
	p=-1;
    }
    
    public boolean validaVacio(){
	return (p==-1); 
    }
 
    public void almacenarDato(){
	if(p<datos.length)
	{
            datos[p+1]=Tools.leerString("Escribe un nombre de persona");
            p++;
	}
	else Tools.imprimeError("Array lleno");
    }
 
    /*public void imprimeDatos(){
	String cad="";
	for (int i = 0; i <=p; i++){
            cad+=i+"["+datos[i]+"]"+"\n";
	}
	Tools.imprimePantalla("Datos del array\n" +cad);
    }*/
    
    public String imprimeDatos(){
	String cad="";
	for (int i = 0; i <=p; i++){
            cad+= i+ " ["+datos[i]+"] "+"\n";
	}
	return ("Datos del array \n" +cad);
    }

    public byte buscarSecuencial(Object dato){
     
        byte i=0;
        while(i<=p && !dato.equals(datos[i]))
        i++;
        /*return(dato.equals(datos[i]))? i:-2;*/
        return(i<=p)? i:-2;
    }
    
    public void eliminaDato(byte pos){
        
        for(int j=pos;j<=p;j++)
        {
            datos[j]=datos[j+1];
        }
        p--;
    }
}
