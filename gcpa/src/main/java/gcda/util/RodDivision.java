package gcda.util;

public class RodDivision {

	public static int divideRod(int[] values, int n){
        int[] r = new int[n+1];
        r[0] = 0;
        for (int j = 1; j <= n; j++) {
			int max = values[j];
			for (int i = 1; i < j; i++) {
				int tmp = values[i] + r[j-i];
				if (tmp > max) max = tmp;
			}
			r[j] = max;
		}
        /*for (int i = 1; i < n; i++) {
			System.out.println(r[i]);
		}*/
        return r[n];
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] values={0,1,3,3,5,5,10,8,3,10,10};
        int n=values.length-1;
        int[] answers = new int[values.length];
        for(int i=0;i<answers.length; i++)
            answers[i]=-1;
        System.out.println(divideRod(values, 3));
    }

}
