package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void empiler_TourVide_True() {

		Tour uneTour = new Tour();

		Disque petit = new Disque(1);

		assertEquals(true, uneTour.empiler(petit));

	}

	@Test
	public void empiler_TourUnDisquePlusGrand_True(){
		Tour uneTour = new Tour();

		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);

		uneTour.empiler(moyen);
		assertEquals(true, uneTour.empiler(petit));

	}

	@Test
	public void empiler_TourDisqueDisquePetit_False(){
		Tour uneTour = new Tour();

		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);

		uneTour.empiler(petit);

		assertEquals(false, uneTour.empiler(moyen));

	}

	@Test
	public void empiler_TourDisqueTailleMax_False(){
		Tour uneTour = new Tour(1);

		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);

		uneTour.empiler(petit);

		assertEquals(false, uneTour.empiler(moyen));
	}

}
