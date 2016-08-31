/*
 * by themaoc
 */
package composicion;

/**
 *
 * @author Mauricio Oliveros C
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Fecha nac = new Fecha(16, 4, 1988);
        Fecha con = new Fecha(18, 5, 2016);
        Empleado emp = new Empleado("Mauricio", "Oliveros", nac, con);
        
        System.out.println(emp);
    }
}

// end main program