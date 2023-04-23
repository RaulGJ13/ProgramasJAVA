
package PilaDinamica;

import PilaEstatica.PilaTDA;

public class PilaD<T> implements PilaTDA<T>{
	private Nodo pila;
	
	public PilaD() {
		pila = null;
	}
	
        @Override
	public boolean isEmpty() {
		return (pila == null);
	}
	
	public void vaciar() {
		pila = null;
	}
	
        @Override
	public void push(T dato) {
		Nodo tope = new Nodo(dato);
		if (isEmpty()) {
			pila = tope;
		} else {
			tope.sig = pila;
			pila = tope;
		}
	}
	
        @Override
	public T pop() {
		T dato = (T) pila.getInfo();
		pila = pila.getSig();
		return dato;
	}
	
        @Override
	public T peek() {
		return (T) (pila.getInfo());
	}
	
        @Override
	public String toString() {
		Nodo tope = pila;
		return toString(tope);
	}
	
	private String toString(Nodo i) {
		return (i!=null)
			? "Tope ==> " + "[" + i.getInfo() + "]\n" + toString(i.getSig())
			: "";
	}

}
