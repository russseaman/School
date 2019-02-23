Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework2/ToyotaCorolla.csv", header=T, sep=",")
pricePet <- subset(Tcor, Tcor$Fuel_Type == "Petrol", select=c(Price))
priceDsl <- subset(Tcor, Tcor$Fuel_Type == "Diesel", select=c(Price))
priceCNG <- subset(Tcor, Tcor$Fuel_Type == "CNG", select=c(Price))

boxplot(pricePet,priceDsl, names=c("CNG","Diesel"))
