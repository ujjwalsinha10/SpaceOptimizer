package com.spaceOptimizer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class StockSheet {
    private int width;  // Width of the stock sheet
    private int height; // Height of the stock sheet
    private int usedArea; // Area used in the sheet so far
    private List<CutPiece> cutPieces; // List of cut pieces on this sheet
    private int remainingArea;

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

    public int getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(int usedArea) {
        this.usedArea = usedArea;
    }

    public List<CutPiece> getCutPieces() {
        return cutPieces;
    }

    public void setCutPieces(List<CutPiece> cutPieces) {
        this.cutPieces = cutPieces;
    }

    public int getRemainingArea() {
        return remainingArea;
    }

    public void setRemainingArea(int remainingArea) {
        this.remainingArea = remainingArea;
    }

    public StockSheet(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public void placePiece(CutPiece piece, float x, float y) {
        piece.setX(x);
        piece.setY(y);
        cutPieces.add(piece);
        usedArea += piece.getWidth() * piece.getHeight();
    }

}