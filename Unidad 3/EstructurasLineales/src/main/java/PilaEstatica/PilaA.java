package PilaEstatica;

import EntradaSalida.Tools;

public class PilaA <T> implements PilaTDA<T> {
    private T pila[];
    private byte tope;
    
    public PilaA(int max){
        
        pila=(T[]) (new Object[max]);
        tope=-1;
    }
    
    @Override
    public boolean isEmpty()
    {
        return (tope==-1);
    }
    
    public boolean isSpace()
    {
        return (tope<pila.length-1);
    }
    
    @Override
    public void push(T dato) // Recibe un dato generico y pregunta si hay espacio, el -1 es para que no se desborde
    {
        if(isSpace())
        {
            tope++;
            pila[tope] = dato;
        }
        else
            Tools.imprimeError("Pila Llena...!");
    }
    
    @Override
    public T pop() // Retorna Lo que esta en el tope de la pila de tipo genérico
    {
        T dato = pila[tope];
        tope--;
        return dato;
    }
    
    @Override
    public T peek()
    {
        return pila[tope];
    }
    
    @Override
    public String toString()
    {
        return toString(tope);
    }
    
    private String toString(int i)
    {
        return (i>=0)?"tope===>"+i+"["+pila[i]+"]\n" + toString(i-1):"";
    }
}
