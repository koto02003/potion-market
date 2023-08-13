package com.junior_dev.PotionMarket.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDateTime;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column
    private Integer price;

    @CreatedDate
    private LocalDateTime createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public Integer getPrice() {
        return price;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }


}

