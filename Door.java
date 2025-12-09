class Door extends Definition{
    private String color;
    private String direction;
    private Boolean isLocked;

    public Door(String name, String description, String color, String direction, String returnDirection) {
        super(name, description); 
        this.color = color;
        this.direction = direction;
        this.isLocked = true;
    }

    public String getColor() {
        return color;   
    }

    public boolean isLocked() {
        return isLocked; 
    }

    public void unlock() { 
        isLocked = false; 
    }

    Door redDoor = new Door("Red", "Red Door", "mysterious", "North", "South");
    Door greenDoor = new Door("Green", "Green Door", "weird door","South", "North");
    Door blueDoor = new Door("Blue", "Blue Door", "cool door", "East", "West");
}