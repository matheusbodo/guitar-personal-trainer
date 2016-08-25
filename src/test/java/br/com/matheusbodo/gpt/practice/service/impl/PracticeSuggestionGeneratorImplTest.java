package br.com.matheusbodo.gpt.practice.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;
import br.com.matheusbodo.gpt.practice.entity.Practice;

public class PracticeSuggestionGeneratorImplTest {

	private PracticeSuggestionGeneratorImpl impl;
	
	@Before
	public void setUp() {
		this.impl = new PracticeSuggestionGeneratorImpl();
	}
	
	@Test
	public void testGenerate() throws Exception {
		Practice result = impl.generate();
		Practice expected = new Practice(Keys.E, Scales.PENTATONIC_MINOR, 1);
		Assert.assertEquals(expected, result);
	}
}
