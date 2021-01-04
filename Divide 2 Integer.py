class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        x=dividend/divisor
        if x>2147483647 or x<-2147483648:
            return 2147483647
        if x>=0:
            return int(x)
        else:
            if dividend%divisor!=0:
                return math.floor(x+1)
            else:
                return math.floor(x)
