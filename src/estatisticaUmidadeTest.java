import org.junit.Test;

import static org.junit.Assert.*;

public class estatisticaUmidadeTest {

    @Test
    public void mediaTest() {
        double[] array  = {15,7,8.5,6.5};
        estatisticaUmidade eU = new estatisticaUmidade(array);
        assertEquals(9.25,eU.media(),0.1);
    }

    @Test
    public void DpTest() {
        double[] array  = {15,7,8.5,6.5};
        estatisticaUmidade eU = new estatisticaUmidade(array);
        assertEquals(3.40,eU.DP(),0.1);
    }
}