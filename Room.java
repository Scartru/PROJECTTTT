public class Room extends Definition {

    private int n;
    private int e;
    private int s;
    private int w;

    public Room(String name, String description, int n, int e, int s, int w, Door door){
        super(name, description);
        this.n= n;
        this.e= e;
        this.s= s;
        this.w= w;
    }

     public Room(String name, String description, int n, int e, int s, int w, Object Object){
        super(name, description);
        this.n= n;
        this.e= e;
        this.s= s;
        this.w= w;

    }
    public Room(String name, String description, int n, int e, int s, int w, Door door, Object Object){
        super(name, description);
        this.n= n;
        this.e= e;
        this.s= s;
        this.w= w;
        
    }
    

    public Room(String name, String description, int n, int e, int s, int w){
        super(name, description);
        this.n= n;
        this.e= e;
        this.s= s;
        this.w= w;
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
    
}
