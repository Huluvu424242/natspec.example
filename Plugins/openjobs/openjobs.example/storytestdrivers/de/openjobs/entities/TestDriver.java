package de.openjobs.entities;

import junit.framework.Assert;
import de.devboost.natspec.annotations.TextSyntax;

public class TestDriver {

	public TestDriver() {
		super();
	}

	@TextSyntax("Der Arbeitgeber erstellt ein Stellenangebot.")
	public Stellenangebot createStellenangebot() {
		final Arbeitgeber arbeitgeber = new Arbeitgeber();
		return arbeitgeber.erstelleStellenangebot();
	}

	@TextSyntax("Das Ergebnis ist ein Artefakt.")
	public void istEinArtefakt(Object ergebnis) {
		Assert.assertNotNull(ergebnis);
	}


	@TextSyntax("Die Anzahl der Stellen wird auf #1 begrenzt.")
	public void maxStellen(Integer anzahl) {
		Assert.assertTrue(false);
	}

	@TextSyntax("Das Stellenangebot kann auf #1 Stelle(n) vermittelt werden.")
	public void vermittelbarAufStellen(Integer anzahl) {
		Assert.assertTrue(false);
	}

	@TextSyntax("Der Arbeitssuchende erstellt ein Stellengesuch.")
	public Stellengesuch createStellengesuch() {
		return new Stellengesuch();
	}

	@TextSyntax("Der Arbeitssuchende erstellt eine Bewerbung zu einem Stellenangebot.")
	public Bewerbung createBewerbung(Stellenangebot stellenangebot) {
		return new Bewerbung();
	}

	@TextSyntax("Der Arbeitgeber stellt stellt den Arbeitssuchenden der Bewerbung zum Stellenangebot ein.")
	public void einstellenArbeitssuchenden(Bewerbung bewerbung) {
		Assert.assertTrue(false);
	}


	@TextSyntax("Als Ergebnis wird kein Fehler erwartet.")
	public void noException(Object ergebnis) {
		Assert.assertTrue(false);
	}

	

}
