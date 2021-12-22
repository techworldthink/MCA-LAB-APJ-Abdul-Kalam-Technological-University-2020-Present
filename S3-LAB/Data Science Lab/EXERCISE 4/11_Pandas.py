"""
11. Given is a dataframe showing Company Names (cname) and corresponding Profits 
(profit). Convert the values of Profit column such that values in it greater than 0 are 
set to True and the rest are set to False.


"""


import pandas as pd

details = {
    'cname' : ['a','b','c','d'],
    'profit' : [24,25,0,-27],
}

df = pd.DataFrame(details)

df.loc[df.profit <= 0,'profit'] = False
df.loc[df.profit > 0,'profit'] = True
print(df)

#df['profit'] = df['profit'].apply(lambda x:x>0)
#print(df)
