package latum.content;

import mindustry.type.*;
import mindustry.ai.types.*;
import mindustry.annotations.*;
import mindustry.gen.*;

public class LUnitTypes{
    public static @Annotations.EntityDef({Unitc.class, Crawlc.class}) UnitType latum;
    
    public static void load(){
        latum = new UnitType("latum"){{
            health = 20000;
            armor = 12;
            hitSize = 48f;
            omniMovement = false;
            rotateSpeed = 1.7f;
            drownTimeMultiplier = 4f;
            drawCell = false;
            segments = 10;
            drawBody = false;
            crushDamage = 2f;
            aiController = HugAI::new;
            targetAir = false;
            
            segmentScl = 4f;
            segmentPhase = 5f;
            speed = 1f;
        }};
    }
}
