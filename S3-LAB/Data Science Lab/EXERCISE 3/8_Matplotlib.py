"""
8. Write a Python programming to create a pie chart
   of the popularity of programming Languages.
   
Programming languages: Java Python PHP JavaScript C# C++
Popularity           : 22.2 17.6   8.8 8          7.7 6.7

"""

import matplotlib.pyplot as plt
import numpy as np

y = np.array([22.2,17.6,8.8,8,7.7,6.7])
mylabels = ["Java", "Python", "PHP", "JavaScript", "C#", "C++"]

plt.pie(y, labels = mylabels)
plt.show() 




