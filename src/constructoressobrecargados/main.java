

package constructoressobrecargados;

import javax.swing.JOptionPane;

public class main {
    
    public static void main(String[]args)
    {
        Persona persona1 = new Persona("1087426319","Mauro","Valdez");
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Carlos","Velasquez");
        Persona persona4 = new Persona("0189243892");
        
       persona1.mostrardatos();
       persona2.mostrardatos();
       persona3.mostrardatos();
       persona4.mostrardatos();
       
       
      
        
    }
    
}
