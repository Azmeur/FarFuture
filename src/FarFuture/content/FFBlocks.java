package FarFuture.content;

import arc.Core;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.util.*;
import mindustry.Vars;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class FFBlocks {
    public static Block 
        //productione
        siliconMeltdown;
    public static void load(){
        siliconMeltdown = new GenericCrafter("silicon-meltdown"){{
            requirements(Category.crafting, with(Items.lead, 350, Items.silicon, 450, Items.metaglass, 100, Items.thorium, 250, Items.plastanium, 200));
            size = 3;
            health = 700;
            squareSprite = false;
            hasLiquids = false;
            itemCapacity = 40;
            craftTime = 30f;
            outputItem = new ItemStack(Items.silicon, 11);
            consumePower(350f);
            consumeItems(ItemStack.with(Items.sand, 7, Items.pyratite, 2));
        }};
    }
}
