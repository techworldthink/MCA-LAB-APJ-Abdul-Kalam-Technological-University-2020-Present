"""
10. Given a dataframe with NaN Values, fill the NaN values with 0.

"""


import pandas as pd
import numpy as np

nums = {'Set_of_Numbers': [2, 3, 5, 7, 11, 13,np.nan, 19, 23, np.nan]}
df = pd.DataFrame(nums, columns =['Set_of_Numbers'])
df['Set_of_Numbers'] = df['Set_of_Numbers'].fillna(0)
print(df)

