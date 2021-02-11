class Solution:
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        next_ans=''
        ans='1'
        cmp_var=ans[0]
        for j in range(1,n):
            count=1
            for i in range(1,len(ans)):
                if cmp_var==ans[i]:
                    count=count+1
                    continue
                else:
                    next_ans+=str(count)+cmp_var
                    cmp_var=ans[i]
                    count=1
            next_ans+=str(count)+cmp_var
            ans=next_ans
            next_ans=''
            cmp_var=ans[0]

        return ans
