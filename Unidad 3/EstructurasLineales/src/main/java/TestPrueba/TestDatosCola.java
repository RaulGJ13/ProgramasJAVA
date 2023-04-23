package TestPrueba;
import EntradaSalida.Tools;
import ColaEstatica.ColaA;
import javax.swing.JOptionPane;
public class TestDatosCola {
    
    public static void main(String[]args){
    
        operacionesColaEstatica("PUSH,POP,PEEK,FREE,SALIR");
        
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
    
    public static void operacionesColaEstatica(String menu)
    {  
        ColaA <Integer> cola = new ColaA((byte)10);

        String op;
        do {
            op=Tools.boton("PUSH,POP,PEEK,FREE,SALIR");
            switch(op)
            {
            case "PUSH" ->{
                cola.pushCola(Tools.leerInt("Escribe un dato entero: "));
                Tools.imprimePantalla("Datos de la cola: " +cola.toString());
            }
                
            case "POP" ->{
                if(cola.isEmptyCola()) Tools.imprimeError("Cola vacia");
                else
                    Tools.imprimePantalla("Dato eliminado de la cima de la cola: ==>" +cola.popCola());
                Tools.imprimePantalla("Datos de la cola: " +cola.toString());
            } 
                
            case "PEEK" ->{
                if(cola.isEmptyCola()) Tools.imprimeError("Cola vacia");
                else
                    Tools.imprimePantalla("Dato de la cima de la cola: ==>" +cola.peekCola());
            } 
                
            case "FREE" ->{
                if(cola.isEmptyCola()) Tools.imprimeError("Cola vacia");
                else
                {
                    cola = new ColaA((byte)10);
                }
            } 
                            
           }
        }while(!op.equalsIgnoreCase("SALIR"));
    }

}
