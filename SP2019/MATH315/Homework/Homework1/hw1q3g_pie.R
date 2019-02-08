Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework1/ToyotaCorolla.csv", header=T, sep=",")

Ftable = table(Tcor[8])
class = unique(Tcor[8])

pct<- round(Ftable/sum(Ftable)*100,1)
class<-paste(class, pct)
class<-paste(class,"%",sep="")
pie(Ftable,labels=class, col=rainbow(length(class)),main="Piechart of Fuel Types for Toyota Corolla")

