string = input("Enter a long string : ")
string=string.split(" ")
listed=[]
count=-1
all_count=[]
for i in string:
    if(i not in listed):
        listed.append(i)
print(listed)        
for i in listed:
    count=count+1
    all_count.append(0)
    for j in string:
        if(i == j):
            all_count[count] +=1; 
for i in range(len(listed)):
    print(listed[i], "  :  ",all_count[i])
print(all_count)





"""string = input("Enter a long string : ")
search = input("Enter searchble string : ")
string=string.split(" ")
count=0
for i in string:
    if(i == search):
        count=count+1
print(count)"""
