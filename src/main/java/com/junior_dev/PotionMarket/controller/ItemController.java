package com.junior_dev.PotionMarket.controller;

import com.junior_dev.PotionMarket.entity.Item;
import com.junior_dev.PotionMarket.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    private final ItemService itemService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Item> itemList = this.itemService.getList();
        model.addAttribute("itemList", itemList);
        return "itemList";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        Item question = this.itemService.getItem(id);
        model.addAttribute("question", question);
        return "item_detail";
    }
}
