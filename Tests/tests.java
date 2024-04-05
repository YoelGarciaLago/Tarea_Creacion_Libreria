import com.damLibrerias.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {
    @Test
    public void sumaNormal() {
        assertEquals(5, Calc.suma(2, 3));
    }
    @Test
    public void sumaNegativos() {
        assertEquals(-5, Calc.suma(-2, -3));
    }
    @Test
    public void sumaCeros(){
        assertEquals(0,Calc.suma(0,0));
    }
    
    @Test
    public void sumaPosNeg(){
        assertEquals(0,Calc.suma(2,-2));
    }
    
    @Test
    public void resat(){
        assertEquals(-1,Calc.resta(2,3));
    }
    
    @Test
    public void restaCeros(){
        assertEquals(0,Calc.resta(0,0));
    }
    
    @Test
    public void restaASuma(){
        assertEquals(4,Calc.resta(2,-2));
    }
    
    @Test
    public void restaRara(){
        assertEquals(0,Calc.resta(-2,-2));
    }
    
    @Test
    public void multi(){
        assertEquals(4,Calc.multiplicacion(2,2));
    }
    
    @Test
    public void multiNeg(){
        assertEquals(-4,Calc.multiplicacion(2,-2));
    }
    
    @Test
    public void multiNegAPos(){
        assertEquals(4,Calc.multiplicacion(-2,-2));
    }
    
    @Test
    public void multiACero(){
        assertEquals(0,Calc.multiplicacion(2,0));
    }
    
    @Test
    public void division(){
        assertEquals(1,Calc.division(2,2));
    }
    
    @Test
    public void divisionNeg(){
        assertEquals(-1,Calc.division(2,-2));
    }
    
    @Test
    public void divNegAPos(){
        assertEquals(1,Calc.division(-2,-2));
    }
    
    @Test
    public void DivADecimal(){
        assertEquals(0.5,Calc.division(2,4));
    }
    
    @Test
    public void cuadrada(){
        assertEquals(2,Calc.square(4,2));
    }
    
    @Test
    public void cubica(){
        assertEquals(2,Calc.square(8,3));
    }
    
}
