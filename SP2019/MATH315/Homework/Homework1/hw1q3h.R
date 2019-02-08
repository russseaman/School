Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework1/ToyotaCorolla.csv", header=T, sep=",")

price = Tcor[,3]
age = Tcor[,4]

plot(age, price, main="Scatterplot for Price vs Age", xlab='Age',ylab = 'Price', xlim = c(0,max(age)+5), ylim = c(3000,max(price)+ 10),type='p')

