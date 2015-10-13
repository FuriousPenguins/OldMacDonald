class Chick implements Animal 
{
	private String mySound;
	private String myType;
    public Chick(String type, String sound1, String sound2) {
    	if ( ((int)(Math.random()*2)) == 0) {
    		mySound = sound1;
    	}
    	else {
    		mySound = sound2;
    	}
    	myType = type;
    }
    public Chick(String type,String sound) {
    	myType = type;
    	mySound = sound;
    }
    public Chick() {
    	myType = "chick";
    	mySound = "unknown";
    }
    public String getSound() { return mySound; }
    public String getType() { return myType; }
}