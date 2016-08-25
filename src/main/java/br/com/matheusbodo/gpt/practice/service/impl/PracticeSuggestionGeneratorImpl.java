package br.com.matheusbodo.gpt.practice.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;
import br.com.matheusbodo.gpt.practice.entity.PracticeSuggestion;
import br.com.matheusbodo.gpt.practice.service.PracticeSuggestionGenerator;

@Service
public class PracticeSuggestionGeneratorImpl implements PracticeSuggestionGenerator {
	
	@Autowired
	private Random random;

	@Override
	public PracticeSuggestion generate() {
		Keys key = Keys.values()[this.random.nextInt(Keys.values().length)];
		Scales scale = Scales.values()[this.random.nextInt(Scales.values().length)];
		int position = this.random.nextInt(scale.getPositions()) + 1;
		return new PracticeSuggestion(key, scale, position);
	}

}
