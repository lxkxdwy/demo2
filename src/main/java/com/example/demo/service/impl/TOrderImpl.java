package com.example.demo.service.impl;

import com.example.demo.dao.TOrderMapper;
import com.example.demo.entity.TOrder;
import com.example.demo.service.ItOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOrderImpl implements ItOrderService {

    @Autowired
    TOrderMapper tOrderMapper;

    @Override
    public List<TOrder> selectAll() {
        tOrderMapper.selectAll();
        return tOrderMapper.selectAll();
    }


    @Override
    public int insertToder(TOrder tOrder) {

        System.out.println(tOrder.getAmount());
        System.out.println(tOrder.getId());
        System.out.println(tOrder.getOrderId());
        System.out.println(tOrder.getOrderStatus());


        int i = tOrderMapper.insert(tOrder);
        return i;
    }



}
