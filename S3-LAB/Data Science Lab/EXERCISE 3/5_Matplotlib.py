"""
5. Write a Python program to create multiple plots.

"""

import matplotlib.pyplot as plt

figure, axis = plt.subplots(2,2)


x1 = [10,20,30]
y1 = [10,20,30]
axis[0, 0].plot(x1, y1)
axis[0, 0].set_title("Plot 1")

x2 = [10,10,10]
y2 = [30,40,50]
axis[0, 1].plot(x2, y2)
axis[0, 1].set_title("Plot 2")

plt.show()



