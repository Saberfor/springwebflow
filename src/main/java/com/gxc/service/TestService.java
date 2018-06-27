package com.gxc.service;

import com.gxc.bean.Test;
import com.gxc.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Test> getList() {
        return testMapper.getList();
    }
}
