
package TestPrueba;
import Actualizacion.DatoSimple;
import EntradaSalida.Tools;
import javax.swing.JOptionPane;

public class TestDatos {
    
    public static void main(String[]args){
    
        menu3("Agregar,Imprimir,Buscar,Eliminar,Salir");
        
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
    
    public static void menu3(String menu){  
        DatoSimple obj = new DatoSimple((byte) 10);
        String sel="";
        byte pos=0;
        do {
            sel=boton(menu);
            switch(sel){
            case "Agregar": obj.almacenarDato(); break; 
            case "Buscar": 
                            if(obj.validaVacio())
                                Tools.imprimeError("Array vacio");
                            else
                            {
                                pos=obj.buscarSecuencial(Tools.leerString("Nombre a buscar: "));
                                if(pos!=-2)
                                    Tools.imprimePantalla("Se encuentra en la posicion: " +pos);
                                else Tools.imprimeError("Dato no encontrado");
                            }
                            break;
            case "Eliminar": 
                            if(obj.validaVacio())
                                Tools.imprimeError("Array vacio");
                            else
                            {
                                pos=obj.buscarSecuencial(Tools.leerString("Nombre a eliminar: "));
                                if(pos!=-2)
                                {
                                    obj.eliminaDato(pos);
                                    obj.imprimeDatos();
                                }
                                else Tools.imprimeError("Dato no encontrado");
                            }
                            break;
            case "Imprimir": 
                            if(obj.validaVacio())
                                Tools.imprimeError("Array vacio");
                            else
                            {
                                Tools.imprimePantalla("Datos del Arreglo: " +obj.imprimeDatos()); break;
                            }    
            case "Salir": break;
            }//switch
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}
