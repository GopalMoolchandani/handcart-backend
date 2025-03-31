package com.backend.handcart.inventory_service.repository;

import com.backend.handcart.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long > {
    List<Optional<Inventory>> findBySkuCodeIn(List<String> skuCodeList);
}
