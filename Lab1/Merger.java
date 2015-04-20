package Lab1;

public class Merger {
    // wrong
	public static int[] merge(int[] fst, int[] snd) {
		  int[] result = new int[fst.length + snd.length];
		  int fstIndex = 0;
		  int sndIndex = 0;
		  int resultIndex ;
		//  System.out.println(Arrays.toString(fst));
		//  System.out.println(Arrays.toString(snd));
		//  System.out.println(Arrays.toString(result));
		//  System.out.println();
		  while ((resultIndex = fstIndex + sndIndex) != result.length) {
		   if (fst[fstIndex] < snd[sndIndex]) {
		    result[resultIndex] = fst[fstIndex++];
		   } else {
		    result[resultIndex] = snd[sndIndex++];
		   }
		//   System.out.println(Arrays.toString(fst));
		//   System.out.println(Arrays.toString(snd));
		//   System.out.println(Arrays.toString(result));
		//   System.out.println();

		   if (fstIndex >= fst.length) {
		    System.arraycopy(snd, sndIndex, result, resultIndex,
		      snd.length - sndIndex);
		    break;
		   } else if (sndIndex >= snd.length) {
		    System.arraycopy(fst, fstIndex, result, resultIndex,
		      fst.length - fstIndex);
		    break;
		   }
		  }
		//  System.out.println(Arrays.toString(fst));
		//  System.out.println(Arrays.toString(snd));
		//  System.out.println(Arrays.toString(result));
		//  System.out.println();
		  return result;
		 }
	 public static void main(String[] args) {
		  merge(new int[] {3,7,10,11}, new int[] {1,2,5,6,8,9});
		 }
		}