package tasks3.task5;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < T; t++) {
            int Q = scanner.nextInt();
            scanner.nextLine();

            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            StringBuilder result = new StringBuilder();

            for (int q = 0; q < Q; q++) {
                String[] query = scanner.nextLine().split(" ");
                char operation = query[0].charAt(0);

                switch (operation) {
                    case 'a':
                        int x = Integer.parseInt(query[1]);
                        int y = Integer.parseInt(query[2]);
                        treeMap.put(x, y);
                        break;

                    case 'b':
                        int keyToFind = Integer.parseInt(query[1]);
                        int value = treeMap.getOrDefault(keyToFind, -1);
                        result.append(value).append(" ");
                        break;

                    case 'c':
                        int size = treeMap.size();
                        result.append(size).append(" ");
                        break;

                    case 'd':
                        int keyToRemove = Integer.parseInt(query[1]);
                        treeMap.remove(keyToRemove);
                        break;

                    case 'e':
                        for (Integer key : treeMap.keySet()) {
                            result.append(key).append(" ").append(treeMap.get(key)).append(" ");
                        }
                        break;
                }
            }

            System.out.println(result.toString().trim());
        }
        scanner.close();
    }
}
