"""
6. Given a dataframe, sort it by multiple columns.

"""


import pandas as pd

df = pd.DataFrame({'Name': ['e','a','a','b','c','d'],
                   'Age': [1,2,1,3,3,4],
                   'Rank': [0,1,2,3,4,5]})

print(df.to_string())

print('SORTED DATAFRAME')
df = df.sort_values(by=['Name','Age'], ascending=[True,True])

print(df.to_string())
