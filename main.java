/**
 * Autómata No.3
 * Todas las cadenas con no más de 3 a's
 */
public class main {
    //declaración de cadena 
    public static String cadena;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //establecemos el valor de la cadena a evaluar
        cadena = "abaac";
        //creamos un objeto y mandamos cómo parámetro la cadena que será evaluada
        Automata3 miAut = new Automata3(cadena);
    }//fin del método main

}//fin de la clase main