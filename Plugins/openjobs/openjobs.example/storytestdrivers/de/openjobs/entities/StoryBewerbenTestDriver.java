package de.openjobs.entities;

import junit.framework.Assert;
import de.devboost.natspec.annotations.TextSyntax;

public class StoryBewerbenTestDriver {

	public StoryBewerbenTestDriver() {
		super();
	}
	
	@TextSyntax("Der Arbeitgeber erstellt ein Stellenangebot.")
	public Stellenangebot createStellenangebot() {
		final Arbeitgeber arbeitgeber = new Arbeitgeber();
		return arbeitgeber.erstelleStellenangebot();
	}

	@TextSyntax("Das Ergebnis ist ein Artefakt.")
	public void assertNotNull(Object ergebnis){
		Assert.assertNotNull(ergebnis);
	}
	// Die Anzahl der Stellen wird auf 1 begrenzt.
	// Das Stellenangebot kann auf 1 Stelle(n) vermittelt werden.
	// Der Arbeitssuchende erstellt ein Stellengesuch.
	// Das Ergebnis ist ein Artefakt.
	// Der Arbeitssuchende erstellt eine Bewerbung zu einem Stellenangebot.
	// Das Ergebnis ist ein Artefakt.
	// Der Arbeitgeber stellt stellt den Arbeitssuchenden der Bewerbung zum
	// Stellenangebot ein.
	// Als Ergebnis wird kein Fehler erwartet.
	// Der Arbeitssuchende erstellt eine Bewerbung zu einem Stellenangebot.
}
