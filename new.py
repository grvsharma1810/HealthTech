import csv
import matplotlib.pyplot as plt
import pandas as pd
l=[]
label=[]
reader = [row for row in csv.reader(open('C:\\Users\\AYUSH\\Downloads\\death.csv'))]
for row in reader :
    if reader.index(row) >14 :
        l.append(row[2])
        label.append(row[0])
print(l)
print(label)
for i in range(len(l)) :
    l[i]=int(l[i])
plt.pie(l,labels=label,autopct='%0.1f%%',radius=1.3)
plt.show()
plt.savefig('pie.png', bbox_inches="tight")
