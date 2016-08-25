package br.com.matheusbodo.gpt.practice.controller;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;

@RunWith(SpringRunner.class)
@WebMvcTest(PracticeController.class)
public class PracticeControllerTest {

	@Autowired
    private MockMvc mvc;
	
	@Test
	public void testGetSuggestion() throws Exception {
		this.mvc.perform(get("/practices/suggestion")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.key", is(Keys.E.getDescription())))
				.andExpect(jsonPath("$.scale", is(Scales.PENTATONIC_MINOR.getDescription())));
	}
}
