package org.ucode.petshopProject;

public class Bird extends Pet {

    private String type;
    private boolean canTalk;
    private boolean canFly;

    public Bird(String type, boolean canTalk, boolean canFly) {
        this.type = type;
        this.canTalk = canTalk;
        this.canFly = canFly;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

}
