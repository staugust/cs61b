package cn.augusto.cs61b.week1;

public class Exercise3 {
  public static int max(int[] m){
    int mx = Integer.MAX_VALUE+1;
    for(int i = 0; i < m.length; i++){
      if(m[i] > mx){
        mx = m[i];
      }
    }
    return mx;
  }
  public static void main(String[] args){
    int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
    System.out.println(max(numbers));
  }
}
