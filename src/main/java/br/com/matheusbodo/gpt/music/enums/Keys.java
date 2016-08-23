package br.com.matheusbodo.gpt.music.enums;

public enum Keys {

	C ("C"),
	C_SHARP ("C#"),
	D ("D"),
	D_SHARP ("D#"),
	E ("E"),
	F ("F"),
	F_SHARP ("F#"),
	G ("G"),
	G_SHARP ("G#"),
	A ("A"),
	A_SHARP ("A#"),
	B ("B");
	
	private Keys (String description) {
		this.description = description;
	}
	
	private String description;
	
	public String getDescription() {
		return description;
	}
}
