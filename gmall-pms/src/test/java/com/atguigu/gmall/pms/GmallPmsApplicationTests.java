package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.AlbumService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    AlbumService albumService;

    @Autowired
    ProductService productService;

    @Test
    void contextLoads() {
        Product product = productService.getById(1);
        System.out.println(product.getName());
    }
     //测试主从分离
    @Test
    void contextLoads1() {
       /* Album album = new Album();
        album.setName("阿飞鸭");
        boolean save = albumService.save(album);
        System.out.println();*/
        System.out.println(albumService.getById(1));

    }

}
