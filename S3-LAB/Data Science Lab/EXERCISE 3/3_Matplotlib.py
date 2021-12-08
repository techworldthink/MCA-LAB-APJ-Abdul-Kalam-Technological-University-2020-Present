"""
3.  Write a Python program to draw a line using given axis values
    taken from a text file, with suitable 
    label in the x axis, y axis and a title

"""

import matplotlib.pyplot as plt

with open("3_data.txt") as f:
    data = f.read()
    
data = data.split('\n')

x = [row.split(' ')[0] for row in data]
y = [row.split(' ')[1] for row in data]
plt.plot(x, y)

plt.xlabel('x axis')
plt.ylabel('y axis')
plt.title('graph')
plt.show()
