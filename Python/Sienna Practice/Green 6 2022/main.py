import math

def clothing():
  numRestrictions = int(input())

  restrictions = []

  for i in range(numRestrictions):
    (color1, item1, color2, item2) = input().split()
    restrictions.append([color1, item1, color2, item2])

  if numRestrictions == 0:
    return 256

  else:
    return (math.factorial(16 - (numRestrictions * 2))) / (math.factorial(4) * ((10 - math.factorial(numRestrictions * 2)) - 4))
