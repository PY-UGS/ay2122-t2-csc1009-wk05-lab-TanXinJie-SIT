package Inheritance;

import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private Boolean filled;
    private Date dateCreated = new Date();
    
    public GeometricObject(){}
    
    public GeometricObject(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    
    public Boolean getFilled() {
        return filled;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    
    public String getProperties(){
        return String.format("created on %s \ncolor: %s and filled: %b", this.getDateCreated(), this.getColor(), this.getFilled());
    }
}
