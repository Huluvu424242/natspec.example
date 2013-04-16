package de.openjobs.entities;
		
import org.junit.Before;
import org.junit.Test;

import de.openjobs.entities.TestDriver;



/**
 * JUnit test case generated from the file StoryBewerben.natspec. 
 *
 * PLEASE do not modify this file. It will be overwritten by any changes
 * in StoryBewerben.natspec. 
 */
public class StoryBewerben {

	private TestDriver testDriver;

	@Test
	public void executeScript() throws Exception {
		// Registrierung Arbeitgeber. 
		de.openjobs.entities.Arbeitgeber arbeitgeber_ = testDriver.registriereArbeitgeber();
		// Es liegt ein gültiger Arbeitgeber vor. 
		testDriver.istEinArbeitssuchender(arbeitgeber_);
		// Der Arbeitgeber erstellt ein Stellenangebot. 
		de.openjobs.entities.Stellenangebot stellenangebot_ = testDriver.erstelleStellenangebot();
		// Es liegt ein valides Stellenangebot vor. 
		testDriver.istEinStellenangebot(stellenangebot_);
		// Die Anzahl der Stellen vom Stellenangebot wird auf 1 begrenzt. 
		testDriver.setzeMaxAnzahlStellen(stellenangebot_, 1);
		// Jetzt kann das Stellenangebot noch auf 1 Stelle(n) vermittelt werden. 
		testDriver.vermittelbarAufStellen(stellenangebot_, 1);
		// Registrierung Arbeitssuchender. 
		de.openjobs.entities.Arbeitssuchender arbeitssuchender_ = testDriver.registriereArbeitssuchender();
		// Es liegt ein registrierter Arbeitssuchender vor. 
		testDriver.istEinArbeitssuchender(arbeitssuchender_);
		// Der registrierte Arbeitssuchende erstellt zum Stellenangebot eine Bewerbung. 
		de.openjobs.entities.Bewerbung bewerbung_Arbeitssuchende_Stellenangebot = testDriver.bewirbtSichAufStellenangebot(arbeitssuchender_, stellenangebot_);
		// Damit liegt eine gültige Bewerbung vor. 
		testDriver.istEineBewerbung(bewerbung_Arbeitssuchende_Stellenangebot);
		// Eine Stelle vom Stellenangebot wird besetzt. 
		testDriver.einstellenArbeitssuchenden(stellenangebot_);
		// Jetzt kann das Stellenangebot noch auf 0 Stelle(n) vermittelt werden. 
		testDriver.vermittelbarAufStellen(stellenangebot_, 0);
		// Der Arbeitssuchende erstellt ein Stellengesuch. 
		de.openjobs.entities.Stellengesuch stellengesuch_ = testDriver.createStellengesuch();
		// Es liegt ein valides Stellengesuch vor. 
		testDriver.istEinStellengesuch(stellengesuch_);
		
	}
	
	@Before
	public void setUp() {
		testDriver = new TestDriver();
	}
}
