package com.backend.handcart.inventory_service.service;

import com.backend.handcart.inventory_service.dto.InventoryResponse;
import com.backend.handcart.inventory_service.repository.InventoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    @Transactional
    public List<InventoryResponse> isInStock(List<String> skuCodeList) {
        return inventoryRepository.findBySkuCodeIn(skuCodeList).stream()
                .map(x -> {
                    return x.map(inventory -> InventoryResponse.builder()
                            .isInStock(inventory.getQuantity() > 0)
                            .skuCode(inventory.getSkuCode())
                            .build()).orElse(null);
                }).toList();
    }
}
