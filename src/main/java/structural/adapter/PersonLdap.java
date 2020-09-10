package structural.adapter;

// Legacy
public class PersonLdap {

    private final int cn;
    private final String pName;
    private final String pOccupation;

    public PersonLdap(int cn, String pName, String pOccupation) {
        this.cn = cn;
        this.pName = pName;
        this.pOccupation = pOccupation;
    }

    public int getCn() {
        return cn;
    }

    public String getpName() {
        return pName;
    }

    public String getpOccupation() {
        return pOccupation;
    }

    @Override
    public String toString() {
        return "PersonLdap{" +
                "cn='" + cn + '\'' +
                ", pName='" + pName + '\'' +
                ", pOccupation='" + pOccupation + '\'' +
                '}';
    }
}
