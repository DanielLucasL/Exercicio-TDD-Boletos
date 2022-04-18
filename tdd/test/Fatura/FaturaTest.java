/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Fatura;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Fatuta.Fatura;

/**
 *
 * @author Aluno
 */
public class FaturaTest {
    Fatura fatura;
@BeforeEach
public void inicializa() {
       fatura = new Fatura();
}



@Test
public void testChegararmazenamento() {
	fatura.setnomedocliente("Daniel");
	fatura.setdata("04/02/2009");
	fatura.setvalortotal(50000.00);
    assertAll("boleto", () -> assertEquals("A32B", fatura.getnomedocliente()),
            () -> assertEquals("14/02/2009", fatura.getdata()), () -> assertEquals("50000.0", fatura.getvalortotal().toString()));
            
}
    
}
