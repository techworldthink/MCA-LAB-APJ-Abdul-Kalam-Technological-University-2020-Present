total = int(input("Total number of even numbers : "))
sum=0
max = (total*2)+1
for i in range(2,max,2):
    sum=sum+i
avg = sum/total
print("Average is : ",avg)

