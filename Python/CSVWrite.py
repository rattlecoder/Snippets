import csv
import pandas as pd

f = open('new.csv', 'r')

reader = csv.reader(f)

people = []

for row in reader:
    people.append(row)

for item in people:
    print(item)

# print(people[0][1])   ->  Main Header

i, j = 2, 0
value = ""

while j < len(people[2]):
    if people[i][j] == 'Grades':
        value = people[i][j]
        break
    j = j + 1

i = 3

while j < len(people[3]):
    people[i][j] = value + "." + people[i][j]
    j = j + 1

print('//////////////////////////////////////////////////////////////////////')
for item in people:
    print(item)

# with open('file.csv', 'w', newline='') as f:
 #   writer = csv.writer(f)
  #  writer.writerow(people)

people.pop(0)
people.pop(0)
people.pop(0)


df = pd.DataFrame(people)
df.to_csv('fole2.csv', index=False, header=False)
