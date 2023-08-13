package com.junior_dev.PotionMarket.repository;

import com.junior_dev.PotionMarket.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void testJpa() {

        //데이터 저장하기

        Item i1 = new Item();
        i1.setSubject("HP포션 3000원에 팝니다.");
        i1.setContent("HP포션 3000원에 팝니다. 비트즙과 탄산수와 설탕으로 만들었습니다.");
        i1.setPrice(3000);
        i1.setCreateDate(LocalDateTime.now());
        this.itemRepository.save(i1);

        Item i2 = new Item();
        i2.setSubject("MP포션 팜");
        i2.setContent("HP포션 5000원 팝니다. 내용물, 레몬즙, 블루레몬에이드, 물엿.");
        i2.setPrice(5000);
        i2.setCreateDate(LocalDateTime.now());
        this.itemRepository.save(i2);


        //findAll
        /**
         List<Item> all = this.itemRepository.findAll();
         assertEquals(2, all.size());

         Item i = all.get(0);
         assertEquals("HP포션 3000원에 팝니다.", i.getSubject());
         **/

        //findById
        /**
        Optional<Item> oq = this.itemRepository.findById(1L);
        if(oq.isPresent()) {
            Item i = oq.get();
            assertEquals("HP포션 3000원에 팝니다.", i.getSubject());
        }
        **/

        /**
        //findBySubject
        Item i = this.itemRepository.findBySubject("HP포션 3000원에 팝니다.");
        assertEquals(1, i.getId());
         **/

        /**
        //findBySubjectLike
        //sbb%: "sbb"로 시작하는 문자열
        //%sbb: "sbb"로 끝나는 문자열
        //%sbb%: "sbb"를 포함하는 문자열
        List<Item> qList = this.itemRepository.findBySubjectLike("HP%");
        Item i = qList.get(0);
        assertEquals("HP포션 3000원에 팝니다.", i.getSubject());
        **/

        //데이터 수정하기
        /**
        Optional<Item> oq = this.itemRepository.findById(1L);
        assertTrue(oq.isPresent());
        Item i = oq.get();
        i.setSubject("수정된 제목");
        this.itemRepository.save(i);
        **/

        //데이터 삭제하기
        /**
        assertEquals(2, this.itemRepository.count());
        Optional<Item> oq = this.itemRepository.findById(1L);
        assertTrue(oq.isPresent());
        Item q = oq.get();
        this.itemRepository.delete(q);
        assertEquals(1, this.itemRepository.count());
         **/
    }
}
