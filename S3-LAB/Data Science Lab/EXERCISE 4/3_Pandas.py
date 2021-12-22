"""
3. Given a dictionary, convert it into
corresponding dataframe and display it.

"""


import pandas as pd

details = {
    'Name' : ['a','b','c','d'],
    'Age' : [24,25,26,27],
}
  

df = pd.DataFrame(details)
  
print(df)
