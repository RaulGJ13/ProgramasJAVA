
package PilaDinamica;
import PilaEstatica.PilaTDA;
import java.util.Stack;

public class PilaB<T> implements PilaTDA<T>{
	
	private Stack<T> pila;
	
	public PilaB() {
		pila = new Stack<T>();
	}
	
	public int Size(){
		return pila.size();
	}
	
        @Override
	public boolean isEmpty() {
		return (pila.empty());
	}
	
        @Override
	public T peek() {
		return (T) (pila.peek());
	}
	
	public void vaciar() {
		pila.clear();
	}
	
        @Override
	public void push(T dato) {
		pila.push(dato);
	}
	
        @Override
	public T pop() {
		T dato;
		dato = (T) pila.peek();
		pila.pop();
		return dato;
	}
	
	
        @Override
	public String toString() {
		return toString(pila.size()-1);
	}
	
	public String toString(int i){
            return (i>=0)?"tope ===>"+i+"["+pila.get(i)+"]\n"+toString(i-1):"";
        }
}

