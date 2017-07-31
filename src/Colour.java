public enum Colour {
        RED(15),
        GREEN(10),
        BLUE(5);

    int price;

    Colour(int price) {
        this.price = price;
    }

    public int getCost(){
        return (Colour.this.price);
    }

    public String toString() {
        return (Colour.this.name());
    }

    // dayMonth = geCost,
    // public Integer col() { return this.getCost != 0 ? this.getCost : this.getCost(); }
    }
