class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        // Keep merging until one list remains
        while (lists.length > 1) {

            int newSize = (lists.length + 1) / 2;
            ListNode[] mergedLists = new ListNode[newSize];

            int index = 0;

            for (int i = 0; i < lists.length; i += 2) {

                ListNode list1 = lists[i];

                ListNode list2 =
                        (i + 1 < lists.length)
                        ? lists[i + 1]
                        : null;

                mergedLists[index++] =
                        mergeLists(list1, list2);
            }

            lists = mergedLists;
        }

        return lists[0];
    }

    private ListNode mergeLists(
            ListNode list1,
            ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        if (list1 != null) {
            cur.next = list1;
        }

        if (list2 != null) {
            cur.next = list2;
        }

        return dummy.next;
    }
}