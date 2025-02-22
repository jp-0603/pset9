
public class ProblemSet9 {

    public int[] evenOdd(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] answer = new int[arr.length];
        int even = 0;
        int odd = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                answer[even] = arr[i];
                even++;
            } else {
                answer[odd] = arr[i];
                odd--;
            }
        }
        return answer;
    }

    public int[] notAlone(int[] arr, int alone) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == alone && arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                if (arr[i + 1] >= arr[i - 1]) {
                    arr[i] = arr[i + 1];
                } else {
                    arr[i] = arr[i - 1];
                }
            }
        }
        return arr;
    }

    public int[] shiftLeft(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return arr;
        }
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        return arr;

    }

    public int[] fillIn(int start, int end) {
        if (start > end) {
            return null;
        }
        int[] answer = new int[end - start];
        int counter = 0;

        for (int i = start; i <= end - 1; i++) {
            answer[counter] = i;
            counter++;
        }
        return answer;
    }

    public boolean triple(int[] arr) {
        if (arr == null) {
            return false;
        }
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                counter++;
            }
        }
        if (counter == 3) {
            return true;
        }
        return false;
    }

    public int pairs(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - b[i]) > 0 && Math.abs(a[i] - b[i]) < 3) {
                count++;
            }
        }
        return count;
    }

    public boolean twentyFour(int[] arr) {
        if (arr == null) {
            return false;
        }
        boolean two = false;
        boolean four = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i] == arr[i + 1]) {
                two = true;
            }
            if (arr[i] == 4 && arr[i] == arr[i + 1]) {
                four = true;
            }
        }
        if (two == true && four == true) {
            return false;
        } else if (two == false && four == true) {
            return true;
        } else if (two == true && four == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean fourteen(int[] arr) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public int centeredAverage(int[] arr) {
        if (arr == null || arr.length < 3) {
            return -1;
        }
        int largeInd = 0;
        int smallInd = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallInd]) {
                smallInd = i;
            }
            if (arr[i] > arr[largeInd]) {
                largeInd = i;
            }
        }

        int total = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j == largeInd || j == smallInd) {

            } else {
                total += arr[j];
            }
        }
        int average = total / ((arr.length) - 2);
        return average;
    }

    public int outliers(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        int largeInd = 0;
        int smallInd = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[smallInd]) {
                smallInd = i;
            }
            if (arr[i] > arr[largeInd]) {
                largeInd = i;
            }
        }
        int answer = arr[largeInd] - arr[smallInd];
        return answer;
    }
}