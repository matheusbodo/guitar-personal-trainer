package br.com.matheusbodo.gpt.practice.service.impl;

import org.springframework.stereotype.Service;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;
import br.com.matheusbodo.gpt.practice.entity.Practice;
import br.com.matheusbodo.gpt.practice.service.PracticeSuggestionGenerator;

@Service
public class PracticeSuggestionGeneratorImpl implements PracticeSuggestionGenerator {

	@Override
	public Practice generate() {
		return new Practice(Keys.E, Scales.PENTATONIC_MINOR, 1);
	}

}
