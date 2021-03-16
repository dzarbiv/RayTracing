package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

public class Plane {
    protected Point3D q0;
    protected Vector normal;

    public Plane(Point3D q0, Vector normal) {
        this.q0 = q0;
        this.normal = normal;
    }
    public Plane(Point3D q0, Point3D q1, Point3D q2) {
        this.q0=q2;
        this.normal=null;
    }

    public Point3D getQ0() {
        return q0;
    }

    public Vector getNormal() {
        return normal;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Plane)) return false;
        Plane other = (Plane)obj;
        return this.q0.equals(other.q0) && this.normal.equals(other.normal);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "q0=" + q0.toString() +
                ", normal=" + normal.toString() +
                '}';
    }
}
