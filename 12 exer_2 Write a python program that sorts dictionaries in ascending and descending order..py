dic={}
n1=int(input("Total number of elements in dict 1 : "))
for i in range(n1):
    dic[i]=input("Enter element : ")
#print(dic.items())
print(sorted(dic.items(), key = lambda kv:(kv[1], kv[0])))




"""asc=sorted(dic.values())
print(asc)
asc.reverse()
print(asc)"""




#print(sorted(dic.values()))
#print(type(sorted(dic.values())))
#print(type(dic.values()).re)
