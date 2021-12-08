package com.petdamall.petdamall2022;

import com.petdamall.petdamall2022.Domain.TestDTO;
import com.petdamall.petdamall2022.Mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void testOfSelect(){
        List<TestDTO> testDBSelect = testMapper.selectTest();
        for(TestDTO testDTO : testDBSelect){
            System.out.println("========");
            System.out.println(testDTO.getSungjinBabo());
            System.out.println("========");
        }
    }
}
