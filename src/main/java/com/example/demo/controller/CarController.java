package com.example.demo.controller;

import com.example.demo.entity.TOrder;
import com.example.demo.service.ItOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")


public class CarController {


    @Autowired
    ItOrderService itOrderService;




    @GetMapping("/order")
  public  int   order (TOrder tOrder){
      int i = itOrderService.insertToder(tOrder);
      return  i;

  }



    @GetMapping("/selectAll")
    public  List<TOrder>  selectAll (){
            itOrderService.selectAll();
        return   itOrderService.selectAll();

    }




}
