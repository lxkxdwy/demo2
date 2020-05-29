package com.example.demo.service;

import com.example.demo.entity.TOrder;

import java.util.List;

public interface ItOrderService {

    public  int  insertToder(TOrder tOrder);

    public List<TOrder> selectAll ();
}
