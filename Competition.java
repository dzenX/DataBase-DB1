/**
 * Created by spide on 06.09.2017.
 */
public class Competition {
    private int id;
    private String type;
    private String name;

/**default constructor*/
    public Competition() {
        this.id = -1;
        this.type = "Undefined";
        this.name = "None";
    }
/**constructor with initialization*/
    public Competition(int _id, String _type, String _name) {
        this.id = _id;
        this.type = _type;
        this.name = _name;
    }

    public int getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }
}

