public class Definition {

    protected String name;
    protected String description;

    /**
     * Definition constructor that assigns a name and description
     * @param name
     * @param description
     */
    public Definition(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * @return name assigned
     */
    public String getName() {
        return name;
    }

    /**
     * @param name value that is set to name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return description assigned
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description value that is set to description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
