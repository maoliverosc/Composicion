/*
 * by themaoc
 */
package composicion;

/**
 *
 * @author Mauricio Oliveros C
 */
public class Empleado {
    
    private String FirstName;
    private String LastName;
    private Fecha FechaNacimiento;
    private Fecha FechaContratacion;
    
    public Empleado(String FN, String LN, Fecha FecNac, Fecha FecCon){
        FirstName = FN;
        LastName = LN;
        FechaNacimiento = FecNac;
        FechaContratacion = FecCon;
    }
    
    @Override
    public String toString(){
        return String.format("%s, %s Contradado: %s Cumpleanios: %s", LastName, FirstName, FechaContratacion, FechaNacimiento);
    }
}

// end class
