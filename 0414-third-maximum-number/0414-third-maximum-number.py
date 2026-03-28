class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sorted_nums=sorted(set(nums),reverse=True)
        if len(sorted_nums) >= 3:
            result = sorted_nums[2]
        else:
            result = sorted_nums[0]
        return result
        