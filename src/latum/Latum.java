package latum;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import latum.content.*;

public class Latum extends Mod{

    public Latum(){
        Log.info("latuming");
    }

    @Override
    public void loadContent(){
        LUnitTypes.load();
    }

}
