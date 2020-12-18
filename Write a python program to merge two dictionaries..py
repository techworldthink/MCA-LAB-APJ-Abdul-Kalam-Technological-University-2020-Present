dict1={}
dict2={}
dict3={}
n1=int(input("Total number of elements in dict 1 : "))
for i in range(n1):
    dict1[i]=input("Enter element : ")
n2=int(input("Total number of elements in dict 2 : "))
for i in range(i+1,i+n2+1):
    dict2[i]=input("Enter element : ")
print(dict1)
print(dict2)
dict3 ={**dict1,**dict2}
print(dict3)
