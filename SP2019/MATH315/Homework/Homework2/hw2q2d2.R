Tcor = read.csv("C:/Users/russ_/Documents/Git/SCHOOL/SP2019/MATH315/Homework/Homework2/ToyotaCorolla.csv", header=T, sep=",")
boxplot(	Price~Fuel_Type,
		data=Tcor,
		main="Price of car based on fuel type",
		xlab="Price of car",
		ylab="Fuel Type",
		col="orange",
		border="brown",
		horizontal=TRUE
)
