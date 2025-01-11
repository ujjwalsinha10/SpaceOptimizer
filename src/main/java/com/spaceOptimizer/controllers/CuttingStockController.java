package com.spaceOptimizer.controllers;

import com.itextpdf.io.exceptions.IOException;
import com.spaceOptimizer.models.CuttingStockRequest;
import com.spaceOptimizer.models.OptimizationResult;
import com.spaceOptimizer.services.CuttingStockOptimizer;
import com.spaceOptimizer.services.CuttingStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/optimizer")
public class CuttingStockController {
    private final CuttingStockOptimizer optimizer = new CuttingStockOptimizer();
    @Autowired
    private CuttingStockService cuttingStockService;

    @PostMapping("/optimize")
    public OptimizationResult optimize(@RequestBody CuttingStockRequest request) {
        return optimizer.optimize(request.getRequiredPieces(), request.getStockWidth(), request.getStockHeight());
    }

    @PostMapping("/generate-pdf")
    public String generateCuttingPlanPdf(@RequestBody CuttingStockRequest request) throws Exception {
        try {
            String outputPdfPath = cuttingStockService.createFile();
            cuttingStockService.generateCuttingPlanPdf(request.getRequiredPieces(), request.getStockWidth(),
                    request.getStockHeight(), outputPdfPath);
            return "PDF generated successfully at: " + outputPdfPath;
        } catch (IOException e) {
            return "Error generating PDF: " + e.getMessage();
        }
    }


}