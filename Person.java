class Person {

    String name;
    Room room;
    //Constructor sets up name and room attributes
    public Person(String name, Room room) {
        this.name = name;
        this.room = room;
    }
    //Overloaded constructor sets up name attribute
    public Person(String name){
        this.name = name;
    }
    /*
    /Accessor that returns the name of person
     */
    public String getName() {
        return name;
    }

    /**
     * This is a manipulator that sets the person's name to the input
     * @param name This is the string that the user inputs
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is an accessor that returns the room value of this class when called
     * @return room This returns the current room value for this class
     */
    public Room getRoom(){
        return this.room;
    }

    /**
     * This is a manipulator that takes in a room to set a new value to
     * @param room this is the room that will be doing the replacing
     */
    public void setRoom( Room room){
        this.room = room;
    }

    /**
     * This allows the player to move in a certain direction based on where he is on the map
     * @param dir this is the direction that the player is moving in
     * @param map this is the map that the player movement will be applied to
     * @return int an integer to signal whether that spot on the map is occupied or not
     */
    public int moveTo(Direction dir, Map map) {
    Room r = this.room;
    int go = -1;
    // System.out.println("HIIII PERSON");
    switch (dir) {
        case NORTH -> go = r.getN();
        case EAST  -> go = r.getE();
        case SOUTH -> go = r.getS();
        case WEST  -> go = r.getW();
    }

    if (go != -1) {
        r = map.getRoom(go);
        this.setRoom(r);
        // System.out.println(this.room);
        return go;
    }

    System.out.println("You can't move in this direction.");
    return go;
}

    
    }
