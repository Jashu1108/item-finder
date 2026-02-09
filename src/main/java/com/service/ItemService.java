package com.service;

import com.entity.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private long currentId = 1;

    public Item addItem(Item item) {
        item.setId(currentId++);
        items.add(item);
        return item;
    }

    public Optional<Item> getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}
