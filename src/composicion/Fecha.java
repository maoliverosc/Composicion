/*
 * by themaoc
 */
package composicion;

/**
 *
 * @author Mauricio Oliveros C
 */
public final class Fecha {
    private final int day;
    private final int month;
    private final int year;
    /*
    private int TestMonth(int M){
        if (M > 0 && M <= 12) 
            return M;
        else
            throw new IllegalArgumentException("Error en el mes");
    }
    int TestDay(int D){
        if (D > 0 && D <= 31) 
            return D;
        else
            throw new IllegalArgumentException("Error en el dia");
    }
    */        
    public Fecha(int D, int M, int Y) {
        day = D;
        month = M;
        year = Y;
                
        //System.out.printf("Constructor de objeto Fecha para la fecha: %s\n", this);
    }
            
    @Override
    public String toString(){
        return String.format("%d/%d/%d", day, month, year);
    }
            
}

// end class