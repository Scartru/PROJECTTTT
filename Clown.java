import java.util.Random;

class Clown extends Person {
    
    private Random rand = new Random();

    public Clown(String name, Room room) { 
        super(name, room); 
    }
    /**
     * This randomly moves the clown to a room on the map
     * @param map the map that the player and clown exist on
     */
    public void moveRandomly(Map map){
       Direction[] dirs = Direction.values();
       Direction chosen = dirs[rand.nextInt(dirs.length)];
        moveTo( chosen, map);
    }

    /**
     * Overloading the method in person so that the clown does not print for every wall they run into
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
    return go;
}
}