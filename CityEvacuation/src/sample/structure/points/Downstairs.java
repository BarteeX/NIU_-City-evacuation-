package sample.structure.points;

import java.util.List;

public class Downstairs extends StaticPoint {
    @Override
    public void tileColor() {
        super.tileColor = TileColors.DOWNSTAIRS_COLOR;
    }

    @Override
    public void setActionList() {
        super.actionTypeList.add(ActionType.NONE);
        super.actionTypeList.add(ActionType.WALK_IN);
    }

    @Override
    public List<ActionType> getPossibleActions() {
        return super.actionTypeList;
    }

    public Downstairs(int x, int y) {
        super(x, y);
    }
}
