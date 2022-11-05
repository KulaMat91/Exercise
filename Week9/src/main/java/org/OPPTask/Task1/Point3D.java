package org.OPPTask.Task1;

public class Point3D extends Point2D {
    private Double z;

    public Point3D(Double x, Double y, Double z) {
        super(x, y);
        this.z = z;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double[] getXYZ() {
        return new Double[]{super.getX(), super.getY(), z};
    }

    public void setYXZ(Double x, Double y, Double z) {
        super.setYX(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "( " + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
