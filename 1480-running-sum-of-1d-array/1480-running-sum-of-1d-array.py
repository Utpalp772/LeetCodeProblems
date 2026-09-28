class Solution(object):
    def runningSum(self, nums):
      runningSum = nums[0]
      for i in range(1,len(nums)):
        runningSum += nums[i]
        nums[i] = runningSum
       
      return nums    
        
        