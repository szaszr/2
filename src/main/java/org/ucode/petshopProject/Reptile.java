package org.ucode.petshopProject;

public class Reptile extends Pet {
    private boolean coldBlooded;
    private String type;
    private String crawlingStyle;

    public Reptile(boolean coldBlooded, String type, String crawlingStyle) {
        this.coldBlooded = coldBlooded;
        this.type = type;
        this.crawlingStyle = crawlingStyle;
    }

    public boolean isColdBlooded() {
        return coldBlooded;
    }

    public void setColdBlooded(boolean coldBlooded) {
        this.coldBlooded = coldBlooded;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCrawlingStyle() {
        return crawlingStyle;
    }

    public void setCrawlingStyle(String crawlingStyle) {
        this.crawlingStyle = crawlingStyle;
    }

}
