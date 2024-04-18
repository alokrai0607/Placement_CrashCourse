package Day01Assignment;

public class ElectronicDevice {
}

public class HandheldDevice extends ElectronicDevice {
}

public interface Smartphone {
}

public interface Tablet {
}

public class HybridDevice extends HandheldDevice implements Smartphone, Tablet {
}

public class Main {
    public static void main(String[] args) {
        HybridDevice hybridDevice = new HybridDevice();

        System.out.println("HybridDevice is an electronic device");

        System.out.println("HybridDevice is a handheld device");

        System.out.println("HybridDevice has smartphone features");

        System.out.println("HybridDevice has tablet features");
    }
}

