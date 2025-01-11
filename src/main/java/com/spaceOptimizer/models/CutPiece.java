package com.spaceOptimizer.models;

public class CutPiece {
    private int width;   // Width of the cut piece
    private int height;  // Height of the cut piece
    private int quantity; // Number of pieces needed
    private float x;  // X coordinate on the sheet
    private float y;  // Y coordinate on the sheet

    public CutPiece(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}