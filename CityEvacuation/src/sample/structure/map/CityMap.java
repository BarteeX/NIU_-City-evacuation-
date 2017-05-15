package sample.structure.map;

import javafx.scene.paint.Color;
import sample.structure.logic.StaticPoint;

import java.io.Serializable;

public class CityMap {
    private StaticPoint[][][] cityMap;

    public void addPoint(int layers, StaticPoint point) {
        cityMap[layers][point.getY()][point.getX()] = point;
    }

    public StaticPoint getPoint(int x, int y, int layers) {
        if(x < 0 || y < 0 || layers < 0) {
            throw new IllegalArgumentException("In CityMap while adding element size was wrong");
        } else {
            return cityMap[layers][y][x];
        }
    }

    public StaticPoint[][][] getMap() {
        return cityMap;
    }

    public int getNumberOfLayers() {
        return cityMap.length;
    }

    public int getHeight() {
        return cityMap[0].length;
    }

    public int getWidth() {
        return cityMap[0][0].length;
    }

    public int[] getSize() {
        return new int[]{getWidth(), getHeight(), getNumberOfLayers()};
    }

    public Color getPointColor(int x, int y, int layer) {
        return cityMap[layer][y][x].getTileColor();
    }


    private void setCityMap(int width, int height, int layers) {
        if(width < 0 || height < 0 || layers < 0) {
            throw new IllegalArgumentException("In CityMap while setting map size, size was wrong");
        } else {
            cityMap = new StaticPoint[layers][height][width];
        }
    }



    public CityMap(int width, int height, int layers) {
        setCityMap(width, height, layers);
    }
}
