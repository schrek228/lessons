package hw4.task3;

class Cat {

    String name;
    String color;
    int mass;

    public Cat(String name, String color, int mass) {
        this.name = name;
        this.color = color;
        this.mass = mass;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        Cat cat = (Cat) o;
        return name.equals(cat.name) && color.equals(cat.color);
    }

    @Override
    public String toString() {
        return "Name:" + " " + name + " color: " + " " + color + " mass: " + mass;
    }

}
