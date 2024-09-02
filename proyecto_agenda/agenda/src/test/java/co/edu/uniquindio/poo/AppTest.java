/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class, ()-> new Contacto(" ", " ", " ", " ", " "));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test validacionCorreo");

        assertThrows(Throwable.class, ()-> new Contacto("Laura", "Lala", "Conjunto bosque", "+57 3127062992", "lauu"));

        LOG.info("Finalizando test validacionCorreo");
    }

        @Test
        public void numeroColombiano() {
            LOG.info("Iniciado test numeroColombiano");
    
            assertThrows(Throwable.class, ()-> new Contacto("Jorge", "Tio España", "Madrid, España", "+34 3156562497", "jorgeg@gmail.com"));
    
            LOG.info("Finalizando test numeroColombiano");
    }
}
