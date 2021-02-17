class Solution:
'''
Runtime: 16 ms, faster than 99.96% of Python3 online submissions for Implement strStr().
Memory Usage: 14.5 MB, less than 49.10% of Python3 online submissions for Implement strStr().
'''
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        return haystack.find(needle)
