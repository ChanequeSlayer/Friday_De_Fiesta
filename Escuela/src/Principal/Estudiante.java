package Principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante extends Persona {

    private String id;
    private String grado;
    private String calis;

    public Estudiante(String nombre, int edad, String id, String grado,String calis) {
        super(nombre, edad);
        this.id = id;
        this.grado = grado;
        this.calis = calis;
    }
    //No esta implementado
    public void showCalis(String cal){
        String result="Su lista de calificaciones es: ";
        JOptionPane.showMessageDialog(null,calis);
        }
    
    
    public String toString(){
        String aux = super.toString();
        aux+="Su id (ITCHII): "+id+"\n"
                + "Su grado: "+grado+"\n"
                + "Sus calificaciones: \n"+calis;
        return aux;
    }

}
