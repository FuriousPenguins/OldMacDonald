class Pig implements Animal 
{     
 	private String mySound;
	private String myType;
	public Pig() {
		mySound = "oink";
		myType = "pig";
	}
	public Pig(String type, String sound) {
		mySound = sound;
		myType = type;
	}
	public String getSound() { return mySound; }
	public String getType() { return myType; }
}