package com.junior_dev.PotionMarket.repository;

import com.junior_dev.PotionMarket.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findBySubject(String subject);
    List<Item> findBySubjectLike(String subject);
}
