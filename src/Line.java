public class Line {
    private final Point p1 = new Point();
    private final Point p2 = new Point();
    public void setP1(int x, int y){
        p1.set(x, y);
    }
    public void setP2(int x, int y){
        p2.set(x, y);
    }
    public double length(){
        int d1 = p2.getX()-p1.getX();
        int d2 = p2.getY()-p1.getY();
        return Math.sqrt(d1*d1+d2*d2);
    }
}
