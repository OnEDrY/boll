package com.company;

public class Boll{

    private double x;
    private double y;

    public Boll(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public Boll()
    {

    }

    public double getX()
    {
        return this.x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return this.y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void move (double xDisp,double yDisp)
    {
        this.x = this.x + xDisp;
        this.y = this.y + yDisp;
    }

    @Override
    public String toString() {
        return String.format("Ball@(%d,%d)", (int)x, (int)y);
    }
}
