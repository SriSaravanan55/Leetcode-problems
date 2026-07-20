class Solution(object):
    def firstMissingPositive(self, nums):
        li=set()
        for i in nums:
            li.add(i)
        i=1
        for x in li:
                if i not in li:
                    return i        
                else:
                    i+=1
        return i 
