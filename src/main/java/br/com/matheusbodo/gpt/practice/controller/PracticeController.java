package br.com.matheusbodo.gpt.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.matheusbodo.gpt.practice.entity.Practice;
import br.com.matheusbodo.gpt.practice.service.PracticeSuggestionGenerator;

@Controller
@RequestMapping("/practices")
public class PracticeController {

	@Autowired
	private PracticeSuggestionGenerator practiceSuggestionGenerator;
	
	@ResponseBody
	@RequestMapping(value="/suggestion", method=RequestMethod.GET)
	public Practice getSuggestion() {
		return practiceSuggestionGenerator.generate();
	}
}
