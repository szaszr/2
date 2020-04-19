package org.ucode.homework3;

class Student {
    String name;
    int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Student(String name, int height) {
        this.name = name;
        this.height = height;

    }
}