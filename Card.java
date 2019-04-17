

public class Card{

    private int value;
    private String suit;
    private String[];

    /**
	* Default empty Card constructor
	*/
	public Card(value, suit) {
        this.value = value;
        this.suit = suit;
	}

    //setters
    public void setValue(int value){
        this.value = value;
    }

    public void setSuit(String s){
        this.suit = s;
    }

    //getters
    public int getValue(){
        return this.value;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getFace(){

    }
}
