package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo_DisquePlusPetit_Negatif() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);

		assertEquals(-1, petit.compareTo(moyen));
	}

	@Test
	public void testCompareTo_DisquePlusGrand_Positif() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);

		assertEquals(1, moyen.compareTo(petit));
	}

	@Test
	public void testCompareTo_DisqueMemeTaille_Null() {
		Disque moyenN1 = new Disque(2);
		Disque moyenN2 = new Disque(2);

		assertEquals(0, moyenN1.compareTo(moyenN2));
	}
}
