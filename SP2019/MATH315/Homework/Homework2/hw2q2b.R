Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework2/ToyotaCorolla.csv", header=T, sep=",")
price = Tcor$Price
mean(price)
median(price)
var(price)
sd(price)
quantile(price)
