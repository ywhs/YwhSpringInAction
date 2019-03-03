package com.ywh.springinactiontest.section2;

import org.springframework.stereotype.Component;

/**
 * CreateTime: 2019-03-03 下午6:36
 * ClassName: SgtPeppers
 * Package: com.ywh.springinactiontest.section2
 * Describe:
 * 实现cd的接口类
 *
 * @author YWH
 */
@Component
public class SgtPeppers implements CompactDisc{

    private String title ="Sgt.Pepper's Lonely Hearts Clb Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
