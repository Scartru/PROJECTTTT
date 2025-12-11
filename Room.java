public class Room extends Definition {

    private int n;
    private int e;
    private int s;
    private int w;
    private String object;
    private Door door;
    private Boolean hasDoor = false;


    public Room(String name, String description, int n, int e, int s, int w, String object){
        super(name, description);
        this.n= n;
        this.e= e;
        this.s= s;
        this.w= w;
        this.object= object;

    }
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

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
    
    public void addObject(String object){
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void removeObject(String object){
        this.object = "";
    }

    public Door getDoor(){
        return door;
    }


    @Override
    public String toString(){
        return super.getName();
    }

    public Boolean getHasDoor() {
        return hasDoor;
    }


}
