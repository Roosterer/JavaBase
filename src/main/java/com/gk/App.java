package com.gk;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BigDecimal b = new BigDecimal(8);
        b = b.setScale(2);
        System.out.println(b.toString());
        System.out.println( "Hello World!" );
        ByteBuffer.allocateDirect(1024*1012);
        ConcurrentHashMap cm = new ConcurrentHashMap();
        cm.put("","");

    }
}
