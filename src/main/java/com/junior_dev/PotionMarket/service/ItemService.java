package com.junior_dev.PotionMarket.service;

import com.junior_dev.PotionMarket.entity.Item;
import com.junior_dev.PotionMarket.exception.DataNotFoundException;
import com.junior_dev.PotionMarket.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getList() {
        return this.itemRepository.findAll();
    }

    public Item getItem(Long id) {
        Optional<Item> item = this.itemRepository.findById(id);
        if (item.isPresent()) {
            return item.get();
        }
        else {
            throw new DataNotFoundException("item not found");
        }
    }

}
