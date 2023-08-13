package com.junior_dev.PotionMarket.controller;

import com.junior_dev.PotionMarket.entity.Item;
import com.junior_dev.PotionMarket.repository.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ItemController {

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    private final ItemRepository itemRepository;



    @GetMapping("/item/list")
    public String list(Model model) {
        List<Item> itemList = this.itemRepository.findAll();
        model.addAttribute("itemList", itemList);
        return "itemList";
    }
}
