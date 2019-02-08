Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework1/ToyotaCorolla.csv", header=T, sep=",")

price = Tcor[,3]
nclass = 10
Range = max(price)-min(price)
cwidth = ceiling(Range/nclass)

bins = seq(min(price)-0.5,max(price)+0.5,by=cwidth)

priceCut = cut(price,bins)

freq_table = table(priceCut)

transform(freq_table)

cbind(freq_table,Rel_Freq=prop.table(table(priceCut)),Cum_Freq=cumsum(table(priceCut)))

hist(price, main='Toyota Corolla Prices',xlab="Price of Car",ylab="Frequcey Purchased",col="red",ylim=c(0,600))
