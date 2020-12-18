a = int(input("Type the first number : "))
b = int(input("Type the second number : "))
while b != 0:
    r = a % b
    #print("R : ",r)
    a = b
    #print("A : ",a)
    b = r
    #print("B : ",b)
print("The GCD of the numbers is", a)
