package com.yibo;

import com.yibo.buiderpattern.Actor;
import com.yibo.buiderpattern.ActorBuilder;
import com.yibo.buiderpattern.ActorController;
import com.yibo.buiderpattern.AngelBuilder;
import com.yibo.utils.XMLUtil;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void testBuilder() {
        ActorBuilder actorBuilder = XMLUtil.getBean("angelBuilder", AngelBuilder.class);
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilder);
        System.out.println(actor);
    }

    @Test
    public void testEvilBuilder() {
        ActorBuilder actorBuilder = (ActorBuilder) XMLUtil.getBean("devilBuilder");
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilder);
        System.out.println(actor);
    }
}