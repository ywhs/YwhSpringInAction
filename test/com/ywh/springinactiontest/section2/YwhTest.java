package com.ywh.springinactiontest.section2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CreateTime: 2019-03-03 下午6:17
 * ClassName: YwhTest
 * Package: com.ywh.springinactiontest
 * Describe:
 * spring第一个测试用例
 *
 * @author YWH
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 指定使用哪个配置类
@ContextConfiguration(classes = CDPlayerConfig.class)
public class YwhTest {


    @Autowired(required = false)
    private CompactDisc compactDisc;

    /**
     * 测试是否通过java的类注入了
     */
    @Test
    public void cdShouldNotNull(){
        System.out.println("11111");
        Assert.assertNotNull(compactDisc);
    }


}
