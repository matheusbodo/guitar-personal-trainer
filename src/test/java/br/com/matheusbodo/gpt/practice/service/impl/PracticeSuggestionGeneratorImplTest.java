package br.com.matheusbodo.gpt.practice.service.impl;

import static org.mockito.BDDMockito.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;
import br.com.matheusbodo.gpt.practice.entity.PracticeSuggestion;
import br.com.matheusbodo.gpt.practice.service.PracticeSuggestionGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class PracticeSuggestionGeneratorImplTest {

	@Autowired
	private PracticeSuggestionGenerator impl;
	
	@MockBean
    private Random random;
	
	@Test
	public void testGenerate() throws Exception {
		given(random.nextInt(Keys.values().length)).willReturn(4);
		given(random.nextInt(Scales.values().length)).willReturn(3);
		given(random.nextInt(Scales.PENTATONIC_MINOR.getPositions())).willReturn(0);
		
		PracticeSuggestion result = impl.generate();
		PracticeSuggestion expected = new PracticeSuggestion(Keys.E, Scales.PENTATONIC_MINOR, 1);
		Assert.assertEquals(expected, result);
	}
}
