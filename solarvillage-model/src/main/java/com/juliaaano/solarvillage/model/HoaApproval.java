package com.juliaaano.solarvillage.model;

public class HoaApproval implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean approved;

    private String comments;

    @Override
    public String toString() {
        return "{" + " approved='" + isApproved() + "'" + ", comments='" + getComments() + "'" + "}";
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

}