package com.yibo.buiderpattern;

public class ActorController {
    public Actor construct(ActorBuilder actorBuilder){
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildSex();
        actorBuilder.buildType();
        if(!actorBuilder.isBareheaded()){
            actorBuilder.buildHairstyle();
        }
        return actorBuilder.createActor();
    }
}
