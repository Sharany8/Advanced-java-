public class StringPerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }
        endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;

        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");

        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is better for single-threaded performance.");
        } else {
            System.out.println("StringBuffer is better.");
        }
    }
}