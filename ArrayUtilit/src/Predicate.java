
public class Predicate {
    int type;

    public Predicate(int type) {
        this.type = type;
    }
    int getType(){
        return type;
    }
    
    int[] moreThan(int[] worker, int value) {
        int count = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] > value) {
                count++;
            }
        }
        int index = 0;
        int[] secondWorker = new int[count];
        for (int i = 0; i < count; i++) {
            if (worker[i] > value) {
                secondWorker[index] = worker[i];
                index++;
            }
        }

        return secondWorker;
    }

    int[] lessThan(int[] worker, int value) {
        int count = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] < value) {
                count++;
            }
        }
        int index = 0;
        int[] secondWorker = new int[count];
        for (int i = 0; i < count; i++) {
            if (worker[i] < value) {
                secondWorker[index] = worker[i];
                index++;
            }
        }
        return secondWorker;
    }

    int[] divadedOn(int[] worker, int value) {
        int count = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i] % value == 0) {
                count++;
            }
        }
        int index = 0;
        int[] secondWorker = new int[count];
        for (int i = 0; i < count; i++) {
            if (worker[i] % value == 0) {
                secondWorker[index] = worker[i];
                index++;
            }
        }
        return secondWorker;
    }

}
