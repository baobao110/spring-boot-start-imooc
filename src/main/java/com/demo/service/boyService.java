package com.demo.service;

import com.demo.domain.boy;
import com.demo.resporities.Resporsity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class boyService {

  @Autowired
  private Resporsity restore;

    @Transactional
    public void insertMore(){
      boy a=new boy();
      a.setSex('3');
      a.setName("eeeee");
      a.setAge(22);
      restore.save(a);
      boy b=new boy();
      b.setAge(12);
      b.setName("hh");
      b.setSex('r');
      restore.save(b);

    }
}
