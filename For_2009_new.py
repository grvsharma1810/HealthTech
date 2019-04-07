import pandas as pd
import numpy as np
import matplotlib
import matplotlib.ticker as ticker
from matplotlib import pyplot as plt
import csv

data = [row for row in csv.reader(open("t.csv"))]
l=[]
name=[]
for row in data:
    for col in row :
        i=data.index(row)
        j=row.index(col)
        if i>=1 :
            if(col=='01.01.2011') :
                l.append(data[i][j+2])
                name.append(data[i][1])
                break
for i in range(len(l)):
    l[i]=int(l[i])
plt.xlabel("Number of beds")
plt.plot(l,name)
plt.show()
