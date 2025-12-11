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

}