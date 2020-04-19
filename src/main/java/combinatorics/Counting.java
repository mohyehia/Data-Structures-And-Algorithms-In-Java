package combinatorics;
public class Counting {
	public static void main(String[] args) {
		char[] letters = {'B', 'C'};
		char[] answer = new char[3];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < 2; k++){
					answer[0] = letters[i];
					answer[1] = letters[j];
					answer[2] = letters[k];
					System.out.println(answer);
				}
			}
		}
	}
}
