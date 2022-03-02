package corejavavolumn1.chapter6;

public class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        public Pair(double f, double s) {
            this.first = f;
            this.second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

//    public static Pair minMax(double[] d) throws Exception {
//        if (d.length < 2)
//            throw new Exception("数组小于2！");
//
//        Arrays.sort(d);
//        var max = d[0];
//        var min = d[d.length - 1];
//        return new Pair(max, min);
//    }

    public static Pair minMax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(max, min);
    }
}
