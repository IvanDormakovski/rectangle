import java.util.ArrayList;
import java.util.Arrays;

public class RectangleHelper {

    int getCountRectangle(int[][] coordinates) {
        int countRectangle = 0;

        // получение массива с уникальными координатами, так так достаточно одной точки с одними координатами.
        // Дубликаты заменяем на null
        int[][] uniqueCoordinates = coordinates;
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = i + 1; j < coordinates.length; j++) {
                if (Arrays.equals(coordinates[i], coordinates[j])) {
                    uniqueCoordinates[i] = null;
                }
            }
        }

        //Удаляем null из массива
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] array : uniqueCoordinates) {
            if (array != null) {
                list.add(array);
            }
        }
        uniqueCoordinates = list.toArray(new int[list.size()][2]);

        // В цикле берутся две координаты(point1 и point2) и создаются две противоположные координы(search1 и search2),
        // так как это недостающие координаты для построения прямоугольника. В следующем цикле происходит поиск недостающих
        // координат с игнорированием(point1 и point2). Инкрементирум countRectangle, если есть совпадния координат.
        // countRectangle / 2 так как 2 диаганали составляют один прямоугольник.
        for (int i = 0; i < uniqueCoordinates.length; i++) {
            for (int j = i + 1; j < uniqueCoordinates.length; j++) {
                int[] point1 = uniqueCoordinates[i];
                int[] point2 = uniqueCoordinates[j];

                int[] search1 = {point1[0], point2[1]};
                int[] search2 = {point2[0], point1[1]};

                int tempCount = 0;
                for (int k = 0; k < uniqueCoordinates.length; k++) {
                    if (!Arrays.equals(point1, search1) & !Arrays.equals(point1, search2) & !Arrays.equals(point2, search1) & !Arrays.equals(point2, search2)) {
                        if (Arrays.equals(search1, uniqueCoordinates[k]) | Arrays.equals(search2, uniqueCoordinates[k])) {
                            tempCount++;
                        }
                    }
                }
                if (tempCount >= 2) {
                    countRectangle++;
                }
            }
        }
        return countRectangle / 2;
    }
}
