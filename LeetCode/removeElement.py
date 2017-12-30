##Given an array and a value, remove all instances of that value in-place and return the new length.
##Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
##The order of elements can be changed. It doesn't matter what you leave beyond the new length.

def removeElement(nums, val):
    """
    :type nums: List[int]
    :type val: int
    :rtype: int
    """
    end = len(nums) - 1
    for i,n in enumerate(nums):
        while(nums[end] == val):
            end -= 1
            if(end <= 0):
                break
            #print('end:',end)
        
        if(end <= i):
            break
        if(n == val):
            nums[i],nums[end] = nums[end], nums[i]
        #print (','.join(map(str,nums)))

##    return end+1
    end = 0
    for n in nums:
        if(n == val):
            break
        end+=1

    return end
print(removeElement([3,2,2,3],3))
print(removeElement([5,3,1,3,2,3,3,0,7],3))
print(removeElement([3,3,3,3],3))
print(removeElement([],3))
print(removeElement([1],1))
print(removeElement([4,5],4))
