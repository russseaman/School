Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework2/ToyotaCorolla.csv", header=T, sep=",")
price = Tcor$Price
boxplot(price, main="Price of Toyota Corolla", ylab="Price of car", xlab="All Corollas purchased")
