package com.book.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.book.entity.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMapperTest {
//        @Autowired
    @Resource
    private TestMapper testMapper;

    @org.junit.Test
    public void insertTest() {
        Test user = new Test();
        user.setName("test1");
        testMapper.insert(user);
    }

    @org.junit.Test
    public void updateTest() {
        Test user=new Test();
        user.setId(92);
        user.setName("hhhhh");
        testMapper.updateById(user);
    }

    @org.junit.Test
    public void deleteTest(){
        testMapper.deleteById(new Integer(92));
    }

    @org.junit.Test
    public void selectTest(){
        Test user = testMapper.selectById(new Integer(91));
        System.out.println(user);

        QueryWrapper<Test> wrapper=new QueryWrapper<Test>();
//        wrapper.lt("id",92);
//        wrapper.gt("id",89);
        wrapper.le("id",92);
        wrapper.ge("id",89);
        List<Test> users = testMapper.selectList(wrapper);
        users.forEach(e-> System.out.println(e));
    }
}