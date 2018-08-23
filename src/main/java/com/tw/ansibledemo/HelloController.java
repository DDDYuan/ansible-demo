package com.tw.ansibledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    private final ItemService itemService;

    @Autowired
    public HelloController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity hello() {
        return ResponseEntity.ok(itemService.getItemList());
    }
}
