
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int nombre1 = 4;
    private static final int nombre2 = 3;
    private static final int apellido1 = 2;
    private static final int apellido2 = 5;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
    }

    public void generateStarWarsName(String nombre, String apellid1, String apellid2, String ciudad){
        String name = apellid1.substring(0,nombre1) + nombre.substring(0,nombre2);
        String surname = apellid2.substring(0,apellido1) + ciudad.substring(0,apellido2);
        System.out.println(name + " " + surname);
    }
    
}
