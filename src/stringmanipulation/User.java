package stringmanipulation;

public class User {
    private String fName;
    private String lName;
    private String initial;
    
public User(String fName, String lName, String initial){
    this.fName = fName;
    this.lName = lName;
    this.initial = initial;
}

    @Override
    public String toString() {
        return "StringManipulation{" + "\nfName=" + fName + ", \nlName=" + lName + ", \ninitial=" + initial + '}';
    }

    
}
