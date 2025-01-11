package com.spaceOptimizer.models;

public class OptimizationResult {
    //    private List<StockSheet> stockSheets; // List of optimized stock sheets
    private StockSheet stockSheets; // List of optimized stock sheets
    private int totalWaste; // Total area wasted

    public StockSheet getStockSheets() {
        return stockSheets;
    }

    public void setStockSheets(StockSheet stockSheets) {
        this.stockSheets = stockSheets;
    }

    public int getTotalWaste() {
        return totalWaste;
    }

    public void setTotalWaste(int totalWaste) {
        this.totalWaste = totalWaste;
    }

    public OptimizationResult(StockSheet stockSheets, int totalWaste) {
        this.stockSheets = stockSheets;
        this.totalWaste = totalWaste;
    }
}