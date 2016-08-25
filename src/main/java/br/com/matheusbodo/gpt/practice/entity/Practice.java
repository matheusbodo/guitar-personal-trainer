package br.com.matheusbodo.gpt.practice.entity;

import br.com.matheusbodo.gpt.music.enums.Keys;
import br.com.matheusbodo.gpt.music.enums.Scales;

public class Practice {

	public Practice(Keys key, Scales scale, int position) {
		this.key = key.getDescription();
		this.scale = scale.getDescription();
		this.position = position;
	}

	private String key;
	private String scale;
	private int position;

	public String getKey() {
		return key;
	}
	
	public String getScale() {
		return scale;
	}
	
	public int getPosition() {
		return position;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + position;
		result = prime * result + ((scale == null) ? 0 : scale.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Practice other = (Practice) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (position != other.position)
			return false;
		if (scale == null) {
			if (other.scale != null)
				return false;
		} else if (!scale.equals(other.scale))
			return false;
		return true;
	}
	
}
