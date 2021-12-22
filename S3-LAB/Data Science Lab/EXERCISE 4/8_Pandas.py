"""
8. Given a dataframe, select first 2 rows and output them.

"""


import pandas as pd

details = {
    'Name' : ['a','b','c','d'],
    'Age' : [24,25,26,27],
}
  

df = pd.DataFrame(details)
  
print(df[:2])


