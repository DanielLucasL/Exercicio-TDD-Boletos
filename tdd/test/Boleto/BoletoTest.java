/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boleto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class BoletoTest {
        Boleto boleto;
	@Before
	public void inicializa() {
           boleto = new Boleto();
	}
	
	@Test
	public void testVertamanho() {
        String codigo="A32B";
        String data="14/02/2009";
        boleto.setcodigo(codigo);
        boleto.setvalor(500.00);
        boleto.setdata("14/02/2009");
		assertEquals(codigo, boleto.getcodigo());
                assertEquals(valor, boleto.getvalor());
                assertEquals(data, boleto.getdata());
	}
}
