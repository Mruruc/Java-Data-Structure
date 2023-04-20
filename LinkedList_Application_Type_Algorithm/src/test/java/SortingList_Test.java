import com.mruruc.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SortingList_Test {

    static Stream<Arguments> testData() {
        List<Integer> unsortedData = new Random().ints(100, 0, 100).boxed().collect(Collectors.toList());
        List<Integer> sortedAscending = unsortedData.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedDescending = unsortedData.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        return Stream.of(
                Arguments.of(unsortedData, sortedAscending, "ASCENDING", "mergeSort"),
                Arguments.of(unsortedData, sortedAscending, "ASCENDING", "bubbleSort"),
                Arguments.of(unsortedData, sortedDescending, "DESCENDING", "mergeSort"),
                Arguments.of(unsortedData, sortedDescending, "DESCENDING", "bubbleSort")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testSorting(List<Integer> unsortedData, List<Integer> sortedData, String sortOrder, String sortMethod) {
        SortingList<Integer> sortingList = new SortingList<>();

        for (Integer value : unsortedData) {
            sortingList.addLast(value);
        }

        Comparator<Integer> comparator = sortOrder.equals("ASCENDING") ? null : Comparator.reverseOrder();
        sortingList.setComparator(comparator);

        if (sortMethod.equals("mergeSort")) {
            sortingList.mergeSort();
        } else {
            sortingList.bubbleSort();
        }

        for (Integer sortedValue : sortedData) {
            assertEquals(sortedValue, sortingList.head.data);
            sortingList.removeFirst();
        }
    }
}
