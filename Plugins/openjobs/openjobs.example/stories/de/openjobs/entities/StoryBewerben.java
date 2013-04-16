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
		// Der Arbeitgeber erstellt ein Stellenangebot. 
		de.openjobs.entities.Stellenangebot stellenangebot_ = storyBewerbenTestDriver.createStellenangebot();
		// Der Arbeitgeber erstellt ein Stellenangebot. 
		de.openjobs.entities.Stellenangebot stellenangebot_0 = testDriver.createStellenangebot();
		// Das Ergebnis ist ein Artefakt. 
		testDriver.istEinArtefakt(stellenangebot_0);
		// Die Anzahl der Stellen wird auf 1 begrenzt. 
		storyBewerbenTestDriver.maxStellen(1);
		// Das Stellenangebot kann auf 1 Stelle(n) vermittelt werden. 
		storyBewerbenTestDriver.vermittelbarAufStellen(1);
		// Das Stellenangebot kann auf 1 Stelle(n) vermittelt werden. 
		testDriver.vermittelbarAufStellen(1);
		// Der Arbeitssuchende erstellt ein Stellengesuch. 
		de.openjobs.entities.Stellengesuch stellengesuch_ = storyBewerbenTestDriver.createStellengesuch();
		// Der Arbeitssuchende erstellt ein Stellengesuch. 
		de.openjobs.entities.Stellengesuch stellengesuch_0 = testDriver.createStellengesuch();
		// Das Ergebnis ist ein Artefakt. 
		testDriver.istEinArtefakt(stellengesuch_0);
		// Das Ergebnis ist ein Artefakt. 
		testDriver.istEinArtefakt(stellengesuch_0);
		
	}
	
	@Before
	public void setUp() {
		testDriver = new TestDriver();
	}
}
