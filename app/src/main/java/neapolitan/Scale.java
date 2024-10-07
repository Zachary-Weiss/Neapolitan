package neapolitan;

public class Scale {
    public static Pitch[] scaleOf(Pitch tonic, char mode){
        
    }


    //FIELDS
    public Pitch[] pitches;
    public Pitch tonic;
    public char mode;

    //PRIVATE METHODS
    private Pitch[] buildMajorScale(Pitch tonic){
        
    }

    /**
     * Constructor that accepts a collection of pitches and a mode. The first pitch in the array is assumed to be the tonic, and the array is assumed to be in order of ascending pitch. Ex: [C,D,E,F,G,A,B]
     * @param pitches: The collection of pitches that make up this scale. Element 0 should be the tonic, and it should be in ascending order.
     * @param mode: The mode of the scale. M is ionian, m is aolian.
     */
    public Scale(Pitch[] pitches, char mode){
        this.pitches = pitches;
        this.mode = mode;
        this.tonic = pitches[0];
    }
    public Scale(Pitch tonic, char mode){

    }
}
