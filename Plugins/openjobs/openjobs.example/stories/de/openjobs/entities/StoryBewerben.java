package de.openjobs.entities;
		
import org.junit.Before;
import org.junit.Test;

import de.openjobs.entities.StoryBewerbenTestDriver;



/**
 * JUnit test case generated from the file StoryBewerben.natspec. 
 *
 * PLEASE do not modify this file. It will be overwritten by any changes
 * in StoryBewerben.natspec. 
 */
public class StoryBewerben {

	private StoryBewerbenTestDriver testDriver;

	@Test
	public void executeScript() throws Exception {
		// Der Arbeitgeber erstellt ein Stellenangebot. 
		de.openjobs.entities.Stellenangebot stellenangebot_ = storyBewerbenTestDriver.createStellenangebot();
		
	}
	
	@Before
	public void setUp() {
		testDriver = new StoryBewerbenTestDriver();
	}
}
