package by.it._examples_.jd01_07.matrixOk;
@SuppressWarnings("all")
public class MatrixCreator {
        public static void fillRandomized(Matrix t, int start, int end) {
            int v = t.getVerticalSize();
            int h = t.getHorizontalSize();
            for(int i = 0; i < v; i++) {
                for(int j = 0; j < h; j++) {
                    try {
                        int value = (int)(Math.random() * (end - start) + start);
                        t.setElement(i, j, value);
                    } catch (MatrixException e) {
                      /* exception невозможен, поэтому обработка отсутствует */
                    }
                }
            }
        }
// public void fillFromFile(Matrix1 t, File f) { /* код*/ }
// public void fillFromStream(Matrix1 t, InputStream input) { /* код*/ }
// public void fillFromDataBase(Matrix1 t, Connection conn) { /* код*/ }
}
