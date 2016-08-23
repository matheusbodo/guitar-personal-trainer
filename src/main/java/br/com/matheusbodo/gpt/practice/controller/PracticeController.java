package br.com.matheusbodo.gpt.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;
import br.com.matheusbodo.gpt.practice.entity.Practice;

@Controller
@RequestMapping("/practices")
public class PracticeController {

	@ResponseBody
	@RequestMapping(value="/suggestion", method=RequestMethod.GET)
	public Practice getSuggestion() {
		return new Practice(Keys.E, Scales.PENTATONIC_MINOR);
	}
}
