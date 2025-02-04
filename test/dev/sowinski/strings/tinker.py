import matplotlib.pyplot as plt
import csv
import numpy

x = []
y1 = []
y2 = []

with open('output.csv', newline='') as csvfile:
  spamreader = csv.reader(csvfile, delimiter=',')
  # i = 0
  for row in spamreader:
    # i += 1
    x.append(int(row[0]))
    y1.append(int(row[1]))
    y2.append(int(row[2]))
    # if i == 100: break

x = x[0::250]
y1 = y1[0::250]
y2 = y2[0::250]

plt.xlabel("String Length")
plt.ylabel("Microseconds (0.000001 seconds)")

plt.plot(x, y1, label="Java String Reverse")
plt.plot(x, y2, label="Half Linear Reverse")

z1 = numpy.polyfit(x, y1, 1)
p1 = numpy.poly1d(z1)
plt.plot(x, p1(x), "r--", label="Java String Reverse Trend")

z1 = numpy.polyfit(x, y2, 1)
p1 = numpy.poly1d(z1)
plt.plot(x, p1(x), "g--", label="Half Linear Reverse Trend")

plt.legend()
plt.show()
