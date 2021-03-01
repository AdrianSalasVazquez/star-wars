
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int NOMBRE_1 = 4;
    private static final int NOMBRE_2 = 3;
    private static final int APELLIDO_1 = 2;
    private static final int APELLIDO_2 = 5;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
    }

    public void generateStarWarsName(String nombre, String apellid1, String apellid2, String ciudad){
        String name = apellid1.substring(0,NOMBRE_1) + nombre.substring(0,NOMBRE_2);
        String surname = apellid2.substring(0,APELLIDO_1) + ciudad.substring(0,APELLIDO_2);
        System.out.println(name + " " + surname);
    }
    
}
