package br.com.matheusbodo.gpt.music.enums;

public enum Scales {

	MAJOR ("Major", 5),
	MINOR ("Minor",5 ),
	PENTATONIC_MAJOR ("Pentatonic Major", 5),
	PENTATONIC_MINOR ("Pentatonic Minor", 5);
	
	private Scales (String description, int positions) {
		this.description = description;
		this.positions = positions;
	}
	
	private String description;
	private int positions;
	
	public String getDescription() {
		return description;
	}
	
	public int getPositions() {
		return positions;
	}
}
