package scenariosofjava;

public class Memory_Information {
    static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        System.out.println("Memory Information");
        System.out.println("Total Memory Available: "+r.totalMemory());
        System.out.println("Free Memory: "+r.freeMemory());
    }
}
