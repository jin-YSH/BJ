

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		int[][] map = new int[19][19];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int y = 0; y < 19; y++) {
			String[] input = br.readLine().split(" ");
			for (int x = 0; x < 19; x++) {
				map[y][x] = Integer.parseInt(input[x]);
			}
		}

		int answer = 0;
		int anX = 0;
		int anY = 0;
		int temp = 0;
		int gosize = 19;
		int[] dx = { 0, 1, 1, 1 };
		int[] dy = { 1, 0, 1, -1 };

		for (int y = 0; y < 19; y++) {
			for (int x = 0; x < 19; x++) {
				if (map[y][x] == 0)
					continue;
				temp = map[y][x];

				for (int i = 0; i < 4; i++) {
					int nx = x;
					int ny = y;
					int count = 1;
					if (ny - dy[i] >= 0 && ny - dy[i] < gosize && nx - dx[i] >= 0 && nx - dx[i] < gosize
							&& map[ny - dy[i]][nx - dx[i]] == temp) {
						continue;
					}
					for (int d = 1; d <= 6; d++) {
						nx += dx[i];
						ny += dy[i];

						if (nx >= 0 && nx < gosize && ny >= 0 && ny < gosize) {
							if (map[ny][nx] == temp) {
								count++;
								// System.out.println(count);

							} else if (map[ny][nx] != temp) {
								break;
							}

						} else
							break;
					}
					if (count == 5) {
						System.out.println(temp);
						System.out.println((y + 1) + " " + (x + 1));
						return;
					}
				}

			}
		}
		System.out.println(answer);
	}

}
