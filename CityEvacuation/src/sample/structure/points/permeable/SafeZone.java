package sample.structure.points.permeable;

import sample.structure.logic.ActionType;
import sample.structure.logic.StaticPoint;
import sample.structure.logic.Weight;
import sample.structure.map.CityMap;

import java.util.List;

import static sample.structure.logic.ActionType.NONE;
import static sample.structure.logic.ActionType.WALK_IN;
import static sample.structure.logic.TileColors.SAFE_ZONE_COLOR;

public class SafeZone extends StaticPoint {
    @Override
    public void tileColor() {
        super.tileColor = SAFE_ZONE_COLOR;
    }

    @Override
    public void setActionList() {
        super.actionTypeList.add(NONE);
        super.actionTypeList.add(WALK_IN);
    }

    @Override
    public List<ActionType> getPossibleActions() {
        return super.actionTypeList;
    }

    @Override
    public boolean interact() {
        return false;
    }

    public SafeZone(int x, int y, CityMap map) {
        super(x, y, Weight.SAFE_ZONE, map);
    }
}
