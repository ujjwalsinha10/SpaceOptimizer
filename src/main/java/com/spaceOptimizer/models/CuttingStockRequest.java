package com.spaceOptimizer.models;

import lombok.Data;

import java.util.List;

public class CuttingStockRequest {
    private int stockWidth;
    private int stockHeight;
    private List<CutPiece> requiredPieces;

    public CuttingStockRequest(int stockWidth, int stockHeight, List<CutPiece> requiredPieces) {
        this.stockWidth = stockWidth;
        this.stockHeight = stockHeight;
        this.requiredPieces = requiredPieces;
    }

    public int getStockWidth() {
        return stockWidth;
    }

    public void setStockWidth(int stockWidth) {
        this.stockWidth = stockWidth;
    }

    public int getStockHeight() {
        return stockHeight;
    }

    public void setStockHeight(int stockHeight) {
        this.stockHeight = stockHeight;
    }

    public List<CutPiece> getRequiredPieces() {
        return requiredPieces;
    }

    public void setRequiredPieces(List<CutPiece> requiredPieces) {
        this.requiredPieces = requiredPieces;
    }

    public CuttingStockRequest() {
    }
}