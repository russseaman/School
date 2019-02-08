Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework1/ToyotaCorolla.csv", header=T, sep=",")
Ftable = table(Tcor[8])
barplot(Ftable, main="Piechart of Fuel Types for Toyota Corolla", xlab="Types of gas")
