package com.junior_dev.PotionMarket.controller;

import com.junior_dev.PotionMarket.entity.Item;
import com.junior_dev.PotionMarket.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ItemController {

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    private final ItemService itemService;



    @GetMapping("/item/list")
    public String list(Model model) {
        List<Item> itemList = this.itemService.getList();
        model.addAttribute("itemList", itemList);
        return "itemList";
    }
}
