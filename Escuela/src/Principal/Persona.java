package Principal;
public abstract class Persona {
    private String nombre;
    private int edad;
    public Persona(String name,int age){
        this.nombre = name;
        this.edad = age;
    }
    public String showInfo(){
        return "";
        
    }
    public void addInfo(){
                
    }
    public String toString(){
        String aux="Su nombre es: "+nombre+"\n"
                + "Su edad es: "+edad+"\n";
            return aux;
    }
}
