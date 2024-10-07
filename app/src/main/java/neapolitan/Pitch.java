package neapolitan;

class Pitch{





    //STATIC METHODS
    /**
     * 
     * @param str: The character representing the pitch class (ex: a, c) followed by any accidentals (s, f, or n). Accidentals can stack, so C double-sharp would be represented as "css".
     * @return
     * @throws NotRealAccidentalException: If the chars representing the accidentals aren't elements of [s,f,n]. Note that specifying n as an accidental won't do anything in this function.
     * @throws NotRealNoteException: If the char representing the pitch class isn't an element of [a,b,c,d,e,f,g]. Capital letters work, too.
     */
    public static int getPitchNum(String str) throws NotRealAccidentalException, NotRealNoteException{
        //get pitch without applying accidentals.
        int out = getPitchNum(str.charAt(0));
        //apply accidentals
        for (int i = 1; i < str.length(); i++){
            switch (Character.toLowerCase(str.charAt(i))) {
                case 's':
                    out += 1;
                    break;
                case 'b':
                    out -= 1;
                    break;
                case 'n': //do nothing if it's natural
                    break;
                default:
                    throw new NotRealAccidentalException(str.charAt(i) + " is not an element of [s,f,n]");
            }
        }
        return out;
    }
    /**
     * 
     * @param chr: The letter representing the pitch class. For example, a, b, and c. Sharps and flats are applied in the other overload of this method, which accepts a string.
     * @return An integer between 0 and 11 (inclusive). 
     */
    public static int getPitchNum(char chr) throws NotRealNoteException{
        switch (Character.toLowerCase(chr)){
            case 'c': return 0;
            case 'd': return 2;
            case 'e': return 4;
            case 'f': return 5;
            case 'g': return 7;
            case 'a': return 9;
            case 'b': return 11;
            default: throw new NotRealNoteException(chr + " is not an element of [a,b,c,d,e,f,g]");
        }
    }
    /**
     * Calculates the number of semitones between p1 and p2. The order of the arguments doesn't matter. Note that this returns the raw interval, not the compound interval.
     * @param p1: The first pitch.
     * @param p2: The second pitch.
     * @return: The number of semitones between p1 and p2.
     */
    public static int getInterval(Pitch p1, Pitch p2){

    }
    public static int getNextPitchClass()

    /**
     * Compares the frequencies of two pitches. This means that, for example, C#4 and Db4 would be considered equal.
     * @param p1: The first pitch. Order doesn't matter.
     * @param p2: The second pitch.
     * @return: Whether or not the frequencies of the two pitches are equal.
     */
    public static boolean frequals(Pitch p1, Pitch p2){
        return p1.getNoteInSemitones() == p2.getNoteInSemitones();
    }



    //FIELDS
    int octave;
    int pitchClass;


    //METHODS
    /**
     * 
     * @return An integer representing the number of semitones this note is above C0. This value is used to compare intervals between pitches,
     * because it's easier to use this than the actual frequencies of notes. This value is calculated as follows: (12 * this.octave) + this.pitchClass
     */
    public int getNoteInSemitones(){
        return (12 * octave) + pitchClass;
    }

    /**
     * Compares the frequencies of this pitch and another pitch. This means that, for example, C#4 and Db4 would be considered equal.
     * @param other: The other pitch, that this one will be compared to.
     * @return: Whether or not the frequencies of the two pitches are equal.
     */
    public boolean frequals(Pitch other){
        return this.getNoteInSemitones() == other.getNoteInSemitones();
    }




    //CONSTRUCTORS
    /**
     * 
     * @param pitchClass: The char representing the pitch class of the note ([a,b,c,d,e,f,g]) followed by relevant accidentals
     * @param octave: The integer representing the octave of the note. For example, Bb5 would have an octave of 5.
     */
    public Pitch(String pitchClass, int octave) throws NotRealNoteException, NotRealAccidentalException{
        this.pitchClass = Pitch.getPitchNum(pitchClass);
        this.octave = octave;
    }
}
