"""
5. Given a CSV file, read it into a dataframe and display it.

"""


import pandas as pd

df = pd.read_csv('5_Pandas.csv')

print(df.to_string()) 
