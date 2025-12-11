class Person {

    String name;
    Room room;

    public Person(String name, Room room) {
        this.name = name;
        this.room = room;
    }
    
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Room getRoom(){
        return this.room;
    }

    public void setRoom( Room room){
        this.room = room;
    }

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

    System.out.println("Can't move!");
    return go;
}

    
    }
