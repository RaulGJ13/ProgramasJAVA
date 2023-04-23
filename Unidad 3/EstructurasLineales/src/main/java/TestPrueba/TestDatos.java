package TestPrueba;
import EntradaSalida.Tools;
import PilaEstatica.PilaA;
import javax.swing.JOptionPane;

public class TestDatos {
    
    public static void main(String[]args){
    
        operacionesPilaEstatica("PUSH,POP,PEEK,FREE,SALIR");
        
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
    
    public static void operacionesPilaEstatica(String menu)
    {  
        PilaA <Integer> pila = new PilaA((byte)10);

        String op;
        do {
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
                    pila = new PilaA((byte)10);
                }
            } 
                            
           }
        }while(!op.equalsIgnoreCase("SALIR"));
    }
}
