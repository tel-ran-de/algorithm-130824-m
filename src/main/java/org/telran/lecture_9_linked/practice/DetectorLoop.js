
function detectLoop(head) {
    let set = new Set();
    while (head != null) {
        // If we have already has this node in hashmap it means their is a cycle
        if (set.has(head)) {
            return true;
        }
        // If we are seeing the node for the first time, insert it in hash
        set.add(head);
        head = head.next;
    }
    return false;
}