package com.cassandra.gossip;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MDHARMASENA on 9/8/2015.
 */
public class MainTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGet811() throws Exception {
        Main main = new Main();
        Assert.assertEquals("811s", main.Get811());
    }
}