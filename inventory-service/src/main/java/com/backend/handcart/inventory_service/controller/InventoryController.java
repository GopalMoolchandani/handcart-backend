package com.backend.handcart.inventory_service.controller;

import com.backend.handcart.inventory_service.dto.InventoryResponse;
import com.backend.handcart.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestBody List<String> skuCodeList) {
        return inventoryService.isInStock(skuCodeList);
    }
}
