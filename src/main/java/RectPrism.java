public class RectPrism extends Rectangle{
    
    

    private int height;
    private int length; //this.length

    public RectPrism(int length, int width, int height) {
        //private not seen by the subclass
        super(length, width); //must come before all other code in the constructor
        // this.length = length;
        // this.width = width;
        this.height = height;
    }

    public void setSuperLength(int length) {
        super.length = length;
    }

    public int getSuperLength() {
        return super.length;
    }

    public int getThisLength() {
        return this.length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //area method already exists
    @Override
    public int area() {
        return this.height * this.width * this.length;
        //Yes i know this is volume
    }
}
