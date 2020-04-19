package org.ucode.petshopProject;

public class Fish extends Pet{

    private String swimmingStyle;
    private boolean isExotic;
    private String type;

    public Fish(String swimmingStyle, boolean exotic, String type) {
        this.swimmingStyle = swimmingStyle;
        this.isExotic = exotic;
        this.type = type;
    }

    public String getSwimmingStyle() {
        return swimmingStyle;
    }

    public void setSwimmingStyle(String swimmingStyle) {
        this.swimmingStyle = swimmingStyle;
    }

    public boolean isExotic() {
        return isExotic;
    }

    public void setExotic(boolean exotic) {
        this.isExotic = exotic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
