package com.company;
    import java.util.ArrayList;

    public class MyList<T extends Number> {
        private final ArrayList<T> arrayList;

        public MyList() {
            arrayList = new ArrayList<>();
        }

        public void add(T param) {
            arrayList.add(param);
        }

        public T getLargest() {
            T max = arrayList.get(0);
            for (T param : arrayList) {
                if (max.doubleValue() < param.doubleValue())
                    max = param;
            }
            return max;
        }

        public T getSmallest() {
            T min = arrayList.get(0);
            for (T param : arrayList) {
                if (min.doubleValue() > param.doubleValue())
                    min = param;
            }
            return min;
        }

        public String toString() {
            return "\nArrayList: " + arrayList + ";" +
                    "\nMinimum parameter is: " + getSmallest() + ";" +
                    "\nMaximum parameter is: " + getLargest() + ";";
        }
    }
