package sample.structure.points.impenetrable;

import sample.structure.logic.ActionType;
import sample.structure.logic.StaticPoint;
import sample.structure.logic.TileColors;

import java.util.List;

import static sample.structure.logic.ActionType.NONE;

public class Wall extends StaticPoint {

    @Override
    public void tileColor() {
        super.tileColor = TileColors.WALL_COLOR;
    }

    @Override
    public void setActionList() {
        super.actionTypeList.add(NONE);
    }

    @Override
    public List<ActionType> getPossibleActions() {
        return super.actionTypeList;
    }

    @Override
    public boolean interact() {
        return false;
    }

    public Wall(int x, int y) {
        super(x, y);
    }
}
