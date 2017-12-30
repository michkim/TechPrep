#Given a roman numeral, convert it to an integer.
#Input is guaranteed to be within the range from 1 to 3999.

class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        value,index = 0,0
        s_iter = iter(s)
        for c in s_iter:
            #print(' index:',index, 'c:', c)
            try:
                if(dict[c] < dict[s[index+1]]):
                    value += dict[s[index+1]] - dict[c]
                    #print('skipping ', index+1)
                    index+=2
                    next(s_iter, None)
                    continue
            except IndexError:
                pass
            value += dict[c]
            index+=1
        return value

s = Solution()
print(s.romanToInt("MCMXCVI"))
