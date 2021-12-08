"""
1. Draw a line in a diagram from position (1, 3) to (2, 10) then to (6, 12) and finally to position 
(18, 20). (Mark each point with a beautiful green colour and set line colour to red and line style 
dotted)
"""
import matplotlib.pyplot as plt
import numpy as np

xpoints = np.array([1, 2, 6, 18])
ypoints = np.array([3, 10, 12, 20])

plt.plot(xpoints, ypoints,marker = 'o',color="red",mec = 'g', mfc = 'g',linestyle = 'dotted')
plt.show()
