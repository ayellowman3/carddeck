public class Deck{
    String[] suits = {'Spade', 'Heart', 'Club', 'Diamond'};
    card[] Cards = new card[52];

    public Deck(){
        newDeck();
    }

    private void newDeck(){
        int count = 0;
        for(s:suits){
            for(int i = 1; i <= 13; i++){
                Cards[count] = new Card(i,s);
                count++;
            }
        }
    }
}
