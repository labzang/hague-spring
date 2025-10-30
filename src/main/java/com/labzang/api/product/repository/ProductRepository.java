package com.labzang.api.product.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.labzang.api.common.domain.Messenger;
import com.labzang.api.product.domain.ProductDTO;
import com.labzang.api.product.service.ProductService;

@Repository
public class ProductRepository {

    public Messenger save(ProductDTO product) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("DB 에 상품이 등록되었습니다.");
        return messenger;
    }

    public Messenger saveAll(List<ProductDTO> products) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("DB 에 상품이 등록되었습니다.");
        return messenger;
    }

    public Messenger update(ProductDTO product) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("DB 에 상품이 수정되었습니다.");
        return messenger;
    }

    public Messenger delete(String id) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("DB 에 상품이 삭제되었습니다.");
        return messenger;
    }

    public Messenger findById(String id) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("DB 에 상품이 조회되었습니다.");
        return messenger;
    }

    public Messenger findAll() {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("DB 에 상품이 조회되었습니다.");
        return messenger;
    }

}
