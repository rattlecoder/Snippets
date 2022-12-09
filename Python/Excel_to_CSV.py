import csv
import pandas as pd

df = pd.read_excel('Excel.xlsx', sheet_name=['Before', 'After'])

x = df.get('Before')
y = df.get('After')

l = x.values.tolist()
ll = y.values.tolist()

#x.to_csv('before.csv', index=False, header=False)

print(x)
