package GptalkTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gptalk.Grammar;

public class GrammarTest {
	Grammar gm = new Grammar();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		gm.init();
		gm.simple();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testIsExpect() {
		assertTrue(gm.isExpect());
	}

}
