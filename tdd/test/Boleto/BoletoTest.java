package test.Boleto;
import src.Boleto.Boleto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;


public class BoletoTest {

    Boleto boleto;
@BeforeEach
public void inicializa() {
       boleto = new Boleto();
}



@Test
public void testChegararmazenamento() {
	boleto.setcodigo("A32B");
	boleto.setvalor(500.00);
	boleto.setdata("14/02/2009");
    assertAll("boleto", () -> assertEquals("A32B", boleto.getcodigo()),
            () -> assertEquals("14/02/2009", boleto.getdata()), () -> assertEquals("500.0", boleto.getvalor().toString()));
            
}

}
