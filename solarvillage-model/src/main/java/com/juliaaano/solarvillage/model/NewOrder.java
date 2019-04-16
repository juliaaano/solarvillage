package com.juliaaano.solarvillage.model;

public class NewOrder implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String member;

    private String address;

    private boolean hoa;

    @Override
    public String toString() {
        return "{" + " member='" + member + "'" + ", address='" + address + "'" + ", hoa='" + hoa + "'" + "}";
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isHoa() {
        return hoa;
    }

    public void setHoa(boolean hoa) {
        this.hoa = hoa;
    }
    
}
