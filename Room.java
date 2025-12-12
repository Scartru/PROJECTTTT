public class Room extends Definition {

    private int n;
    private int e;
    private int s;
    private int w;
    private String object;
    private Door door;
    private Boolean hasDoor = false;

    /**
     * This is the constructor for room
     * @param name this is the name of the room
     * @param description this is the description of the room
     * @param n this is the north value of this room which shows whether it is a space that the player can move to or not
     * @param e this is the east value of this room which shows whether it is a space that the player can move to or not
     * @param s this is the south value of this room which shows whether it is a space that the player can move to or not
     * @param w this is the west value of this room which shows whether it is a space that the player can move to or not
     * @param object this is the object that is contained within the room
     */
    public Room(String name, String description, int n, int e, int s, int w, String object){
        super(name, description);
        this.n= n;
        this.e= e;
        this.s= s;
        this.w= w;
        this.object= object;

    }

    /**
     * This is the overloaded constructor which adds a door attribute
     *  @param name this is the name of the room
     * @param description this is the description of the room
     * @param n this is the north value of this room which shows whether it is a space that the player can move to or not
     * @param e this is the east value of this room which shows whether it is a space that the player can move to or not
     * @param s this is the south value of this room which shows whether it is a space that the player can move to or not
     * @param w this is the west value of this room which shows whether it is a space that the player can move to or not
     * @param object this is the object that is contained within the room
     * @param door this is the door that is contained within the rom 
     */
    public Room(String name, String description, int n, int e, int s, int w, String object, Door door){
        super(name, description);
        this.n= n;
        this.e= e;
        this.s= s;
        this.w= w;
        this.object = object;
        this.door = door;
        this.hasDoor = true;
        
    }

    /**
     * This is an accessor that returns the int direction value north of the current room
     * @return int this is the int value that is used to determine if the player can move in this direction 
     */
    public int getN() {
        return n;
    }

    /**
     * This is the setter that sets the int value (expressing if it is moveable or not) in the north direction
     * @param n this is the int value that the n vaue is being set to
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * This is an accessor that returns the int direction value east of the current room
     * @return int this is the int value that is used to determine if the player can move in this direction
     */
    public int getE() {
        return e;
    }

    /**
     * This is the setter that sets the int value (expressing if it is moveable of not) in the east direction
     * @param e this is the int value that the e value is being set to
     */
    public void setE(int e) {
        this.e = e;
    }

    /**
     * This is an accessor that returns the int direction value south ot the current room
     * @return int this is the int value that is used to determine if the player can move in this direction
     */
    public int getS() {
        return s;
    }

    /**
     * This is the setter that sets the int value (expressing is it is moveable or not) in the south direction
     * @param s this is the int value that the s value is being set to
     */
    public void setS(int s) {
        this.s = s;
    }

    /**
     * This is an accessor that returns the int direction value west of the current room
     * @return int this is the int value that is used to determine if the player can move in this direction
     */
    public int getW() {
        return w;
    }

    /**
     * This is the setter that sets the int value (expressing if it is moveable to or not) in the west direction
     * @param w this is the int value that the west direction is being sest to 
     */
    public void setW(int w) {
        this.w = w;
    }
    
    /**
     * This adds an object to the room
     * @param object This is the object that is being added to the room
     */
    public void addObject(String object){
        this.object = object;
    }

    /**
     * This is an accessor that returns the object that is in the room
     * @return object this returns the object that is in the room
     */
    public String getObject() {
        return object;
    }

    /**
     * This sets the object to "", effectively removing it from the room
     * @param object this is the object that is being removed
     */
    public void removeObject(String object){
        this.object = "";
    }

    /**
     * This is an accessor that returns the door atrtibute of the room
     * @return door the door that is within the room attributes
     */
    public Door getDoor(){
        return door;
    }

    /**
     * This converts the abstract object nature of this class to a string name that is legible
     */
    @Override
    public String toString(){
        return super.getName();
    }

    /**
     * This checks whether or not this room has a door
     * @return boolean, depends on whether of not the room was initialized with a door value set to true or false
     */
    public Boolean getHasDoor() {
        return hasDoor;
    }

}
