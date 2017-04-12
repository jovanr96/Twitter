package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jovan Ristic
 *
 */
public class TwitterPorukaTest {

	private TwitterPoruka tp;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		tp = null;
	}

	/**
	 * Test method for
	 * {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		tp.setKorisnik("Korisnik");
		assertEquals("Korisnik", tp.getKorisnik());

	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString() {
		tp.setKorisnik("");
	}

	/**
	 * Test method for
	 * {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		String p = "Ovo je sadrzaj poruke.";
		tp.setPoruka(p);
		assertEquals(p, tp.getPoruka());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		tp.setPoruka(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPrazanString() {
		tp.setPoruka("");
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaViseKaraktera() {
		String p = new String();
		for (int i = 0; i < 140; i++)
			p += "i";
		tp.setPoruka(p);
	}
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		tp.setKorisnik("korisnik");
		tp.setPoruka("poruka");
		assertEquals("KORISNIK: korisnik PORUKA: poruka", tp.toString());
	}

}
