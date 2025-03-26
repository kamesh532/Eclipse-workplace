package JavaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStream {
    public static void main(String[] args) {
        List<String> testNames = new ArrayList<>();
        testNames.add("Login Test");
        testNames.add("Signup Test");
        testNames.add("Checkout Test");
        testNames.add("Profile Test");

        // Filter out tests that contain "Test"
        List<String> filteredTests = testNames.stream()
                //.filter(test -> test.contains("Test"))
                .collect(Collectors.toList());

        System.out.println("Filtered Tests: " + filteredTests);
    }
}

