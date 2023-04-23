package TestPrueba;
import Actualizacion.DatosOrdenados;
import EntradaSalida.Tools;
import javax.swing.JOptionPane;

public class TestDatos {
    
    public static void main(String[]args){
    
        menu3("Agregar,Imprimir,Buscar,Modificar,Eliminar,Salir");
        
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
        DatosOrdenados obj = new DatosOrdenados((byte) 10);
        String sel="";
        byte pos=0;
        do {
            sel=boton(menu);
            switch(sel){
            case "Agregar": obj.insertandoOrdenado(); break; 
            case "Buscar": 
                            if(obj.validaVacio())
                                Tools.imprimeError("Array vacio");
                            else
                            {
                                pos=obj.busSecuencialOrdenada(Tools.leerInt("Número a buscar: "));
                                if(pos>=0)
                                    Tools.imprimePantalla("Se encuentra en la posición: " +pos);
                                else Tools.imprimeError("Dato no encontrado");
                            }
                            break;
            case "Eliminar": 
                            if(obj.validaVacio())
                                Tools.imprimeError("Array vacio");
                            else
                            {
                                pos=obj.busSecuencialOrdenada(Tools.leerInt("Número a buscar: "));
                                if(pos>=0)
                                {
                                    obj.eliminaDato(pos);
                                    Tools.imprimePantalla("Datos del Arreglo: " +obj.imprimeDatos());
                                }
                                else Tools.imprimeError("Dato no encontrado");
                            }
                            break;
                            
            case "Modificar":
                            if(obj.validaVacio())
                                Tools.imprimeError("Array vacio");
                            else
                            {
                                pos=obj.busSecuencialOrdenada(Tools.leerInt("Número a buscar: "));
                                if(pos>=0)
                                {
                                    obj.modificaDato(pos);
                                    Tools.imprimePantalla("Datos del Arreglo: " +obj.imprimeDatos());
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
