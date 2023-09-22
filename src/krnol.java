import java.util.PropertyResourceBundle;
import java.util.Scanner;
public class krnol {
    static char[][] map;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = 0;
        Map();
        PrMap();
        while (true) {
            System.out.println("ХОДИТ ПЕРВЫЙ ИГРОК!");
            Pick1();
            if (CheckW()) {
                PrMap();
                System.out.println("ПОБЕДИЛ ПЕРВЫЙ ИГРОК!");
                break;
            }
            k++;
            if (k == 9){
                PrMap();
                System.out.println("НИЧЬЯ!");
                break;
            }
            PrMap();
            System.out.println("ХОДИТ ВТОРОЙ ИГРОК!");
            Pick2();
            if (CheckW()) {
                PrMap();
                System.out.println("ПОБЕДИЛ ВТОРОЙ ИГРОК!");
                break;
            }
            k++;
            if (k == 9) {
                PrMap();
                System.out.println("НИЧЬЯ!");
                break;
            }
            PrMap();
        }

    }
    public static void Map() {
        map = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = '*';
            }

        }
    }
    public static void PrMap() {
        for (int i = 0; i < 3; i++) {
            System.out.print("|" + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " " + "|" + " ");

            }
            System.out.println();
        }
    }
    public static boolean NN(int x, int y){
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            System.out.println("НЕПРАВИЛЬНЫЙ ХОД!");
            return false;
        }
        if (map[y][x] != '*') {
            System.out.println("НЕПРАВИЛЬНЫЙ ХОД!");
            return false;
        }
        return true;
    }
    public static void Pick1() {
        int x, y;
        do{
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!NN(x,y));
        map[x][y] = 'X';

    }
    public static void Pick2() {
        int x, y;
        do{
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!NN(x,y));
        map[x][y] = 'O';
    }
    public static boolean CheckW() {
        if (map[0][0] != '*' && map[0][0] == map[0][1] && map[0][1] == map[0][2]) return true;
        if (map[1][0] != '*' && map[1][0] == map[1][1] && map[1][1] == map[1][2]) return true;
        if (map[2][0] != '*' && map[2][0] == map[2][1] && map[2][1] == map[2][2]) return true;
        if (map[0][0] != '*' && map[0][0] == map[1][0] && map[1][0] == map[2][0]) return true;
        if (map[0][1] != '*' && map[0][1] == map[1][1] && map[1][1] == map[2][1]) return true;
        if (map[0][2] != '*' && map[0][2] == map[1][2] && map[1][2] == map[2][2]) return true;
        if (map[0][0] != '*' && map[0][0] == map[1][1] && map[1][1] == map[2][2]) return true;
        if (map[0][2] != '*' && map[0][2] == map[1][1] && map[1][1] == map[2][0]) return true;

        return false;
    }

}


