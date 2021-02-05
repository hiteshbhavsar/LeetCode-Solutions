# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

'''
Runtime: 20 ms, faster than 61.22% of Python online submissions for Swap Nodes in Pairs.
Memory Usage: 13.6 MB, less than 29.81% of Python online submissions for Swap Nodes in Pairs.
'''

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = p = ListNode(0)
        dummy.next = head
        while p.next and p.next.next:
            tmp = p.next.next   # store 2nd as temp
            p.next.next = tmp.next  # remove temp
            tmp.next = p.next   # point 2nd to 1st
            p.next = tmp    # point head to temp/2nd
            p = p.next.next # finish swaping one pair, proceed to the next
        return dummy.next
