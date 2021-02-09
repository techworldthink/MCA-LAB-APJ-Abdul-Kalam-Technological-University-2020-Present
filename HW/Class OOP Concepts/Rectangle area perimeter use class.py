class rectangle:
    __width = 0
    __length = 0
    __area = 0
    __perimeter = 0
    def __init__(self,length,width):
        rectangle.__length = length
        rectangle.__width = width
    def calc_area(self):
        rectangle.__area = rectangle.__length*rectangle.__width
        print(rectangle.__area)
    def calc_perimeter(self):
        rectangle.__perimeter = 2*(rectangle.__length+rectangle.__width)
        print(rectangle.__perimeter)

while(True):
    length = int(input("Enter length of the rectangle : "))
    width = int(input("Enter width of the rectangle : "))
    obj = rectangle(length,width)
    opt = input("To find Area (a) \nTo find Perimeter (p) \noption  :: ")
    if opt=='a':
        obj.calc_area()
    elif opt=='p':
        obj.calc_perimeter()
    else:
        print("Options are wrong !!")

        
