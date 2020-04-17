public class Main {
    public static void main(String[] args) {

        Integer[] nums = {-2, 0, 3, -5, 2, -1};

        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, Integer::sum);

        System.out.println(segmentTree);
    }
}
