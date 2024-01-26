candies=[1,2,3]
extraCandies=2
list=[]
for candy in candies:
        if candy + extraCandies> max(candies):
            list.append(True)
        else:
            list.append(False) 
print(list)