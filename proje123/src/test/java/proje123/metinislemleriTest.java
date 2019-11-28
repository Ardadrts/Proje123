package proje123;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class metinislemleriTest {

@Test
	
	public void testBuyukHarf() {
	String sonuc= metinislemleri.buyukHarf("okul");
	 Assert.assertEquals("OKUL", sonuc);
	}

}
