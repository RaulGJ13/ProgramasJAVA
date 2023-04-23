
package TestPrueba;
import EntradaSalida.Tools;
import PilaDinamica.PilaB;
import PilaDinamica.PilaC;
import PilaDinamica.PilaD;
import PilaEstatica.PilaA;
import javax.swing.JOptionPane;

public class TestDatosPilaDinamica {
    
    public static void main(String[]args){
    
        operacionesPilaDinamica("PUSH,POP,PEEK,FREE,SALIR");
        
    }
    
    public static String boton(String menu){
        String valores[]=menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK ", " MENU", 
        JOptionPane.NO_OPTION, //sin botones
        JOptionPane.QUESTION_MESSAGE,null, // utiliza icono predeterminado
        valores,valores[0]); // botón determinado
        return ( valores[n]);
    }
    
    public static void operacionesPilaDinamica(String menu)
    { 
        PilaB<Integer> pilaB = new PilaB<Integer>();
        PilaC<Integer> pilaC = new PilaC<Integer>();		
        PilaD<Integer> pilaD = new PilaD<Integer>();
        PilaC pilaC =new PilaC();
        PilaD pilaD = new PilaD();

        String op;

	do{			
            op=Tools.boton("PUSH,POP,PEEK,FREE,SALIR");
            switch(op)
            {
            case "PUSH" ->{
                pila.push(Tools.leerInt("Escribe un dato entero: "));
                Tools.imprimePantalla("Datos de la pila:\n" +pila.toString());
            }
                
            case "POP" ->{
                if(pila.isEmpty()) Tools.imprimeError("Pila vacia");
                else
                    Tools.imprimePantalla("Dato eliminado de la cima de la pila: ==>" +pila.pop());
                Tools.imprimePantalla("Datos de la pila:\n" +pila.toString());
            } 
                
            case "Peek" ->{
                if(pila.isEmpty()) Tools.imprimeError("Pila vacia");
                else
                    Tools.imprimePantalla("Dato de la cima de la pila: ==>" +pila.peek());
            } 
                
            case "FREE" ->{
                if(pila.isEmpty()) Tools.imprimeError("Pila vacia");
                else
                {
                    pilaB = new PilaB();
                    pilaC = new PilaC();
                    pilaD = new PilaD();
                }
            } 
                            
           }
        }while(!op.equalsIgnoreCase("SALIR"));
	}
}

