package sample.structure.points;

import java.util.List;

public class Wall extends StaticPoint {

    @Override
    public void tileColor() {
        super.tileColor = TileColors.WALL_COLOR;
    }

    @Override
    public void setActionList() {
        actionTypeList.add(ActionType.NONE);
    }

    @Override
    public List<ActionType> getPossibleActions() {
        return super.actionTypeList;
    }

    public Wall(int x, int y) {
        super(x, y);
    }
}
