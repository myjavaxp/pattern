package com.yibo;

import com.yibo.framework.Container;
import com.yibo.framework.impl.ComponentContainer;
import org.junit.Test;

public class FrameworkTest {
    @Test
    public void testFrameWork() {
        Container container = new ComponentContainer();
        container.getIndexedClass("com.yibo");
    }
}
