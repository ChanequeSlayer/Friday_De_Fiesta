package Principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Profesor extends Persona{
    protected String matricula;
    protected String materia;
    protected String grupo;
    
    private ArrayList<Estudiante> lista;
    private int[]calis;
    protected String str;
    
    public Profesor(String nombre,int edad,String matricula,String materia,String grupo){
        super(nombre,edad);
        lista = new ArrayList<Estudiante>();
        this.matricula = matricula;
        this.materia = materia;
        this.grupo = grupo;
        calis = new int[9];
    }
    @Override
    public String showInfo(){
        String datos=super.toString();
        datos+="Su matricula es: "+matricula+"\n"
                + "Su materia es: "+materia+"\n"
                + "Su grupo es: "+grupo;
        return datos;
    }
    public String addCalis(){
        String result="";
        for(int i =0;i<calis.length;i++){
            calis[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion "+(i+1)));
        }
        for(int i =0;i<calis.length;i++){
           result+="La calificacion "+(i+1)+" es: "+calis[i]+"\n";
           
        }
        return result;
    }
    
    public void addInfo(Estudiante estudiante) {
        lista.add(estudiante);

    }
            @Override
    public String toString() {
        str = "La lista de Estudiantes es: \n";
        str += lista.toString();
        return str;

    }
}
