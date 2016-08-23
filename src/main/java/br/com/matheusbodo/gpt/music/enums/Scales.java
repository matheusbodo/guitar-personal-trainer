package br.com.matheusbodo.gpt.music.enums;

public enum Scales {

	MAJOR ("Major"),
	MINOR ("Minor"),
	PENTATONIC_MAJOR ("Pentatonic Major"),
	PENTATONIC_MINOR ("Pentatonic Minor");
	
	private Scales (String description) {
		this.description = description;
	}
	
	private String description;
	
	public String getDescription() {
		return description;
	}
}
