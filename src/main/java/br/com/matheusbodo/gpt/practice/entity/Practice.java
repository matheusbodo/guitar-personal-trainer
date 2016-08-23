package br.com.matheusbodo.gpt.practice.entity;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;

public class Practice {

	public Practice(Keys key, Scales scale) {
		this.key = key.getDescription();
		this.scale = scale.getDescription();
	}

	private String key;
	private String scale;

	public String getKey() {
		return key;
	}
	
	public String getScale() {
		return scale;
	}
}
