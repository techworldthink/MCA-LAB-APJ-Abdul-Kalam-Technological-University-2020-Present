"""
4 Write a Python program to plot two or more lines on same plot
  with suitable legends of each line

"""

import matplotlib.pyplot as plt


x1 = [10,20,30]
y1 = [10,20,30]
plt.plot(x1, y1, label = "line 1")

x2 = [30,40,50]
y2 = [30,40,50]
plt.plot(x2, y2, label = "line 2")

plt.xlabel('x axis')
plt.ylabel('y axis')

plt.title('Two Line plot')

plt.legend()
plt.show()
