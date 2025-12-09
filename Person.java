class Person {

    String name;
    Room room;

    public Person(String name, Room room) {
        this.name = name;
        this.room = room;
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
    int go = Direction.NOEXIT;

    switch (dir) {
        case NORTH -> go = r.getN();
        case EAST  -> go = r.getE();
        case SOUTH -> go = r.getS();
        case WEST  -> go = r.getW();
    }

    if (go != Direction.NOEXIT) {
        this.room = map.getRoom(go);
    }

    return go;
}

    
    }
