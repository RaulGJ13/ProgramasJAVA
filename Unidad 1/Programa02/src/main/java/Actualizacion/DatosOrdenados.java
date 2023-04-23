
package Actualizacion;
import EntradaSalida.Tools;
public class DatosOrdenados {
    
    private int ordenados[]; //Definir Array
    private byte p; //Subíndice, Posición
    
    //Constructor que recibe el tamaño para dimensionar(Reservar)
    public DatosOrdenados(int tam)
    {
        ordenados = new int[tam];
        p=-1; //Si mi arreglo es -1 el arreglo no puede agregar, buscar e imprimir // Subíndice -1 para validar si está vacio el array
    }
    
    /*public boolean validaVacio()
    {
        if(p==-1)
            return true;
        else
            return false;
    }*/
    
    public boolean validaVacio()
    {
        return(p==-1);
    }
    
    public String imprimeDatos()
    {
        String cad="";
        for(int i=0; i<=p; i++)
        {
            cad+=i+"["+ordenados[i]+"]"+"\n";
        }
        return "\n"+cad;
    }
    
    public byte busSecuencialOrdenada(int dat)
    {
        byte i=0;
        while(i<=p && ordenados[i]<dat)
            i++;
        return (byte) ((i>p || ordenados[i]>dat )? -i:i);
    }
    
    public void eliminaDato(byte pos)
    {
        for(int j=pos; j<p; j++)
        {
            ordenados[j]=ordenados[j+1];
        }
        p--;
    }
    
    public void recorrePosiciones(byte pos){
        
        for(int j=p+1; j>pos; j--)
        {
            ordenados[j] = ordenados[j-1];
        }
    }
    
    public void insertandoOrdenado(){
        
        int dato=Tools.leerInt("Dato a insertar: ");
        if(validaVacio()){ordenados[p+1]=dato;p++;}
        else
        {
            byte pos=busSecuencialOrdenada(dato);
            
            if(pos>0) Tools.imprimeError("Ya existe el dato");
            else
            {
                pos*=-1;
                recorrePosiciones((byte) (pos));
                ordenados[pos]=dato;
                p++;
            }
        }
    }
    
    public void modificaDato(byte existe){
        int dat;
        if(existe==0)
        {
            do
            {
                dat=Tools.leerInt("Dato a modificar debe ser < a " +ordenados[existe+1]);
            }while(dat>ordenados[existe+1]);
            ordenados[existe]=dat;
        }
        else 
         if(existe==p)
          {
            do
            {
                dat=Tools.leerInt("Dato a modificar debe ser > a " +ordenados[existe-1]);
            } while(dat<ordenados[existe-1]);
            ordenados[existe]=dat;
          }
        else
          entreDos(existe);
    }
    
    public void entreDos(byte existe){ 
        int dat;
        do
            {
             System.out.print("existe:"+existe);   
             dat=Tools.leerInt("Dato a modificar debe ser > a " +ordenados[existe-1]+ " y < a " +ordenados[existe+1]);
            }while(dat<ordenados[existe-1] || dat>ordenados[existe+1]);
            ordenados[existe]=dat;
    }
}
 
