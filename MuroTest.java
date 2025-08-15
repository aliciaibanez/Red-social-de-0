

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaFoto entradaF1;
    private EntradaTexto entradaT2;
    private EntradaTexto entradaT3;
    private EntradaFoto entradaF2;
    private EntradaFoto entradaF3;

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("Alicia", "Me encantan las fresas");
        muro1.addEntradaTexto(entradaT1);
        entradaT1.addComentarios("¡A mí también");
        entradaF1 = new EntradaFoto("Carmen", "Foto de mis vacaciones", "Maldivas");
        muro1.addEntradaFoto(entradaF1);
        muro1.imprimirMuro();
        entradaT2 = new EntradaTexto("María", "Cena de amigos");
        entradaT3 = new EntradaTexto("Luís", "Cena de Navidad");
        entradaF2 = new EntradaFoto("Pepe", "Foto de mi hijo", "Mi hijo Pepito");
        entradaF3 = new EntradaFoto("Manuel", "Foto de mi coche", "Este es mi coche nuevo");
        entradaT2.addComentarios("Qué chulo");
        entradaT2.addComentarios("Muy sin más");
        entradaF2.addComentarios("Me encantan");
        entradaF2.addComentarios("Guau");
        muro1.addEntradaTexto(entradaT2);
        muro1.addEntradaFoto(entradaF2);
        muro1.addEntradaTexto(entradaT3);
        muro1.addEntradaFoto(entradaF3);
        muro1.imprimirMuro();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}