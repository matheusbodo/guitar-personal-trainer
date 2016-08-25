package br.com.matheusbodo.gpt.practice.controller;

import static org.hamcrest.Matchers.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;
import br.com.matheusbodo.gpt.practice.entity.PracticeSuggestion;
import br.com.matheusbodo.gpt.practice.service.PracticeSuggestionGenerator;

@RunWith(SpringRunner.class)
@WebMvcTest(PracticeController.class)
public class PracticeControllerTest {

	@Autowired
    private MockMvc mvc;
	
	@MockBean
    private PracticeSuggestionGenerator practiceSuggestionGenerator;
	
	@Test
	public void testGetSuggestion() throws Exception {
		PracticeSuggestion practiceSuggestion = new PracticeSuggestion(Keys.E, Scales.PENTATONIC_MINOR, 1);
		
		given(practiceSuggestionGenerator.generate()).willReturn(practiceSuggestion);
		
		this.mvc.perform(get("/practices/suggestion")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.key", is(Keys.E.getDescription())))
				.andExpect(jsonPath("$.scale", is(Scales.PENTATONIC_MINOR.getDescription())))
				.andExpect(jsonPath("$.position", is(1)));
		
		verify(practiceSuggestionGenerator, times(1)).generate();
		verifyNoMoreInteractions(practiceSuggestionGenerator);
	}
}
