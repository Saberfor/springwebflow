package com.gxc.mapper;

import com.gxc.bean.Test;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface TestMapper {

    List<Test> getList();
}
