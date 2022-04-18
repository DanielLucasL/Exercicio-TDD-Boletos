/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Fatura;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Fatuta.Fatura;
import src.Boleto.Boleto;

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
    assertAll("boleto", () -> assertEquals("Daniel", fatura.getnomedocliente()),
            () -> assertEquals("04/02/2009", fatura.getdata()), () -> assertEquals("50000.0", fatura.getvalortotal().toString()));
            
}
@Test
public void testChegarpagamento() {
	fatura.setvalortotal(1500.00);
	ArrayList<Boleto> boletos = new ArrayList<Boleto>();
	Boleto boleto1=new Boleto();
	Boleto boleto2=new Boleto();
	Boleto boleto3=new Boleto();
	boletos.add(boleto1);
	boletos.add(boleto2);
	boletos.add(boleto3);
	boletos.get(0).setvalor(500.00);
	boletos.get(1).setvalor(600.00);
	boletos.get(2).setvalor(400.00);
	assertEquals(true, fatura.pagar(boletos));
}
    
}
