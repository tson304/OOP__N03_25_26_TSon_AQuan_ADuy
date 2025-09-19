package Username.src;

public class Identity {
    private String idNumber;

    public Identity(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return idNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Identity)) return false;
        Identity other = (Identity) obj;
        return idNumber.equals(other.idNumber);
    }
}