
package ColaEstatica;
import EntradaSalida.Tools;

public class ColaA<T> implements ColaTDA<T>{
    private T cola[];
    private byte u;
    
    public ColaA(int max)
    {
        cola=(T[]) (new Object[max]);
        u=-1;
    }
    
    @Override
    public boolean isEmptyCola()
    {
        return (u==-1);
    }
    
    public boolean isSpace()
    {
        return (u<cola.length-1);
    }
    
    @Override
    public void pushCola(T dato)
    {
        if(isSpace())
        {
            u++;
            cola[u] = dato;
        }
        else
            Tools.imprimeError("Estructura Cola llena");
    }
    
    @Override
    public T popCola()
    {
        T dato = cola[0];
        
	for (int i = 0; i <=u; i++){
            cola[i]=cola[i+1];
	}
        //INVOCAR A CORRIMIENTO INMEDIATO
        //METODO DE RECORRER DEL TEMA 1
        //for empieza con 0 hasta llegar al valor de u, i incrementa y lo que tenga en 1 +1
        u--;
        return dato;
    }
    
    @Override
    public T peekCola()
    {
        return (T)cola[0];
    }
    
    @Override
    public String toString()
    {
     return toString(0);
    }
    
    private String toString(int i)
    {
        return (i<=u)?"===>" +i+ "["+cola[i]+"]" + toString(i+1):"";
    }
    
    @Override
	public void freeCola() {
		u=-1;
	}
}
