package com.petdamall.petdamall2022.Mapper;

import com.petdamall.petdamall2022.Domain.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    public List<TestDTO> selectTest();
}
