package Dog;

abstract class Dog {
    protected int position, averageLength;

    abstract void describe();

    protected Dog() {}

    protected Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
}
