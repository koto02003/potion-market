package com.junior_dev.PotionMarket.service;

import com.junior_dev.PotionMarket.entity.Item;
import com.junior_dev.PotionMarket.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getList() {
        return this.itemRepository.findAll();
    }
}
