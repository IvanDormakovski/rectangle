public class Runner {
    public static void main(String[] args) {
        RectangleHelper rectangleHelper = new RectangleHelper();
        int[][] coordinates = { {1,1}, {7,1}, {1,4}, {1,5}, {7,4}, {7,5}, {7,5} };   // количество 3
//        int[][] coordinates = { {2,3}, {5,4}, {7,1}, {1,4}, {2,4}, {5,3}, {7,4}, {1,1}, {3,6}, {5,5}, {3,5}, {5,6} };   // количество 3
//        int[][] coordinates = { {2,3}, {5,4}, {7,1}, {2,4}, {5,3} };   // количество 1
//        int[][] coordinates = { {2,3}, {5,4} };   // количество 0
//        int[][] coordinates = { {2,3}, {5,4}, {7,1}, {1,4}, {2,4}, {5,3}, {7,4}, {1,1}, {3,6}, {5,5}, {3,5}, {5,6}, {5,6}, {5,5}, {10,11}, {7,4}, {8,8}, {7,8}, {8,4} };  // количество 4
        System.out.println(rectangleHelper.getCountRectangle(coordinates));
    }
}
