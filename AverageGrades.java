public class AverageGrades {

  public static int[] average_grades(int grades[][], int weights[]) {
    int numberStudents = grades.length;
    int[] averages = new int[numberStudents];
    for (int i = 0; i < numberStudents; i++) {
      int total = 0;
      for (int j = 0; j < weights.length; j++) {
        total += grades[i][j] * weights[j];
      }
      averages[i] = total/100;
    }
    return averages;
  }
  public static void main(String[] args) {
    int[][] grades = {{51, 83, 28}, {0, 38, 95}};
    int[] weights = {30, 40, 30};
    int[] result = average_grades(grades, weights);

    for (int average : result) {
      System.out.println(average);
    }
  }
}
