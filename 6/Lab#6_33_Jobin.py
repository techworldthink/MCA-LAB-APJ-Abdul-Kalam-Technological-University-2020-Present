import pymongo


client=pymongo.MongoClient("mongodb://localhost:27017/")
db=client["college"]
mycol=db["studlist"]

print("1. Display name (both fname and lname) and mark of all female students in MCA department\n")
for x in mycol.find({"gender":{"$eq":"female"},"course":{"$eq":"MCA"}},{"name":1,"mark":1,"_id":0}):
   print(x['name']['fname'] + " "+ x['name']['lname'] + "   : " + str(x['mark']))
print("__________________________________________________________________\n")

print("2. Display the details of student who secured highest mark in the course MCA\n")
mydoc = mycol.find({"course":{"$eq":"MCA"}},{"_id":0}).sort("mark",-1).limit(1)
for x in mydoc:
    print(x)

print("__________________________________________________________________\n")

print("3. Display all male students who secured A+ grade\n")
for y in mycol.find({"gender":{"$eq":"male"},"grade":{"$eq":"A+"}},{"name":1,"_id":0}):
   print(y['name']['fname']+" "+y['name']['lname'])
print("__________________________________________________________________\n")



print("4. Display the names of the top three students in Mechanical department\n")

mydoc = mycol.find({"course":{"$eq":"Mechanical"}},{"name":1,"_id":0}).sort("mark",-1).limit(3)
for y in mydoc:
       print(y['name']['fname']+" "+y['name']['lname'])
print("__________________________________________________________________\n")


print("5. Display the details of female students [fname,lname,grade,mark,contact] who achieved a mark more than 90\n")
for x in mycol.find({"gender":{"$eq":"female"},"mark":{"$gt":90}},{"_id":0}):
   print(x['name']['fname']+" "+x['name']['lname'])
   print(x['grade'] + "   "+ str(x['mark']))
   print(x['phone']['type']+" : "+str(x['phone']['no']))
   print("\n")
print("__________________________________________________________________\n")


print("6. Display the details of students who secured mark, more than 80 but less than 90\n")
for x in mycol.find({"mark" : { "$gt" : 80, "$lt" : 90}},{"_id":0}):
   print(x)
print("__________________________________________________________________\n")




print("7. Display the details of students whose name starts with ‘V’\n")
for x in mycol.find({"name.fname" : { '$regex': '^V', '$options': 'i' }}, {"_id":0}):
   print(x)
print("__________________________________________________________________\n")



print("8. Display all students from Kollam\n")
for y in mycol.find({ "address.city": { "$eq": "Kollam" } },{"_id":0}):
   print(y['name']['fname']+" "+y['name']['lname'])
print("__________________________________________________________________\n")


print("9.Display all students who does not belong to neither Kollam nor Thiruvananthapuram\n")
for y in mycol.find({"$and": [{"address.city": {"$ne":"Kollam"}},{"address.city":{"$ne":"Thiruvananthapuram"}}]},{"_id":0}):
    print(y['name']['fname']+" "+y['name']['lname'])
print("__________________________________________________________________\n")


print("10. Display all female students who belong to either Kollam or Thiruvananthapuram\n")
for y in mycol.find({"$or": [{"address.city": {"$eq":"Kollam"}},{"address.city":{"$eq":"Thiruvananthapuram"}}],"gender":{"$eq":"female"}},{"_id":0}):
    print(y['name']['fname']+" "+y['name']['lname'])
print("__________________________________________________________________")





